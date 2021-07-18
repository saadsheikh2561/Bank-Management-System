package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckingAccount extends BankAccounts{
     public static ArrayList<CheckingAccount> checkingaccount=new ArrayList<CheckingAccount>();
     Date date;

     private double Taxpertransaction=10;
    CheckingAccount()
    {
        super();
    }

    public void setTaxpertransaction(double taxpertransaction) {
        Taxpertransaction = taxpertransaction;
    }

    public double getTaxpertransaction() {
        return Taxpertransaction;
    }
    @Override
    public void setC1(Customer c1) {
        super.setC1(c1);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public Customer getC1() {
        return super.getC1();
    }
    @Override
    public void OpenAccount ()  {



        char choice;
      do {
          Customer temp=new Customer();
          CheckingAccount temp2=new CheckingAccount();
          Date d1=new Date();

          Scanner sc=new Scanner(System.in);
          String Name,Phone_no,Address,account_id;
          String AccountNumber;
          double Balance;

          System.out.print("Enter The Account ID: ");
          account_id = sc.nextLine();
          for (CheckingAccount i: checkingaccount) {
              if(account_id.equals(i.C1.getAccount_ID()))
              {
                  System.out.println("You must have to enter a Unique ID ");
                  System.out.print("Enter The Account ID Again: ");
                  account_id = sc.nextLine();
                  break;
              }
          }
          for (SavingAccount i: SavingAccount.savingAccounts) {
              if(account_id.equals(i.C1.getAccount_ID()))
              {
                  System.out.println("You must have to enter a Unique ID ");
                  System.out.print("Enter The Account ID Again: ");
                  account_id = sc.nextLine();
                  break;
              }
          }
          System.out.println("Enter The Account Number: ");
          AccountNumber= sc.nextLine();
          for (CheckingAccount i: checkingaccount) {
              if(AccountNumber.equals(i.C1.getAccountNumber()))
              {
                  System.out.println("You must have to enter a Unique ID ");
                  System.out.print("Enter The Account Number Again: ");
                  AccountNumber = sc.nextLine();
                  break;
              }
          }
          for (SavingAccount i: SavingAccount.savingAccounts) {
              if(AccountNumber.equals(i.C1.getAccountNumber()))
              {
                  System.out.println("You must have to enter a Unique ID ");
                  System.out.print("Enter The Account Number Again: ");
                  AccountNumber = sc.nextLine();
                  break;
              }
          }
          System.out.print("Enter The Name of The Customer: ");
          Name = sc.nextLine();
          System.out.print("Enter the Phone_no of Customer: ");
          Phone_no = sc.nextLine();
          System.out.print("Enter the Address of Customer: ");
          Address = sc.nextLine();
          System.out.println("Enter The Amount of Balance You Want to Deposit: ");
          Balance= sc.nextDouble();
          sc.nextLine();
          System.out.println("Enter The Day : ");
          int Day=sc.nextInt();
          System.out.println("Enter The month: ");
          int month=sc.nextInt();
          System.out.println("Enter The Year: ");
          int Year=sc.nextInt();
          d1.setDay(Day);
          d1.setMonth(month);
          d1.setYear(Year);
          temp.setAccount_ID(account_id);
          temp.setName(Name);
          temp.setAddress(Address);
          temp.setPhone_no(Phone_no);
          temp.setAccountNumber(AccountNumber);
          temp.setBalance(Balance);
          temp2.setDate(d1);
          temp2.setC1(temp);
          checkingaccount.add(temp2);
          for (CheckingAccount i: checkingaccount) {
                try{
                    FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+AccountNumber+".txt");

                  F1.write (i.C1.getName() + "\n"
                              + i.C1.getAccountNumber() +"\n"
                              + i.C1.getAccount_ID() + "\n"
                              + i.C1.getPhone_no() +"\n"
                              + i.C1.getAddress() +"\n"
                              + i.C1.getBalance() +"\n"
                              + i.date.getDay() + "/" + i.date.getMonth() + "/" + i.date.getYear() );

                    F1.close();

                }
                catch(Exception e)
                {
                    System.out.println("An Error Occured");
                    e.getStackTrace();
                }
          }

          System.out.print("Do you want to add another account?(Y/N)");
          choice=sc.next().charAt(0);
      }while(choice!='N' && choice!='n');

    }
    @Override
    public void CloseAccount()
    {
        Scanner Sc=new Scanner(System.in);
        String AccountNumber;
        boolean flag=false;
        System.out.println("Enter a Account Number you want to Close: ");
        AccountNumber=Sc.nextLine();
        try {
            File F1 = new File("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+AccountNumber+".txt");
            File F2 = new File("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt");
            if(F2.delete())
            {
                System.out.println("Deleted the file: " + F1.getName());
            }
            else
            {
                System.out.println("Failed to delete the file.");
            }
            if (F1.delete()) {
                System.out.println("Deleted the file: " + F1.getName());
            }
            else {
                System.out.println("Failed to delete the file.");
            }

        } catch (Exception e)
        {
            System.out.println("An error Occurred");
            e.getStackTrace();
        }
        for (CheckingAccount i: checkingaccount) {
            if(!CheckingAccount.checkingaccount.isEmpty())
            {
                if(AccountNumber.equals(i.C1.getAccountNumber()))
                {
                    flag=true;
                    checkingaccount.remove(i);
                    System.out.println("The Account Has been Successfully Deleeted");
                    break;
                }
            }
        }
        if(!flag)
        {
            System.out.println(" ");
        }

    }
    public void CalculateTax(String AccountNumber) {
        Scanner sc = new Scanner(System.in);
        int TaxMonth;
        double Tax=0;
        int counter = 0;
        int TaxYear;
        boolean b=false;
        System.out.println("Enter the Month in which You want to Calculate Tax: ");
        TaxMonth = sc.nextInt();
        System.out.println("Enter the Year in which You want to Calculate Tax: ");
        TaxYear=sc.nextInt();
        sc.nextLine();
        while (TaxMonth< 0 || TaxMonth > 12) {
            System.out.println("Enter the Month in which You want to Calculate Tax: ");
            TaxMonth = sc.nextInt();
            System.out.println("Enter the Year in which You want to Calculate Tax: ");
            TaxYear=sc.nextInt();
            sc.nextLine();
        }
        for (Transaction i : transactions) {
            if(AccountNumber.equals(i.C.getAccountNumber())) {
                if (TaxMonth == i.D1.getMonth() && TaxYear == i.D1.getYear()) {
                    counter++;
                    b=true;
                }
            }
        }

            if (counter <= 2) {
                Tax = 0;
                System.out.println("Tax Calculated And Add to your Account is "+Tax);
            } else {
                Tax = this.Taxpertransaction * (counter - 2);

                for(CheckingAccount i:CheckingAccount.checkingaccount)
                {
                    if(AccountNumber.equals(i.C1.getAccountNumber()))
                    {
                        i.C1.setBalance(i.C1.getBalance()-Tax);
                        try{
                            FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount\\"+AccountNumber+".txt");

                            F1.write (i.C1.getName() + "\n"
                                    + i.C1.getAccountNumber() +"\n"
                                    + i.C1.getAccount_ID() + "\n"
                                    + i.C1.getPhone_no() +"\n"
                                    + i.C1.getAddress() +"\n"
                                    + i.C1.getBalance() +"\n"
                                    + i.date.getDay() + "/" + i.date.getMonth() + "/" + i.date.getYear() );

                            F1.close();

                        }
                        catch(Exception e)
                        {
                            System.out.println("An Error Occured");
                            e.getStackTrace();
                        }
                        break;
                    }
                }

                for(Transaction i: transactions)
                {
                    if(AccountNumber.equals(i.C.getAccountNumber()))
                    {
                        Scanner Sc=new Scanner(System.in);
                        Transaction T=new Transaction();
                        Customer C2=new Customer();
                        Date D=new Date();
                        T.setTaxDeduction(Tax);
                        T.setType("Tax");
                        System.out.println("Enter Day: ");
                        int Day=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Month: ");
                        int mon=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Year: ");
                        int year=sc.nextInt();
                        sc.nextLine();
                        D.setMonth(mon);
                        D.setDay(Day);
                        D.setYear(year);
                        C2.setName(i.C.getName());
                        C2.setBalance(i.C.getBalance());
                        C2.setAddress(i.C.getAddress());
                        C2.setPhone_no(i.C.getPhone_no());
                        C2.setAccountNumber(i.C.getAccountNumber());
                        C2.setAccount_ID(i.C.getAccount_ID());
                        T.setC(C2);
                        T.setD1(D);
                        transactions.add(T);
                        try{
                            FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt",true);

                            F1.append(T.getType()+"\n"
                                    +T.getTime()+"\n"
                                    +T.getC().getName()+"\n"
                                    +T.getC().getAccountNumber()+"\n"
                                    +T.getC().getAccount_ID()+"\n"
                                    +T.getTaxDeduction()+"\n"
                                    +T.getC().getPhone_no()+"\n"
                                    +T.getC().getAddress()+"\n"
                                    +T.getPreviousAmount()+"\n"
                                    +T.getC().getBalance()+"\n"
                                    +T.getD1().getDay()+"/"+T.getD1().getMonth()+"/"+T.getD1().getYear()+"\n");

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
                System.out.println("Tax Calculated And Add to your Account is "+Tax);
            }


        if(!b)
        {
            System.out.println("No! Account Found Sorry");
        }
    }
    public void printDetails()
    {
        for(CheckingAccount i: checkingaccount)
        {
            System.out.println("    *********************    \n\n\n");
            System.out.println("The account Type is Checking");
            System.out.println("The Name of the Customer is: "+i.C1.getName());
            System.out.println("The Account Number of the Customer:  " + i.C1.getAccountNumber());
            System.out.println("The Account ID of the Customer:  " + i.C1.getAccount_ID());
            System.out.println("The Phone Number of the Customer:  " + i.C1.getPhone_no());
            System.out.println("The Address of the Customer:  " + i.C1.getAddress());
            System.out.println("The Balance of the Customer:  " + i.C1.getBalance());
            System.out.println("The Date in which account Has been Opened: "+i.date.getDay()+"/"+i.date.getMonth()+"/"+i.date.getYear());
            System.out.println("    *********************    \n\n\n");

        }
    }

}
