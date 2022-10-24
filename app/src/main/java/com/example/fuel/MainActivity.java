package com.example.fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button, btnLogin, btnStation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.register);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

        button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        btnStation = (Button) findViewById(R.id.StationView);
        btnStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                station();
            }
        });
    }

    //method to navigate from welcome UI to Register UI
    public void register(){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

    //method to navigate from Welcome UI to Login UI
    public void login(){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    //method to navigate from Welcome UI to Station Owner Login UI
    public void station(){
        Intent intent = new Intent(this,StationLogin.class);
        startActivity(intent);
    }
}