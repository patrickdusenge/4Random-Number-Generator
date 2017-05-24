package com.patrickdusenge.android.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import java.util.Random;
import java.util.StringTokenizer;

public class SecondActivity extends Activity {

    public int firstNum;
    public int lastNum;
    public int numbers;
    private TextView txt;

    public void getRandom(int firstNum, int lastNum, int numbers){
        this.firstNum = firstNum;
        this.lastNum = lastNum;
        this.numbers = numbers;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt = (TextView) findViewById(R.id.numbers);

        for(int i = 0; i < numbers; i++){
            Random rnd = new Random();
            int listNumbers = rnd.nextInt(firstNum) +lastNum;
            listNumbers = Integer.parseInt(txt.getText().toString());

        }


    }



}
