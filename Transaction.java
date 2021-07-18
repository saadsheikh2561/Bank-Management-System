package com.company;

public class Transaction {

    private double Amount;
    private String Time;
    private  String Type;
    private double transactionamount;
    private double amounttransfer1;
    private double amounttransfer2;
    private double TaxDeduction;
    private double previousAmount;
    private double ZakatDeduction;
    Date D1;
    Customer C;
    Transaction() { }

    public void setAmounttransfer1(double amounttransfer1) {
        this.amounttransfer1 = amounttransfer1;
    }

    public void setTaxDeduction(double taxDeduction) {
        TaxDeduction = taxDeduction;
    }

    public double getTaxDeduction() {
        return TaxDeduction;
    }
    public double getAmounttransfer1() {
        return amounttransfer1;
    }

    public void setZakatDeduction(double zakatDeduction) {
        ZakatDeduction = zakatDeduction;
    }

    public double getZakatDeduction() {
        return ZakatDeduction;
    }

    public void setAmounttransfer2(double amounttransfer2) {
        this.amounttransfer2 = amounttransfer2;
    }

    public double getAmounttransfer2() {
        return amounttransfer2;
    }

    public void setPreviousAmount(double previousAmount) {
        this.previousAmount = previousAmount;
    }

    public void setTransactionamount(double transactionamount) {
        this.transactionamount = transactionamount;
    }

    public double getTransactionamount() {
        return transactionamount;
    }

    public double getPreviousAmount() {
        return previousAmount;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getType() {
        return Type;
    }

    public void setD1(Date d1) {
        D1 = d1;
    }

    public Date getD1() {
        return D1;
    }

    public void setC(Customer c) {
        C = c;
    }

    public Customer getC() {
        return C;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getTime() {
        return Time;
    }
}
