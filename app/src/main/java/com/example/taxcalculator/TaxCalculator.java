package com.example.taxcalculator;

public class TaxCalculator {
    float amount;
    float mintax= (float) 0.01;
    float midtax=15;
    float maxtax=25;

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
            float taxableamount=newamount*mintax/100;
            float newamount2=amount-newamount;
            //float totaltaxamount=taxableamount+taxableamount2;
            //return grandPayableTax=totaltaxamount;

        }
        else if(amount>350000){
            float hightax=amount-350000;
            float hightaxamount=hightax*maxtax/100;

            float mediumtax=amount-hightax;
            float mediumtax1=mediumtax-200000;
            float mediumtaxamount=mediumtax1*midtax/100;



            float lowtax=hightax+mediumtax1;
            float lowtax1=amount-lowtax;
            float lowtaxamout=lowtax1*mintax/100;

            float grandtotaltax=hightaxamount+mediumtaxamount+lowtaxamout;
            return grandPayableTax=grandtotaltax;


        }
        return grandPayableTax;
    }
    
}
