package com.example.fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StationLogin extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_login);

        //assigning variables to the resource id of Station Register Text
        textView=(TextView) findViewById(R.id.stationRegisterTxt);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToStationRegister();
            }
        });
    }

    //method to navigate from Station Login UI to Station Register UI
    public void navigateToStationRegister(){
        Intent intent = new Intent(this,StationRegister.class);
        startActivity(intent);
    }
}