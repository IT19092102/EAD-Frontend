package com.example.fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class StationRegister extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView textView;
    String[] locations = { "Select Station Location", "Ampara","Anuradhapura","Badulla","Batticaloa","Colombo","Galle", "Gampaha","Hambanthota","Jaffna","Kaluthara"};
    String[] brands = {"Choose Fuel Brand", "CEYPETCO", "IOC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_register);

        //locations spinner
        Spinner spinner = findViewById(R.id.stationLoc);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter ad= new ArrayAdapter(this,android.R.layout.simple_spinner_item,locations);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(ad);

        //brands spinner
        Spinner brandspinner = findViewById(R.id.stationBrand);
        brandspinner.setOnItemSelectedListener(this);

        ArrayAdapter brandad=new ArrayAdapter(this, android.R.layout.simple_spinner_item,brands);
        brandspinner.setAdapter(brandad);


        textView=(TextView) findViewById(R.id.stationSignInText);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navigateToStationLogin();
            }
        });
    }



    public void navigateToStationLogin(){
        Intent intent = new Intent(this,StationLogin.class);
        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}