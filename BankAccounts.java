package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract  class BankAccounts {
    public static ArrayList<Transaction> transactions=new ArrayList<Transaction>();
    Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    Customer C1;
    BankAccounts()
    {

    }

    public void setC1(Customer c1) {
        C1 = c1;
    }

    public Customer getC1() {
        return C1;
    }

    public abstract void OpenAccount() throws IOException;
    public abstract  void CloseAccount();
    public static void  makeDeposit(String AccountNumber)
    {
        Scanner sc=new Scanner(System.in);
        double Balance;
        boolean flag=false;

        for(CheckingAccount i: CheckingAccount.checkingaccount)
        {
            if(!CheckingAccount.checkingaccount.isEmpty()) {
                if ( AccountNumber.equals(i.C1.getAccountNumber())) {
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                        while(Day<1 && Day>31)
                        {
                            System.out.println("Enter the Day again from(1-31): ");
                            Day= sc.nextInt();
                            sc.nextLine();
                        }
                        D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);
                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();
                    T1.setType("Deposit Amount");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setPreviousAmount(i.C1.getBalance());
                    System.out.print("Enter The amount you want to Deposit: ");
                    Balance = sc.nextDouble();
                    T1.setTransactionamount(Balance);
                    Balance = i.C1.getBalance() + Balance;
                    i.C1.setBalance(Balance);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                + T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+AccountNumber+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    flag=true;
                    break;
                }
            }
        }
        for (SavingAccount i: SavingAccount.savingAccounts) {
            if(!SavingAccount.savingAccounts.isEmpty()) {
                if (AccountNumber.equals(i.C1.getAccountNumber())) {
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);

                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();
                    T1.setType("Deposit Amount");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setPreviousAmount(i.C1.getBalance());
                    System.out.print("Enter The amount you want to Deposit: ");
                    Balance = sc.nextDouble();
                    T1.setTransactionamount(Balance);
                    Balance = i.C1.getBalance() + Balance;
                    i.C1.setBalance(Balance);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                + T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");
                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount\\"+AccountNumber+".txt",true);

                        F1.append( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    flag=true;
                    break;
                }
            }

        }
        if(!flag)
        {
            System.out.println("Sorry! No Account Found with this Account Id and Account Number");
        }
    }

    public static void CheckBalance(String AccountNumber)
    {
        Scanner sc=new Scanner(System.in);
        double Balance;
        boolean flag=false;
        for(CheckingAccount i: CheckingAccount.checkingaccount)
        {
            if(!CheckingAccount.checkingaccount.isEmpty()) {
                if (AccountNumber.equals(i.C1.getAccountNumber())) {
                    System.out.println("Your Name is  :"+i.C1.getName());
                    System.out.println("Your Current Balance is :"+i.C1.getBalance());
                    flag=true;
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+AccountNumber+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    break;
                }
            }
        }
        for(SavingAccount i: SavingAccount.savingAccounts)
        {
            if(!SavingAccount.savingAccounts.isEmpty()) {
                if (AccountNumber.equals(i.C1.getAccountNumber())) {
                    System.out.println("Your Name is  :"+i.C1.getName());
                    System.out.println("Your Current Balance is :"+i.C1.getBalance());
                    flag=true;
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount\\"+AccountNumber+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    break;
                }
            }
        }
        if (!flag)
        {
            System.out.println("Sorry! No Account Found with this Account Id and Account Number");
        }
    }
    public static void makeWithdrawal(String AccountNumber)
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        for(CheckingAccount i: CheckingAccount.checkingaccount)
        {
            if(!CheckingAccount.checkingaccount.isEmpty())
            {
                if(AccountNumber.equals(i.C1.getAccountNumber()))
                {
                    System.out.println("Enter the Amount you want to Withdraw: ");
                    double amount1= sc.nextDouble();
                    sc.nextLine();
                    while(amount1 > (i.C1.getBalance()+5000) || amount1< 0)
                    {
                        System.out.println("You have Entered an invalid Amount Please Try again");
                        System.out.println("Enter the Amount you want to Withdraw: ");
                         amount1= sc.nextDouble();
                        sc.nextLine();
                    }
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);
                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();
                    T1.setType("WithDraw Amount");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setPreviousAmount(i.C1.getBalance());
                    amount1=i.C1.getBalance()-amount1;
                    T1.setTransactionamount(amount1);
                    i.C1.setBalance(amount1);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                +T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+AccountNumber+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    flag=true;
                    break;
                }
            }
        }
        for(SavingAccount i: SavingAccount.savingAccounts)
        {
            if(!SavingAccount.savingAccounts.isEmpty())
            {
                if(AccountNumber.equals(i.C1.getAccountNumber()))
                {
                    System.out.println("Enter the Amount you want to Withdraw: ");
                    double amount1= sc.nextDouble();
                    sc.nextLine();
                    while(amount1 > (i.C1.getBalance()+5000) || amount1< 0)
                    {
                        System.out.println("You have Entered an invalid Amount Please Try again");
                        System.out.println("Enter the Amount you want to Withdraw: ");
                        amount1= sc.nextDouble();
                        sc.nextLine();
                    }
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);
                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();
                    T1.setType("WithDraw Amount");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setPreviousAmount(i.C1.getBalance());
                    amount1=i.C1.getBalance()-amount1;
                    T1.setTransactionamount(amount1);
                    i.C1.setBalance(amount1);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                +T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    flag=true;
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount\\"+AccountNumber+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println("Sorry ! No Account Found with this Details");
        }
    }
    public static void  transferAmount(String Account1)
    {
        Scanner sc= new Scanner(System.in);
        String Account2;
        double amount1,amount2;
        boolean flag=false;
        System.out.println("Enter the Amount you Want to Transfer: ");
        amount1= sc.nextDouble();
        sc.nextLine();
        amount2=amount1;
        System.out.println("Enter The Account Number in which you want to Transfer the Amount: ");
        Account2=sc.nextLine();
        for (CheckingAccount i:CheckingAccount.checkingaccount) {
            if(!CheckingAccount.checkingaccount.isEmpty())
            {
                flag=true;
                if(Account1.equals(i.C1.getAccountNumber()))
                {

                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);

                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();
                    T1.setType("Amount Transfer From This Account");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setAmounttransfer1(amount1);
                    T1.setPreviousAmount(i.C1.getBalance());
                    amount1=i.C1.getBalance()-amount1;
                    i.C1.setBalance(amount1);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+Account1+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getAmounttransfer1()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                + T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+Account1+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                }
                if(Account2.equals(i.C1.getAccountNumber()))
                {
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);

                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();

                    T1.setType("Amount transfer in this Account");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setAmounttransfer2(amount2);
                    T1.setPreviousAmount(i.C1.getBalance());
                    amount2=i.C1.getBalance()+amount2;
                    i.C1.setBalance(amount2);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+Account2+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getAmounttransfer2()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                + T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+Account2+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                }
            }
        }
        for (SavingAccount i:SavingAccount.savingAccounts) {
            if(!SavingAccount.savingAccounts.isEmpty())
            {
                flag=true;
                if(Account1.equals(i.C1.getAccountNumber()))
                {
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);

                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();
                    T1.setType("Amount Transfer From This Account");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());
                    T1.setAmounttransfer1(amount1);
                    T1.setPreviousAmount(i.C1.getBalance());
                    amount1=i.C1.getBalance()-amount1;
                    i.C1.setBalance(amount1);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+Account2+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getAmounttransfer1()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                + T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount\\"+Account1+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                }
                if(Account2.equals(i.C1.getAccountNumber()))
                {
                    Transaction T1=new Transaction();
                    Date D=new Date();
                    Customer C=new Customer();
                    System.out.println("Enter the Day from(1-31): ");
                    int Day= sc.nextInt();
                    sc.nextLine();
                    while(Day<1 && Day>31)
                    {
                        System.out.println("Enter the Day again from(1-31): ");
                        Day= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setDay(Day);

                    System.out.println("Enter the Month: ");
                    int month= sc.nextInt();
                    sc.nextLine();
                    while(month<1 && month>12)
                    {
                        System.out.println("Enter the month again from(1-12): ");
                        month= sc.nextInt();
                        sc.nextLine();
                    }
                    D.setMonth(month);
                    System.out.println("Enter the Year : ");
                    int Year= sc.nextInt();
                    sc.nextLine();
                    D.setYear(Year);

                    System.out.println("Enter The Time of Transactions: ");
                    String Time=sc.nextLine();

                    T1.setType("Amount transfer in this Account");
                    T1.setTime(Time);
                    T1.setD1(D);
                    C.setName(i.C1.getName());
                    C.setName(i.C1.getName());
                    C.setPhone_no(i.C1.getPhone_no());
                    C.setAddress(i.C1.getAddress());
                    C.setAccount_ID(i.C1.getAccount_ID());
                    C.setAccountNumber(i.C1.getAccountNumber());

                    T1.setAmounttransfer2(amount2);
                    T1.setPreviousAmount(i.C1.getBalance());
                    amount2=i.C1.getBalance()+amount2;
                    i.C1.setBalance(amount2);
                    C.setBalance(i.C1.getBalance());
                    T1.setC(C);
                    transactions.add(T1);
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+Account2+".txt",true);

                        F1.append(T1.getType()+"\n"
                                +T1.getTime()+"\n"
                                +T1.getC().getName()+"\n"
                                +T1.getC().getAccountNumber()+"\n"
                                +T1.getC().getAccount_ID()+"\n"
                                +T1.getAmounttransfer2()+"\n"
                                +T1.getC().getPhone_no()+"\n"
                                +T1.getC().getAddress()+"\n"
                                +T1.getPreviousAmount()+"\n"
                                +T1.getC().getBalance()+"\n"
                                + T1.getD1().getDay()+"/"+T1.getD1().getMonth()+"/"+T1.getD1().getYear()+"\n");

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }
                    try{
                        FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount\\"+Account2+".txt");

                        F1.write( i.C1.getName()+"\n"
                                +i.C1.getAccountNumber()+"\n"
                                +i.C1.getAccount_ID()+"\n"
                                +i.C1.getPhone_no()+"\n"
                                +i.C1.getAddress()+"\n"
                                +i.C1.getBalance()+"\n"
                                + i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());

                        F1.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println("An error has Occurred");
                        e.getStackTrace();
                    }

                }
            }
        }
        if(!flag)
        {
            System.out.println("Sorry ! No Account Found ");
        }
    }
    public static void printStatement(String AccountNumber)
    {
        for (Transaction i: transactions) {
             {
                 if(AccountNumber.equals(i.C.getAccountNumber())) {
                     if(!i.getType().equals(null) && i.getType().equals("Deposit Amount")) {
                         System.out.println("   *********************    \n\n\n");
                         System.out.println("Transaction Type:  " + i.getType());
                         System.out.println("The Name of The Customer:  " + i.C.getName());
                         System.out.println("The Account Number of the Customer:  " + i.C.getAccountNumber());
                         System.out.println("The Account ID of the Customer:  " + i.C.getAccount_ID());
                         System.out.println("The Phone Number of the Customer:  " + i.C.getPhone_no());
                         System.out.println("The Address of the Customer:  " + i.C.getAddress());
                         System.out.println("Previous Balance of the Customer: "+i.getPreviousAmount());
                         System.out.println("The Amount that is being Deposit on this account is: "+i.getTransactionamount());
                         System.out.println("The Current Balance of the Customer:  " + i.C.getBalance());
                         System.out.println("Date of Transaction:   " + i.D1.getDay() + "/" + i.D1.getMonth() + "/" + i.D1.getYear());
                         System.out.println("Time of Transaction:  " + i.getTime());
                         System.out.println("    *********************    \n\n\n");
                     }
                     else if(!i.getType().equals(null) && i.getType().equals("WithDraw Amount"))
                     {
                         System.out.println("   *********************    \n\n\n");
                         System.out.println("Transaction Type:  " + i.getType());
                         System.out.println("The Name of The Customer:  " + i.C.getName());
                         System.out.println("The Account Number of the Customer:  " + i.C.getAccountNumber());
                         System.out.println("The Account ID of the Customer:  " + i.C.getAccount_ID());
                         System.out.println("The Phone Number of the Customer:  " + i.C.getPhone_no());
                         System.out.println("The Address of the Customer:  " + i.C.getAddress());
                         System.out.println("Previous Balance of the Customer: "+i.getPreviousAmount());
                         System.out.println("The Amount that is being withdrawal from this account is: "+i.getTransactionamount());
                         System.out.println("The Current Balance of the Customer:  " + i.C.getBalance());
                         System.out.println("Date of Transaction:   " + i.D1.getDay() + "/" + i.D1.getMonth() + "/" + i.D1.getYear());
                         System.out.println("Time of Transaction:  " + i.getTime());
                         System.out.println("    *********************    \n\n\n");
                     }
                     else if (!i.getType().equals(null) && i.getType().equals("Amount Transfer From This Account"))
                     {
                         System.out.println("   *********************    \n\n\n");
                         System.out.println("Transaction Type:  " + i.getType());
                         System.out.println("The Name of The Customer:  " + i.C.getName());
                         System.out.println("The Account Number of the Customer:  " + i.C.getAccountNumber());
                         System.out.println("The Account ID of the Customer:  " + i.C.getAccount_ID());
                         System.out.println("The Phone Number of the Customer:  " + i.C.getPhone_no());
                         System.out.println("The Address of the Customer:  " + i.C.getAddress());
                         System.out.println("Previous Balance of the Customer: "+i.getPreviousAmount());
                         System.out.println("The Amount that is being Transfer From this account is : "+i.getAmounttransfer1());
                         System.out.println("The Current Balance of the Customer:  " + i.C.getBalance());
                         System.out.println("Date of Transaction:   " + i.D1.getDay() + "/" + i.D1.getMonth() + "/" + i.D1.getYear());
                         System.out.println("Time of Transaction:  " + i.getTime());
                         System.out.println("    *********************    \n\n\n");
                     }
                     else if (!i.getType().equals(null) && i.getType().equals("Amount transfer in this Account" ))
                     {
                         System.out.println("   *********************    \n\n\n");
                         System.out.println("Transaction Type:  " + i.getType());
                         System.out.println("The Name of The Customer:  " + i.C.getName());
                         System.out.println("The Account Number of the Customer:  " + i.C.getAccountNumber());
                         System.out.println("The Account ID of the Customer:  " + i.C.getAccount_ID());
                         System.out.println("The Phone Number of the Customer:  " + i.C.getPhone_no());
                         System.out.println("The Address of the Customer:  " + i.C.getAddress());
                         System.out.println("Previous Balance of the Customer: "+i.getPreviousAmount());
                         System.out.println("The Amount that is being Transfer in this account is : "+i.getAmounttransfer2());
                         System.out.println("The Current Balance of the Customer:  " + i.C.getBalance());
                         System.out.println("Date of Transaction:   " + i.D1.getDay() + "/" + i.D1.getMonth() + "/" + i.D1.getYear());
                         System.out.println("Time of Transaction:  " + i.getTime());
                         System.out.println("    *********************    \n\n\n");
                     }
                 }
            }
        }

    }
    public static void DisplayAllDeductions(String AccountNumber)
    {
        boolean b=false;
        for (Transaction i: transactions) {
            if(AccountNumber.equals(i.C.getAccountNumber())) {
                if (i.getTaxDeduction() != 0 && i.getType().equals("Tax")) {
                    b=true;
                    System.out.println("Transaction Type:  " + i.getType());
                    System.out.println("The Name of The Customer:  " + i.C.getName());
                    System.out.println("The Account Number of the Customer:  " + i.C.getAccountNumber());
                    System.out.println("The Phone Number of the Customer:  " + i.C.getPhone_no());
                    System.out.println("The Tax Deducted from Your Account is: " + i.getTaxDeduction());
                    System.out.println("The Current Balance of the Customer:  " + i.C.getBalance());
                    System.out.println("Date of Deduction:   " + i.D1.getDay() + "/" + i.D1.getMonth() + "/" + i.D1.getYear());
                }
                if (i.getZakatDeduction() != 0 && i.getType().equals("Zakat Deduction")) {
                    System.out.println("Transaction Type:  " + i.getType());
                    System.out.println("The Name of The Customer:  " + i.C.getName());
                    System.out.println("The Account Number of the Customer:  " + i.C.getAccountNumber());
                    System.out.println("The Phone Number of the Customer:  " + i.C.getPhone_no());
                    System.out.println("The Zakat Deducted from Your Account is: " + i.getZakatDeduction());
                    System.out.println("The Current Balance of the Customer:  " + i.C.getBalance());
                    System.out.println("Date of Deduction:   " + i.D1.getDay() + "/" + i.D1.getMonth() + "/" + i.D1.getYear());
                    b=true;
                }
            }

        }
        if(!b)
        {
            System.out.println("No Action Perform Related to This Field");
        }
    }
}
