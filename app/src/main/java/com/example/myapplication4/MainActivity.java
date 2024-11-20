package com.example.myapplication4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_num1, et_num2;
    private TextView tv_result;
    private Button btnplus, btnMinus, btnMult, btnDiv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_num1 = findViewById(R.id.etNum1);
        et_num2 = findViewById(R.id.etnum2);
        tv_result = findViewById(R.id.tvresult);
        btnplus = findViewById(R.id.buttonPlus);
        btnplus.setOnClickListener(this);
        btnMinus = findViewById(R.id.buttonMinus);
        btnMinus.setOnClickListener(this);
        btnMult = findViewById(R.id.buttonMult);
        btnMult.setOnClickListener(this);
        btnDiv = findViewById(R.id.buttonDiv);
        btnDiv.setOnClickListener(this);

    }
    .
    @Override
    public void onClick(View v) {

        int num1, num2;
        if (!(et_num1.getText().toString().isEmpty() || et_num2.getText().toString().isEmpty())) {
            num1 = Integer.parseInt(et_num1.getText().toString());
            num2 = Integer.parseInt(et_num2.getText().toString());
            et_num1.setText("");
            et_num2.setText("");
            if (v.getId() == R.id.buttonPlus)
                tv_result.setText(String.valueOf(num1 + num2));

            if (v.getId() == R.id.buttonMinus && num1 > num2)
                tv_result.setText(String.valueOf(num1 - num2));
            else
                tv_result.setText("please enter new numbers");
            if (v.getId() == R.id.buttonMult)
                tv_result.setText(String.valueOf(num1 * num2));

            if (v.getId() == R.id.buttonDiv && num2 != 0)
                tv_result.setText(String.valueOf(num1 / num2));
            else
                tv_result.setText("please enter new numbers");
        } else
            tv_result.setText("please enter numbers");
    }
}