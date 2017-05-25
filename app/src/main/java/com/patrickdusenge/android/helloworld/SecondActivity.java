package com.patrickdusenge.android.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class SecondActivity extends Activity {
    private TextView txt;
    private Button btn;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

         Bundle bundle = getIntent().getExtras();

         int minNum = bundle.getInt("firstNum");
         int maxNum = bundle.getInt("lastNum");
         int numbers = bundle.getInt("numbers");

         txt = (TextView) findViewById(R.id.showNumbers);

         int random[] = new int[numbers];
         int range = Math.abs (maxNum - minNum);
         for(int i = 0; i < random.length; i++){
             Random rand = new Random();
             //random[i] = rand.nextInt(minNum) + maxNum;
             random[i] = rand.nextInt(range) + minNum;
         }

         txt.setText(Arrays.toString(random));


        btn = (Button) findViewById(R.id.goback);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBackToActivity();
            }
        });
    }

    private void goBackToActivity(){
        Intent goBack = new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
}



