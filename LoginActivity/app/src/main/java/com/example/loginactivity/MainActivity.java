package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        etInput = findViewById(R.id.etInput);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = etInput.getText().toString();

                Intent intent = new Intent(getBaseContext(), DangKyActivity.class);
                intent.putExtra("inputText",textInput);
                intent.putExtra("inputTextboolean",false);
                intent.putExtra("inputNumber",12345678);
                startActivity(intent);
            }
        });
//
    }
}
