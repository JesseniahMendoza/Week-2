package jesseniah.week_2;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends Activity {

    //Start with ArrayAdapter (to port ArrayList data into the ListView)
    Button b1,b2;
    EditText e1;
    String text,u;
    String un[]={"","","","","","","","","","","","","","",""};
    String pas;
    Cursor c;
    int i=0;
    ListView twin3;
    String s;
    static LinkedList<String> exampleList = new LinkedList<String>();
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exampleList = new LinkedList<>();
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, exampleList);

        twin3 =(ListView) findViewById(R.id.listView1);
        twin3.setAdapter(mAdapter);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.editText1);



        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String twin2 = e1.getText().toString();

                if (twin2.length() > 0) {
                    exampleList.add(twin2);
                    mAdapter.notifyDataSetChanged();
                    e1.setText("");
                } else{







                    text = "'" + text + "'";
                    e1.setText("");

                    Toast.makeText(getApplicationContext(), "TASK ADDED IN LIST", Toast.LENGTH_SHORT).show();

                    exampleList.add(text);
                }
            });


            b2.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    String input = e1.getText().toString();

                    if (input.length() > 0) {
                        exampleList.add(input);
                        mAdapter.notifygDataSetChanged();
                        e1.setText("");
                    } else{
                        Toast.makeText(getApplicationContext(), "None", Toast.LENGTH_LONG).show();
                    }

                    startActivity(new Intent(getApplicationContext(), second_activity.class));
                }

            });



        }
    }