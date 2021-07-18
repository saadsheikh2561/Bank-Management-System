package com.company;

public class Customer {
    private String Name;
    private String Address;
    private String Phone_no;
    private String Account_ID;
    private String AccountNumber;
    private double Balance;

    Customer()
    {
        Name="ABC";
        Address="XYZ";
        Phone_no="+921234567912";
        Account_ID="0000";

    }
    Customer(String Name,String Address,String Phone_no,String account_ID)
    {
        this.Name=Name;
        this.Address=Address;
        this.Phone_no=Phone_no;
        this.Account_ID=account_ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAccount_ID(String account_ID) {
        Account_ID = account_ID;
    }

    public String getAccount_ID() {
        return Account_ID;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setPhone_no(String phone_no) {
        Phone_no = phone_no;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }
}
