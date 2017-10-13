package com.example.naveed.unitconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity22Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity22);


        int activity2= getIntent().getIntExtra("value2",-1);


        Toast.makeText(this, "valueRecieved" + activity2, Toast.LENGTH_LONG).show();

    }

    public void moveBack(View v){
        finish();

    }



}
