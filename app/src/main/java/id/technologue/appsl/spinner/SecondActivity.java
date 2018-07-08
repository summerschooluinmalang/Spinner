package id.technologue.appsl.spinner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jauharibill on 7/7/2018.
 */

public class SecondActivity extends Activity{

    public void onCreate(Bundle saveStateBundle){
        super.onCreate(saveStateBundle);
        setContentView(R.layout.second_activity);

        TextView txtv = (TextView) findViewById(R.id.text_result);

        Bundle in = getIntent().getExtras();

        String result = in.getString("data");

        txtv.setText(result);


    }
}
