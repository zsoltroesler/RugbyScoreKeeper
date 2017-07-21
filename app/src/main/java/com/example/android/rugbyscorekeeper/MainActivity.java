package com.example.android.rugbyscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // initial scores
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

        // points for team A
        Button fivePointsA = (Button) findViewById(R.id.button_five_teamA);
        fivePointsA.setOnClickListener(new View.OnClickListener() {
            // 5 points added for team A
            @Override
            public void onClick(View view) {
                scoreA += 5;
                displayForTeamA(scoreA);
            }
        });

        Button threePointsA = (Button) findViewById(R.id.button_three_teamA);
        threePointsA.setOnClickListener(new View.OnClickListener() {
            // 3 points added for team A
            @Override
            public void onClick(View view) {
                scoreA += 3;
                displayForTeamA(scoreA);
            }
        });

        Button twoPointsA = (Button) findViewById(R.id.button_two_teamA);
        twoPointsA.setOnClickListener(new View.OnClickListener() {
            // 2 points added for team A
            @Override
            public void onClick(View view) {
                scoreA += 2;
                displayForTeamA(scoreA);
            }
        });

        // points for team B
        Button fivePointsB = (Button) findViewById(R.id.button_five_teamB);
        fivePointsB.setOnClickListener(new View.OnClickListener() {
            // 5 points added for team B
            @Override
            public void onClick(View view) {
                scoreB += 5;
                displayForTeamB(scoreB);
            }
        });

        Button threePointsB = (Button) findViewById(R.id.button_three_teamB);
        threePointsB.setOnClickListener(new View.OnClickListener() {
            // 3 points added for team B
            @Override
            public void onClick(View view) {
                scoreB += 3;
                displayForTeamB(scoreB);
            }
        });

        Button twoPointsB = (Button) findViewById(R.id.button_two_teamB);
        twoPointsB.setOnClickListener(new View.OnClickListener() {
            // 2 points added for team B
            @Override
            public void onClick(View view) {
                scoreB += 2;
                displayForTeamB(scoreB);
            }
        });

        // reset scores for both teams
        Button reset = (Button) findViewById(R.id.button_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            // counts set back to zero
            @Override
            public void onClick(View view) {
                displayForTeamA(scoreA = 0);
                displayForTeamB(scoreB = 0);
            }
        });
    }

    // display the count for team A
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.text_team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    // display the count for team B
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.text_team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
}
