package com.example.taxcalculator;

public class TaxCalculator {
    float amount;
    float mintax= (float) 0.01;
    float midtax= (float) 0.15;
    float maxtax= (float) 0.25;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float taxableAmount(){
        float grandPayableTax = 0;
        if(amount<=200000){
            float taxamount=amount*mintax;
            return grandPayableTax=taxamount;
        }
        else if (amount>200000 && amount<=350000){
            float midAmount=200000;
            float newamount=amount-midAmount;
            float taxableamount=newamount*midtax;
            float newamount2=amount-newamount;
            float midTax=newamount2*mintax;
            float totaltaxamount=taxableamount+midTax;
            return grandPayableTax=totaltaxamount;

        }
        else if(amount>350000){
            float hightax=amount-350000;
            float hightaxamount=hightax*maxtax;

            float mediumtax=amount-hightax;
            float mediumtax1=mediumtax-200000;
            float mediumtaxamount=mediumtax1*midtax;



            float lowtax=hightax+mediumtax1;
            float lowtax1=amount-lowtax;
            float lowtaxamout=lowtax1*mintax/100;

            float grandtotaltax=hightaxamount+mediumtaxamount+lowtaxamout;
            return grandPayableTax=grandtotaltax;


        }
        return grandPayableTax;
    }
    
}
