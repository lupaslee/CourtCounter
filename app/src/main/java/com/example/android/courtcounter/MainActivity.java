package com.example.android.courtcounter;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int statTripleA = 0;
    int statTripleB = 0;
    int statDobleA = 0;
    int statDobleB = 0;
    int statFreeThrowA = 0;
    int statFreeThrowB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshDisplayScore();
        refreshStats(0);
    }

    public void refreshStats(int point) {


        Resources res = getResources();
        if (point == 3) {
            String statString = res.getString(R.string.stat_display_triples);
            String textStatics = String.format(statString, statTripleA, statTripleB);
            TextView text = findViewById(R.id.statics_dispay);
            text.setText(textStatics);
        } else if (point == 2) {
            String statString = res.getString(R.string.stat_display_2_point);
            String textStatics = String.format(statString, statDobleA, statDobleB);
            TextView text = findViewById(R.id.statics_dispay);
            text.setText(textStatics);
        } else if (point == 1) {
            String statString = res.getString(R.string.stat_display_freethrow);
            String textStatics = String.format(statString, statFreeThrowA, statFreeThrowB);
            TextView text = findViewById(R.id.statics_dispay);
            text.setText(textStatics);
        } else if (point == 0) {
            String statString = res.getString(R.string.stat_display_play);
            String textStatics = String.format(statString);
            TextView text = findViewById(R.id.statics_dispay);
            text.setText(textStatics);

        }

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


    /*Add 3 point team A
    * increase tripleA statics*/
    public void pointTreeA(View view) {

        scoreA = scoreA + 3;
        statTripleA = statTripleA + 1;
        refreshDisplayScore();
        refreshStats(3);
    }

    /*Add 2 point team A*/
    public void pointTwoA(View view) {

        scoreA = scoreA + 2;
        statDobleA = statDobleA + 1;
        refreshDisplayScore();
        refreshStats(2);
    }

    public void pointFreeA(View view) {

        scoreA = scoreA + 1;
        statFreeThrowA = statFreeThrowA + 1;
        refreshDisplayScore();
        refreshStats(1);
    }

    /*Add 3 point team B*/
    public void pointTreeB(View view) {

        scoreB = scoreB + 3;
        statTripleB = statTripleB + 1;
        refreshDisplayScore();
        refreshStats(3);

    }

    /*Add 2 point team B*/
    public void pointTwoB(View view) {

        scoreB = scoreB + 2;
        statDobleB = statDobleB + 1;
        refreshDisplayScore();
        refreshStats(2);
    }

    public void pointFreeB(View view) {

        scoreB = scoreB + 1;
        statFreeThrowB = statFreeThrowB + 1;
        refreshDisplayScore();
        refreshStats(1);
    }

    public void resetAll(View view) {

        scoreA = 0;
        scoreB = 0;
        statTripleA = 0;
        statTripleB = 0;
        statDobleA = 0;
        statDobleB = 0;
        statFreeThrowA = 0;
        statFreeThrowB = 0;
        refreshDisplayScore();
        refreshStats(0);
    }



}
