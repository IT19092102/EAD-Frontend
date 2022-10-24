package com.example.fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        //assigning variables to Resource ID of signIn Text displayed
        textView=(TextView) findViewById(R.id.signInTxt);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signInNavigation();
            }
        });
    }

    //method to navigate from Register UI to Login UI
    public void signInNavigation(){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}
