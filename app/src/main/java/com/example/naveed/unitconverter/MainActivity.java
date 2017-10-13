package com.example.naveed.unitconverter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void called(View v){
        switch (v.getId()){
            case R.id.b1:
                Intent obj1= new Intent(MainActivity.this, MainActivity2Activity.class);
                //obj1.putExtra("value",1);
                startActivity(obj1);
                break;

            case R.id.b2:
                Intent obj2= new Intent(MainActivity.this, MainActivity22Activity.class);
                //obj2.putExtra("value2",2);
                startActivity(obj2);
                break;

            case R.id.b3:
                Intent obj3= new Intent(MainActivity.this, Lenght.class);
                //obj3.putExtra("value",1);
                startActivity(obj3);
                break;

            case R.id.b4:
                Intent obj4= new Intent(MainActivity.this, Speed.class);
                //obj4.putExtra("value",1);
                startActivity(obj4);
                break;

            case R.id.b5:
                Intent obj5= new Intent(MainActivity.this, Currency.class);
                //obj5.putExtra("value",1);
                startActivity(obj5);
                break;

            case R.id.b6:
                Intent obj6= new Intent(MainActivity.this, Volume.class);
                //obj6.putExtra("value",1);
                startActivity(obj6);
                break;

            case R.id.b7:
                Intent obj7= new Intent(MainActivity.this, Time.class);
                //obj7.putExtra("value",1);
                startActivity(obj7);
                break;

            case R.id.b8:
                Intent obj8= new Intent(MainActivity.this, Area.class);
                //obj8.putExtra("value",1);
                startActivity(obj8);
                break;

            case R.id.b9:
                Intent obj9= new Intent(MainActivity.this, Fuel.class);
                //obj8.putExtra("value",1);
                startActivity(obj9);
                break;

            case R.id.b10:
                Intent obj10= new Intent(MainActivity.this, Pressure.class);
                //obj8.putExtra("value",1);
                startActivity(obj10);
                break;

            case R.id.b11:
                Intent obj11= new Intent(MainActivity.this, Energy.class);
                //obj8.putExtra("value",1);
                startActivity(obj11);
                break;

            case R.id.b12:
                Intent obj12= new Intent(MainActivity.this, Storage.class);
                //obj8.putExtra("value",1);
                startActivity(obj12);
                break;
        }
    }








}
