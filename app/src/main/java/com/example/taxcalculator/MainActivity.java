package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalculate;
    private TextView tvOut,tvTaxableAmount;
    private EditText etAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate=findViewById(R.id.btnCalculate);
        tvTaxableAmount=findViewById(R.id.tvTaxAmount);
        etAmount=findViewById(R.id.etSalary);
        tvOut=findViewById(R.id.tvTotal);

        btnCalculate.setOnClickListener(this);
    }
    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.btnCalculate)
        {
            double salary=Double.parseDouble(etAmount.getText().toString());

            TaxCalculator taxc=new TaxCalculator();
            taxc.setAmount(salary);
            Double tax=taxc.taxableAmount();
            tvTaxableAmount.setText(Double.toString(tax));
            double annualsalary=salary*12;
            double totalsalary=annualsalary-tax;
            tvOut.setText(Double.toString(totalsalary));
        }


    }

}
