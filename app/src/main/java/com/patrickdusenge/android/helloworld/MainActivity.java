package com.patrickdusenge.android.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;
public class MainActivity extends AppCompatActivity {

    private TextView msg;
    private TextView firstNum;
    private TextView lastNum;
    private TextView numbers;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (TextView) findViewById(R.id.message); // Intro message
        firstNum = (TextView) findViewById(R.id.fnumber); // firstNum
        lastNum = (TextView) findViewById(R.id.snumber); //lastNum
        numbers = (TextView) findViewById(R.id.numbers); // how many number to generate
        btn = (Button)findViewById(R.id.generate); // generate button

        String message = " Welcome to Random Number Generator."
                + "Please enter the following to continue ";

        msg.setText(message); // fixed, lol
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                int firstVar = Integer.parseInt(firstNum.getText().toString());
                int lastVar = Integer.parseInt(lastNum.getText().toString());
                int numVar = Integer.parseInt(numbers.getText().toString());

                SecondActivity obj = new SecondActivity();
                obj.getRandom(firstVar, lastVar, numVar);

                goToSecondActivity();
            }
        });
    }

    private void goToSecondActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onStart(){
        super.onStart();
    }

}
