package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalculate;
    private TextView tvTaxableAmount;
    private EditText etAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate=findViewById(R.id.btnCalculate);
        tvTaxableAmount=findViewById(R.id.tvTaxAmount);
        etAmount=findViewById(R.id.etSalary);

        btnCalculate.setOnClickListener(this);
    }
    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.btnCalculate)
        {
            float salary=Float.parseFloat(etAmount.getText().toString());

            TaxCalculator taxc=new TaxCalculator();
            taxc.setAmount(salary);
            float tax=taxc.taxableAmount();
            tvTaxableAmount.setText(Float.toString(tax));
        }


    }

}
