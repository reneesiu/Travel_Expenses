package com.example.travelexpenses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    EditText miles;
    EditText mpg;
    EditText gasCost;
    String strSp;
    String strMiles;
    String strMPG;
    String strCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spinner);
        miles=findViewById(R.id.miles);
        mpg=findViewById(R.id.mpg);
        gasCost=findViewById(R.id.cost);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                strSp=sp.getSelectedItem().toString();
                if(strSp.equals("Washington DC")) {
                    miles.setText("700.8");
                } else if(strSp.equals("Miami")) {
                    miles.setText("1380.6");
                } else if(strSp.equals("New York")) {
                    miles.setText("790.2");
                } else if(strSp.equals("Los Angeles")) {
                    miles.setText("2014.8");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void Calculate(View v) {
        strMiles=miles.getText().toString();
        strMPG=mpg.getText().toString();
        strCost=gasCost.getText().toString();
        Intent i=new Intent(this, ResultActivity.class);
        i.putExtra("miles", strMiles);
        i.putExtra("mpg", strMPG);
        i.putExtra("cost", strCost);
        startActivity(i);
    }
}