package com.patrickdusenge.android.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

         txt = (TextView) findViewById(R.id.numbers);

         int random[] = new int[numbers];
         for(int i = 0; i < random.length; i++){
             Random rand = new Random();
             random[i] = rand.nextInt(minNum) + maxNum;
         }

         String arrString = random.toString() + ", ";

         txt.setText(arrString);

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



