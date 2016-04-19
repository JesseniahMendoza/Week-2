package com.blaisethomas.activitytasks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void send(View view) {
        EditText et1 = (EditText) findViewById(R.id.editText);
        EditText et2 = (EditText) findViewById(R.id.editText2);
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();

        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("one", str1);
        intent.putExtra("two", str2);
        startActivity(intent);
    }
}
