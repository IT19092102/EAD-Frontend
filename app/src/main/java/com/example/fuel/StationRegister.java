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
    //assigning an array of locations for the station
    String[] locations = { "Select Station Location", "Ampara","Anuradhapura","Badulla","Batticaloa","Colombo","Galle", "Gampaha","Hambanthota","Jaffna","Kaluthara"};
    //assigning an array of the type of fuel brands
    String[] brands = {"Choose Fuel Brand", "CEYPETCO", "IOC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_register);

        //adding a spinner object to find out which item is selected
        Spinner spinner = findViewById(R.id.stationLoc);
        spinner.setOnItemSelectedListener(this);

        //creating an instance of ArrayAdapter to having the list of locations
        ArrayAdapter ad= new ArrayAdapter(this,android.R.layout.simple_spinner_item,locations);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(ad);

        //adding a spinner object to find out which item is selected
        Spinner brandspinner = findViewById(R.id.stationBrand);
        brandspinner.setOnItemSelectedListener(this);

        //creating an instance of ArrayAdapter to having the list of brands
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



    //method to navigate from Station Register UI to Station Login UI
    public void navigateToStationLogin(){
        Intent intent = new Intent(this,StationLogin.class);
        startActivity(intent);
    }


    //perform the action when an item is selected from the spinner
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}