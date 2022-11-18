package com.example.simblecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sum(View view){
        EditText nm1 =(EditText)findViewById(R.id.nm1);
        EditText nm2 =(EditText)findViewById(R.id.nm2);
        EditText nm3 =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(nm1.getText().toString());
        int n2 = Integer.parseInt(nm2.getText().toString());
        int result = n1+n2;

        nm3.setText("totalvalue" +result);

    }
    public void sub(View view){
        EditText nm1 =(EditText)findViewById(R.id.nm1);
        EditText nm2 =(EditText)findViewById(R.id.nm2);
        EditText nm3 =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(nm1.getText().toString());
        int n2 = Integer.parseInt(nm2.getText().toString());
        int result = n1-n2;

        nm3.setText("totalvalue"+result);
}
    public void div (View view){
        EditText nm1 =(EditText)findViewById(R.id.nm1);
        EditText nm2 =(EditText)findViewById(R.id.nm2);
        EditText nm3 =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(nm1.getText().toString());
        int n2 = Integer.parseInt(nm2.getText().toString());
        int result = n1/n2;

        nm3.setText("totalvalue"+result);
    }
    public void milt(View view){
        EditText nm1 =(EditText)findViewById(R.id.nm1);
        EditText nm2 =(EditText)findViewById(R.id.nm2);
        EditText nm3 =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(nm1.getText().toString());
        int n2 = Integer.parseInt(nm2.getText().toString());
        int result = n1*n2;

        nm3.setText("totalvalue"+result);}

    }