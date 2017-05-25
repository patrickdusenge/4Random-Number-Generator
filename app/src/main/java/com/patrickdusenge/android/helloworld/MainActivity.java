package com.patrickdusenge.android.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;
public class MainActivity extends AppCompatActivity {

    private TextView msg;
    private EditText minNum;
    private EditText maxNum;
    private EditText numbers;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (TextView) findViewById(R.id.textView2); // Intro message
        minNum = (EditText) findViewById(R.id.min_number); // firstNum
        maxNum = (EditText) findViewById(R.id.max_number); //lastNum
        numbers = (EditText) findViewById(R.id.num_numbers); // how many number to generate
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
        int min = Integer.parseInt(minNum.getText().toString());
        int max = Integer.parseInt(maxNum.getText().toString());
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
