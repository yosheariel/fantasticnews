package com.example.fantasticnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText usernameLogin = findViewById(R.id.usernameLogin);
        EditText passwordLogin = findViewById(R.id.passwordLogin);
        TextView errorLogin = findViewById(R.id.errorLogin);

        Button buttonSignUpLogin = findViewById(R.id.buttonSignUpLogin);
        buttonSignUpLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, signUp.class));
            }
        });


        Button loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(startIntent);

            }


        });
    }
}