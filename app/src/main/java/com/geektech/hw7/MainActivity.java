package com.geektech.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private Boolean isOperationClick;
    private Integer result;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn2:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.btnAC:
                textView.setText(0);
                break;
            case R.id.btn3:
                if (textView.getText().toString().equals("3")) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.btn4:
                if (textView.getText().toString().equals("4")) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                    break;
                }
            case R.id.btn5:
                if (textView.getText().toString().equals("5")) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                    break;
                }
            case R.id.btn6:
                if (textView.getText().toString().equals("6")) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                    break;
                }
            case R.id.btn7:
                if (textView.getText().toString().equals("7")) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                    break;
                }
            case R.id.btn8:
                if (textView.getText().toString().equals("8")) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                    break;
                }
            case R.id.btn9:
                if (textView.getText().toString().equals("9")) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                    break;
                }
            case R.id.btn0:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                    break;
                }
        }
    }

    public void onOperationClick(View view) {

        switch (view.getId()) {
            case R.id.btn_plus:
                operation = "Plus";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_minus:
                operation = "minus";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_ymnozh:
                operation = "ymnozh";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_delen:
                operation = "delen";
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_rovno:
                second = Integer.valueOf(textView.getText().toString());
                if (operation == "Plus") {
                    result = first + second;
                } else if (operation == "minus") {
                    result = first - second;
                } else if (operation == "ymnozh") {
                    result = first * second;
                } else if (operation == "delen") {
                    result = first / second;
                }
                textView.setText(result.toString());
                break;
        }
            isOperationClick = true;

    }
}