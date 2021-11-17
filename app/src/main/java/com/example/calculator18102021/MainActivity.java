package com.example.calculator18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        ///number1+ number2
        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Click button Add", Toast.LENGTH_SHORT).show();
               // Log.d("AAA","Error!!!");
                String textnumber1,textnumber2;
                textnumber1 = mtxtInputEdtNumber1.getText().toString();
                textnumber2 = mtxtInputEdtNumber2.getText().toString();

                //kiểm tra giá trị
                if(textnumber2.isEmpty()||textnumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ giá trị", Toast.LENGTH_SHORT).show();
                    return;
                }
                    //Code number1 + number2
                    int number1 = Integer.parseInt(textnumber1);
                    int number2 = Integer.parseInt(textnumber2);
                    int result = number1+number2;
                    mTvResult.setText("Result = " + result);
            }
        });
        /// number1  - number2
        mBtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mtxtInputEdtNumber1.getText().toString().isEmpty()||mtxtInputEdtNumber2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ giá trị", Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1 = Integer.parseInt(mtxtInputEdtNumber1.getText().toString());
                int number2 = Integer.parseInt(mtxtInputEdtNumber2.getText().toString());
                int result = number1-number2;
                mTvResult.setText("Result = " + result);
            }
        });
        /// number1 * number2
        mBtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mtxtInputEdtNumber1.getText().toString().isEmpty()||mtxtInputEdtNumber2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ giá trị", Toast.LENGTH_SHORT).show();
                    return;
                }
                int number1 = Integer.parseInt(mtxtInputEdtNumber1.getText().toString());
                int number2 = Integer.parseInt(mtxtInputEdtNumber2.getText().toString());
                int result = number1*number2;
                mTvResult.setText("Result = " + result);
            }
        });
        //number1 / number2
        mBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mtxtInputEdtNumber1.getText().toString().isEmpty()||mtxtInputEdtNumber2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ giá trị", Toast.LENGTH_SHORT).show();
                    return;
                }
                float number1 = Integer.parseInt(mtxtInputEdtNumber1.getText().toString());
                float number2 = Integer.parseInt(mtxtInputEdtNumber2.getText().toString());
                if(number2==0){
                    Toast.makeText(MainActivity.this, "Invaild values", Toast.LENGTH_SHORT).show();
                    return;
                }
                float resultDiv = (number1/number2);
                String result= String.format("%.2f",resultDiv);
                mTvResult.setText("Result = " + result);
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