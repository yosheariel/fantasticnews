package com.example.fantasticnews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        EditText namaSignUp = findViewById(R.id.namaSignUp);
        EditText usernameSignUp = findViewById(R.id.usernameSignUp);
        EditText emailSignUp = findViewById(R.id.emailSignUp);
        EditText passwordSignUp = findViewById(R.id.passwordSignUp);
        Button signUpButton = findViewById(R.id.buttonSignUp);
        TextView errorSignUp = findViewById(R.id.errorSignUp);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(signUp.this, "Button is Clicked", Toast.LENGTH_SHORT)
                        .show();
                Log.d("Toast Debug", "ini bisa");

                String namaSignUpString=namaSignUp.getText().toString();
                String usernameSignUpString=usernameSignUp.getText().toString();
                String emailSignUpString=emailSignUp.getText().toString();
                String passwordSignUpString=passwordSignUp.getText().toString();


                if (namaSignUpString.isEmpty() || usernameSignUpString.isEmpty() || emailSignUpString.isEmpty() || passwordSignUpString.isEmpty()){
                    errorSignUp.setText("Data harus diisi!");
                }


                Log.i("User Sign Up", "Nama Lengkap: "+namaSignUpString);
                Log.i("User Sign Up", "Username: "+usernameSignUpString);
                Log.i("User Sign Up", "Email: "+emailSignUpString);
                Log.i("User Sign Up", "Password: "+passwordSignUpString);
            }
        });
    }
}