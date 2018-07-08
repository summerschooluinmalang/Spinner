package id.technologue.appsl.spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = (Spinner) findViewById(R.id.spinner);

        Button btn = (Button) findViewById(R.id.btn_next);

        spin.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();

        categories.add("item 1");
        categories.add("item 2");
        categories.add("item 3");
        categories.add("item 4");
        categories.add("item 5");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.second_activity, R.id.text_result, categories);

        dataAdapter.setDropDownViewResource(R.layout.second_activity);

        spin.setAdapter(dataAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                in.putExtra("data", String.valueOf(spin.getSelectedItem()));

                startActivity(in);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
