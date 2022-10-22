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


public class StationRegister extends AppCompatActivity{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_register);

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


}