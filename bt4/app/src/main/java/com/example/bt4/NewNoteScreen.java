package com.example.bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewNoteScreen extends AppCompatActivity {
    Button login;
    Button logout;
    EditText hhh;
    String hello = "helloo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note_screen);
        login = findViewById(R.id.login);
        hhh = findViewById(R.id.hhh);

            Intent intent = getIntent();
        hhh.setText(hello);
    }
}
