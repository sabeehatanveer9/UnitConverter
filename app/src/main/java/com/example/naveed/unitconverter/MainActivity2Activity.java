package com.example.naveed.unitconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2Activity extends ActionBarActivity {

    Spinner s1,s2;
    Button bt1;
    TextView tview1;
    EditText etext1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        s1= (Spinner) findViewById(R.id.spin1);
        s2= (Spinner) findViewById(R.id.spin2);
        bt1= (Button) findViewById(R.id.btn1);
        tview1= (TextView) findViewById(R.id.tv1);
        etext1= (EditText) findViewById(R.id.et1);




    }

    public void moveBack(View v){
            finish();

    }


    public void convert (View view){
        if(etext1.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(), "enter value", Toast.LENGTH_SHORT).show();
        }
        else
        {
            switch (s1.getSelectedItemPosition()){
                case 0:
                    switch (s2.getSelectedItemPosition()){
                        case 0:
                           double c =  Double.valueOf(etext1.getText().toString());
                            tview1.setText(String.valueOf(c));

                    }
            }
        }
    }



}
