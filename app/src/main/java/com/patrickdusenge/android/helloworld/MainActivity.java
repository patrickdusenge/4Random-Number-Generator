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

        msg = (TextView) findViewById(R.id.textView2); // Intro message
        firstNum = (TextView) findViewById(R.id.fnumber); // firstNum
        lastNum = (TextView) findViewById(R.id.snumber); //lastNum
        numbers = (TextView) findViewById(R.id.numbers); // how many number to generate
        btn = (Button)findViewById(R.id.generate); // generate button

        String message = "Welcome to Random Number Generator."
                + " Please enter the following to continue ";

        msg.setText(message);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }


    private void goToSecondActivity(){
        int min = Integer.parseInt(firstNum.getText().toString());
        int max = Integer.parseInt(lastNum.getText().toString());
        int num = Integer.parseInt(numbers.getText().toString());

        Intent intent = new Intent(this,SecondActivity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("firstNum", min);
        bundle.putInt("lastNum", max);
        bundle.putInt("numbers", num);

                intent.putExtras(bundle);
        startActivity(intent);

    }


    @Override
    protected void onStart(){
        super.onStart();
    }

}
