package com.example.calculator18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText mtxtInputEdtNumber1,mtxtInputEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus,mBtnSub,mBtnDiv,mBtnMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Number1 + Number2 =", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AnhXa() {
        mtxtInputEdtNumber1 = findViewById(R.id.textInputNumber1);
        mtxtInputEdtNumber2 = findViewById(R.id.textInputNumber2);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnSub = findViewById(R.id.buttonSub);
        mBtnMul = findViewById(R.id.buttonMul);
        mBtnDiv = findViewById(R.id.buttonDiv);

    }
}