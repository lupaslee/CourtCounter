package com.example.android.courtcounter;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static int scoreA;
    public static int scoreB;
    public static int statTripleA;
    public static int statTripleB;
    public static int statDobleA;
    public static int statDobleB;
    public static int statFreeThrowA;
    public static int statFreeThrowB;
    public static int statStatus;

    static {
        scoreA = 0;
        scoreB = 0;
        statTripleA = 0;
        statTripleB = 0;
        statDobleA = 0;
        statDobleB = 0;
        statFreeThrowB = 0;
        statFreeThrowA = 0;
        statStatus = 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshDisplayScore();
        refreshStats(statStatus);
    }


    /**
     * Refresh Stats View
     * Change string statString to show statics of last point.
     *
     * @param point stat to be shown
     *              1-> free trows
     *              2-> Two points
     *              3-> triples
     *              0-> show "let's play" message
     *              any other do nothing
     */
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
    * increase 3 point team A statics*/
    public void pointTreeA(View view) {
        scoreA = scoreA + 3;
        statStatus = 3;
        statTripleA = statTripleA + 1;
        refreshDisplayScore();
        refreshStats(statStatus);
    }

    /*  Add 2 point team A*
      *  increase  2 point team A*/
    public void pointTwoA(View view) {

        scoreA = scoreA + 2;
        statDobleA = statDobleA + 1;
        statStatus = 2;
        refreshDisplayScore();
        refreshStats(statStatus);
    }

    /*  Add 1 point team A*
    *  increase  1 point team A
    */
    public void pointFreeA(View view) {

        scoreA = scoreA + 1;
        statFreeThrowA = statFreeThrowA + 1;
        statStatus = 1;
        refreshDisplayScore();
        refreshStats(statStatus);
    }

    /*  Add 3 point team B*
     *  increase  3 point team B  */
    public void pointTreeB(View view) {

        scoreB = scoreB + 3;
        statTripleB = statTripleB + 1;
        statStatus = 3;
        refreshDisplayScore();
        refreshStats(statStatus);
    }

    /*  Add 2 point team B*
     *  increase  2 point team B  */
    public void pointTwoB(View view) {

        scoreB = scoreB + 2;
        statDobleB = statDobleB + 1;
        statStatus = 2;
        refreshDisplayScore();
        refreshStats(statStatus);
    }

    /*  Add 2 point team B*
     *  increase  2 point team B  */
    public void pointFreeB(View view) {

        scoreB = scoreB + 1;
        statFreeThrowB = statFreeThrowB + 1;
        statStatus = 1;
        refreshDisplayScore();
        refreshStats(statStatus);
    }

    /*Reset all data - Set all to zero
    * and refresh all displays
    */
    public void resetAll(View view) {

        scoreA = 0;
        scoreB = 0;
        statTripleA = 0;
        statTripleB = 0;
        statDobleA = 0;
        statDobleB = 0;
        statFreeThrowA = 0;
        statFreeThrowB = 0;
        statStatus = 0;
        refreshDisplayScore();
        refreshStats(0);
    }


}
