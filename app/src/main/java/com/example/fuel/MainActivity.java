package com.example.fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_register);
//        setContentView(R.layout.activity_main);
//
//
//        btnLogin = (Button) findViewById(R.id.register);
//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                register();
//            }
//        });
//
//        button = (Button) findViewById(R.id.login);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                login();
//            }
//        });
//    }
//
//    public void register(){
//        Intent intent = new Intent(this,Register.class);
//        startActivity(intent);
//    }
//
//    public void login(){
//        Intent intent = new Intent(this,Login.class);
//        startActivity(intent);
    }
}