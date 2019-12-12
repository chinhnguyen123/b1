package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DangKyActivity extends AppCompatActivity {

    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        tvOutput = findViewById(R.id.tvOutput);
        Intent intent = getIntent();

        String txtOutput = intent.getStringExtra("inputText");
        boolean b = intent.getBooleanExtra("inputTextboolean",false);

        double number = intent.getDoubleExtra("inputNumber",0);
        tvOutput.setText(txtOutput);

    }
}
