package ly.generalassemb.drewmahrt.sharedprerencesbetweenactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView)findViewById(R.id.message_text_view);

        //get reference to shared preferences

        //retrieve the text

        //set the text to TextView
    }
}
