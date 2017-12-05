package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Suma equipo A*/
    public void pointTreeA(View view) {

        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void pointTwoA(View view) {

        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void pointFreeA(View view) {

        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    /*suma equipo B*/
    public void pointTreeB(View view) {

        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void pointTwoB(View view) {

        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void pointFreeB(View view) {

        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }


}
