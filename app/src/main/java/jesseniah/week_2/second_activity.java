package jesseniah.week_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;

public class second_activity extends AppCompatActivity {

    Button b2;
    ArrayAdapter<String> mAdapter;
    String text,Canopy;
    EditText e1;
    static LinkedList<String> exampleList = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        b2 = (Button) findViewById(R.id.btn);
        e1 = (EditText) findViewById(R.id.editText1);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, exampleList);
        ListView listView = (ListView) findViewById(R.id.twin3);
        listView.setAdapter(mAdapter);







        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

//                text = e1.getText().toString();
                Toast.makeText(getApplicationContext(), "TASK ADDED IN LIST", Toast.LENGTH_SHORT).show();
//                exampleList.add(text);

                String twin2 = e1.getText().toString();

                if (twin2.length() > 0) {
                    exampleList.add(twin2);
                    mAdapter.notifyDataSetChanged();
                    e1.setText("");

                }
            }

        });
         /*   listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()

            {
                @Override

                public boolean onItemLongClick (AdapterView < ? > parent, View view,int position,
                long id){
                exampleList.remove(position);
                mAdapter.notifyDataSetChanged();
                return false;
            }
        }*/

    };
    }




