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
        refreshDisplayScore();
    }

    /**
     * Refresh display of both teams.
     */
    public void refreshDisplayScore() {

        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }


    /*Add 3 point team A*/
    public void pointTreeA(View view) {

        scoreA = scoreA + 3;
        refreshDisplayScore();
    }

    /*Add 2 point team A*/
    public void pointTwoA(View view) {

        scoreA = scoreA + 2;
        refreshDisplayScore();
    }

    public void pointFreeA(View view) {

        scoreA = scoreA + 1;
        refreshDisplayScore();
    }

    /*Add 3 point team B*/
    public void pointTreeB(View view) {

        scoreB = scoreB + 3;
        refreshDisplayScore();
    }

    /*Add 2 point team B*/
    public void pointTwoB(View view) {

        scoreB = scoreB + 2;
        refreshDisplayScore();
    }

    public void pointFreeB(View view) {

        scoreB = scoreB + 1;
        refreshDisplayScore();
    }


}
