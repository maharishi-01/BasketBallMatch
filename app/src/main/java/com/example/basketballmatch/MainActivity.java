package com.example.basketballmatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number=0;
    int number2=0;
    String massage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** code for team A
     *
     * @param view
     */

    public void addThree(View view) {
        number=number+3;
        displayScore(number);

    }

    public void addTwo(View view) {
        number=number+2;
        displayScore(number);
    }

    public void addZero(View view) {
        number += 0;
        displayScore(number);
    }
    public void displayScore(int number){
        TextView name=(TextView)findViewById(R.id.score);
        name.setText(""+number);
    }


    /** code for team B
     *
     * @param view
     */
    public void addThreeofB(View view) {
        number2+=3;
        displayScoreForTeamB(number2);

    }

    public void addTwoofB(View view) {
        number2+=2;
        displayScoreForTeamB(number2);
    }

    public void addZeroofB(View view) {
        number2+=0;
        displayScoreForTeamB(number2);
    }
    public void displayScoreForTeamB(int i){
        TextView score2=(TextView)findViewById(R.id.scoreofB);
        score2.setText(""+i);
    }

    /** code for reset the score
     *
     * @param view
     */

    public void reset2(View view) {
        number2=0;
        displayScoreForTeamB(number2);
    }

    public void reset1(View view) {
        number=0;
        displayScore(number);
    }

    public void resultTime(View view) {
        if(number>number2)
        {
            massage="TeamA_Win";
        }
        else
        {
            if(number2>number)
            {
                massage="TeamB_Win";
            }
            else
                massage="Draw";
        }
        displayResult(massage);

    }
    public void displayResult(String massage)
    {
        TextView result=(TextView)findViewById(R.id.resultText);
        result.setText(massage);
    }
}
