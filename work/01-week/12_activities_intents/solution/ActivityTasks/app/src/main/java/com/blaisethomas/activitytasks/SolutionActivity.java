package com.blaisethomas.activitytasks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        // get the intent that started this activity
        Intent intent = getIntent();

        // get the data from the intent
        String stringOne = intent.getStringExtra("one");
        String stringTwo = intent.getStringExtra("two");

        TextView tv = (TextView) findViewById(R.id.textView);

        if(null != stringOne && null != stringTwo) {

            int numOne = Integer.parseInt(stringOne);
            int numTwo = Integer.parseInt(stringTwo);

            int solution = numOne + numTwo;

            tv.setText(String.valueOf(solution));
        }
    }
}
