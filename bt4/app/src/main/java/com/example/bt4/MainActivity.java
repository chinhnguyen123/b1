package com.example.bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us = "admin";
                String ps = "Admin123*";
                if(user.getText().toString().equals(us) && pass.getText().toString().equals(ps)){
                    Toast.makeText(getApplicationContext(),"dang nhap thanh cong",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getBaseContext(),NewNoteScreen.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"dang nhap ko thanh conng",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
