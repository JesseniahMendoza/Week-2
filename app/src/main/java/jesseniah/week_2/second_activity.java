package jesseniah.week_2;

import android.support.v7.app.AppCompatActivity;

package jesseniah.gaproject1;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import java.util.LinkedList;

public class second_activity extends AppCompatActivity {

    Button b2;
    String text;
    EditText e1;
    static LinkedList<String> exampleList = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        b2 = (Button) findViewById(R.id.buttonny);
        e1 = (EditText) findViewById(R.id.edittext2);

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                text = e1.getText().toString();
                Toast.makeText(getApplicationContext(), "TASK ADDED IN LIST", Toast.LENGTH_SHORT).show();
                exampleList.add(text);
            }
        });

    }
}
