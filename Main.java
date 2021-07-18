package com.company;

import com.sun.jdi.IntegerValue;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void Menu()
    {
        System.out.print("o Press 1 to Open a New Account, Close an account"
                +"\no Press 2 to Login to a specific account by providing the unique account number and Perform account operations"
                +"\no Press 3 to Specify the Interest Rate, applicable to all Saving Accounts"
                +"\no Press 4 to Calculate Zakat, applicable to all Saving Account"
                +"\no Press 5 to Display all account details, including the bank owner details"
                +"\no Press 6 to Display all accounts deductions along with account details");
    }
    public static void FilesFunctionTransaction()
    {
        File F =new File("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction");
        File [] DirectoriesFile=F.listFiles();
        for(int i=0;i< DirectoriesFile.length;i++)
        {

            try {
                String Absolutepath=DirectoriesFile[i].getAbsolutePath();
                    FileReader myreader = new FileReader(Absolutepath);
                    BufferedReader BfferReader = new BufferedReader(myreader);
                String Readline = BfferReader.readLine();
                    while(Readline!=null) {

                        if(Readline.equals("Deposit Amount"))
                        {
                            Customer C=new Customer();
                            Transaction Temp =new Transaction();
                            Temp.setType("Deposit Amount");
                            Readline = BfferReader.readLine();
                            Temp.setTime(Readline);
                            Date date =new Date();
                            Readline = BfferReader.readLine();
                            C.setName(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccountNumber(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccount_ID(Readline);
                            Readline = BfferReader.readLine();
                            C.setPhone_no(Readline);
                            Readline = BfferReader.readLine();
                            C.setAddress(Readline);
                            Readline=BfferReader.readLine();
                            Double Balance =new Double(Readline);
                            Temp.setPreviousAmount(Balance);
                            Readline=BfferReader.readLine();
                            Double Balance1 =new Double(Readline);
                            C.setBalance(Balance1);
                            Readline=BfferReader.readLine();
                            String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                            date.setDay(Integer.parseInt(splitted[0]));
                            date.setMonth(Integer.parseInt(splitted[1]));
                            date.setYear(Integer.parseInt(splitted[2]));
                            Temp.setC(C);
                            Temp.setD1(date);
                            BankAccounts.transactions.add(Temp);
                        }
                        else if(Readline.equals("WithDraw Amount"))
                        {
                            Customer C=new Customer();
                            Transaction Temp =new Transaction();
                            Temp.setType("Deposit Amount");
                            Readline = BfferReader.readLine();
                            Temp.setTime(Readline);
                            Date date =new Date();
                            Readline = BfferReader.readLine();
                            C.setName(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccountNumber(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccount_ID(Readline);
                            Readline = BfferReader.readLine();
                            C.setPhone_no(Readline);
                            Readline = BfferReader.readLine();
                            C.setAddress(Readline);
                            Readline=BfferReader.readLine();
                            Double Balance =new Double(Readline);
                            Temp.setPreviousAmount(Balance);
                            Readline=BfferReader.readLine();
                            Double Balance1 =new Double(Readline);
                            C.setBalance(Balance1);
                            Readline=BfferReader.readLine();
                            String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                            date.setDay(Integer.parseInt(splitted[0]));
                            date.setMonth(Integer.parseInt(splitted[1]));
                            date.setYear(Integer.parseInt(splitted[2]));
                            Temp.setC(C);
                            Temp.setD1(date);
                            BankAccounts.transactions.add(Temp);
                        }
                        else if (Readline.equals("Amount Transfer From This Account"))
                        {
                            Customer C=new Customer();
                            Transaction Temp =new Transaction();
                            Temp.setType("Amount Transfer From This Account");
                            Readline = BfferReader.readLine();
                            Temp.setTime(Readline);
                            Date date =new Date();
                            Readline = BfferReader.readLine();
                            C.setName(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccountNumber(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccount_ID(Readline);
                            Readline = BfferReader.readLine();
                            Double Balance2 =new Double(Readline);
                            Temp.setAmounttransfer1(Balance2);
                            Readline = BfferReader.readLine();
                            C.setPhone_no(Readline);
                            Readline = BfferReader.readLine();
                            C.setAddress(Readline);
                            Readline=BfferReader.readLine();
                            Double Balance =new Double(Readline);
                            Temp.setPreviousAmount(Balance);
                            Readline=BfferReader.readLine();
                            Double Balance1 =new Double(Readline);
                            C.setBalance(Balance1);
                            Readline=BfferReader.readLine();
                            String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                            date.setDay(Integer.parseInt(splitted[0]));
                            date.setMonth(Integer.parseInt(splitted[1]));
                            date.setYear(Integer.parseInt(splitted[2]));
                            Temp.setC(C);
                            Temp.setD1(date);
                            BankAccounts.transactions.add(Temp);
                        }
                        else if (Readline.equals("Amount transfer in this Account"))
                        {
                            Customer C=new Customer();
                            Transaction Temp =new Transaction();
                            Temp.setType("Amount transfer in this Account");
                            Readline = BfferReader.readLine();
                            Temp.setTime(Readline);
                            Date date =new Date();
                            Readline = BfferReader.readLine();
                            C.setName(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccountNumber(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccount_ID(Readline);
                            Readline = BfferReader.readLine();
                            Double Balance2 =new Double(Readline);
                            Temp.setAmounttransfer2(Balance2);
                            Readline = BfferReader.readLine();
                            C.setPhone_no(Readline);
                            Readline = BfferReader.readLine();
                            C.setAddress(Readline);
                            Readline=BfferReader.readLine();
                            Double Balance =new Double(Readline);
                            Temp.setPreviousAmount(Balance);
                            Readline=BfferReader.readLine();
                            Double Balance1 =new Double(Readline);
                            C.setBalance(Balance1);
                            Readline=BfferReader.readLine();
                            String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                            date.setDay(Integer.parseInt(splitted[0]));
                            date.setMonth(Integer.parseInt(splitted[1]));
                            date.setYear(Integer.parseInt(splitted[2]));
                            Temp.setC(C);
                            Temp.setD1(date);
                            BankAccounts.transactions.add(Temp);
                        }
                        else if (Readline.equals("Tax"))
                        {
                            Customer C=new Customer();
                            Transaction Temp =new Transaction();
                            Temp.setType("Tax");
                            Readline = BfferReader.readLine();
                            Temp.setTime(Readline);
                            Date date =new Date();
                            Readline = BfferReader.readLine();
                            C.setName(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccountNumber(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccount_ID(Readline);
                            Readline = BfferReader.readLine();
                            Double Balance2 =new Double(Readline);
                            Temp.setTaxDeduction(Balance2);
                            Readline = BfferReader.readLine();
                            C.setPhone_no(Readline);
                            Readline = BfferReader.readLine();
                            C.setAddress(Readline);
                            Readline=BfferReader.readLine();
                            Double Balance =new Double(Readline);
                            Temp.setPreviousAmount(Balance);
                            Readline=BfferReader.readLine();
                            Double Balance1 =new Double(Readline);
                            C.setBalance(Balance1);
                            Readline=BfferReader.readLine();
                            String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                            date.setDay(Integer.parseInt(splitted[0]));
                            date.setMonth(Integer.parseInt(splitted[1]));
                            date.setYear(Integer.parseInt(splitted[2]));
                            Temp.setC(C);
                            Temp.setD1(date);
                            BankAccounts.transactions.add(Temp);
                        }
                        else if (Readline.equals("Zakat Deduction"))
                        {
                            Customer C=new Customer();
                            Transaction Temp =new Transaction();
                            Temp.setType("Zakat Deduction");
                            Readline = BfferReader.readLine();
                            Temp.setTime(Readline);
                            Date date =new Date();
                            Readline = BfferReader.readLine();
                            C.setName(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccountNumber(Readline);
                            Readline = BfferReader.readLine();
                            C.setAccount_ID(Readline);
                            Readline = BfferReader.readLine();
                            Double Balance2 =new Double(Readline);
                            Temp.setZakatDeduction(Balance2);
                            Readline = BfferReader.readLine();
                            C.setPhone_no(Readline);
                            Readline = BfferReader.readLine();
                            C.setAddress(Readline);
                            Readline=BfferReader.readLine();
                            Double Balance =new Double(Readline);
                            Temp.setPreviousAmount(Balance);
                            Readline=BfferReader.readLine();
                            Double Balance1 =new Double(Readline);
                            C.setBalance(Balance1);
                            Readline=BfferReader.readLine();
                            String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                            date.setDay(Integer.parseInt(splitted[0]));
                            date.setMonth(Integer.parseInt(splitted[1]));
                            date.setYear(Integer.parseInt(splitted[2]));
                            Temp.setC(C);
                            Temp.setD1(date);
                            BankAccounts.transactions.add(Temp);
                        }
                    Readline=BfferReader.readLine();
                    }
                    myreader.close();
                    BfferReader.close();

            }catch(Exception e)
            {
                e.printStackTrace();

            }
        }
    }
    public static void FilesFunctionCheckingAccount(){
        File F=new File("C:\\Users\\SAAD\\Assignment_2\\src\\com\\CheckingAccount");
        File[] DirectoriesFile=F.listFiles();
        for(int i=0;i<DirectoriesFile.length;i++)
        {
            CheckingAccount CA=new CheckingAccount();
            Customer CustomerDetail=new Customer();
            Date CustomerDateDetails=new Date();
            String Absolutepath=DirectoriesFile[i].getAbsolutePath();
            try {
                FileReader myreader = new FileReader(Absolutepath);
                BufferedReader BfferReader=new BufferedReader(myreader);
                String Readline=BfferReader.readLine();
                CustomerDetail.setName(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setAccountNumber(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setAccount_ID(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setPhone_no(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setAddress(Readline);
                Readline=BfferReader.readLine();
                Double Balance = new Double(Readline);
                CustomerDetail.setBalance(Balance);
                Readline=BfferReader.readLine();
                String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                CustomerDateDetails.setDay(Integer.parseInt(splitted[0]));
                CustomerDateDetails.setMonth(Integer.parseInt(splitted[1]));
                CustomerDateDetails.setYear(Integer.parseInt(splitted[2]));
                CA.setC1(CustomerDetail);
                CA.setDate(CustomerDateDetails);
                CheckingAccount.checkingaccount.add(CA);
                myreader.close();
                BfferReader.close();
            }catch(Exception e)
            {
                e.printStackTrace();
                e.getStackTrace();
            }
        }
    }
    public static void FilesFunctionSavingAccount(){
        File F=new File("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount");
        File[] DirectoriesFile=F.listFiles();
        for(int i=0;i<DirectoriesFile.length;i++)
        {
            SavingAccount SA= new SavingAccount();
            Customer CustomerDetail=new Customer();
            Date CustomerDateDetails=new Date();
            String Absolutepath=DirectoriesFile[i].getAbsolutePath();
            try {
                FileReader myreader = new FileReader(Absolutepath);
                BufferedReader BfferReader=new BufferedReader(myreader);
                String Readline=BfferReader.readLine();
                CustomerDetail.setName(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setAccountNumber(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setAccount_ID(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setPhone_no(Readline);
                Readline=BfferReader.readLine();
                CustomerDetail.setAddress(Readline);
                Readline=BfferReader.readLine();
                Double Balance = new Double(Readline);
                CustomerDetail.setBalance(Balance);
                Readline=BfferReader.readLine();
                String[] splitted = Arrays.stream(Readline.split("/")).map(String::trim).toArray(String[]::new);
                CustomerDateDetails.setDay(Integer.parseInt(splitted[0]));
                CustomerDateDetails.setMonth(Integer.parseInt(splitted[1]));
                CustomerDateDetails.setYear(Integer.parseInt(splitted[2]));
                SA.setC1(CustomerDetail);
                SA.setDate(CustomerDateDetails);
                SavingAccount.savingAccounts.add(SA);
                myreader.close();
                BfferReader.close();
            }catch(Exception e)
            {
                e.printStackTrace();
                e.getStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int choice;
        int cho;
        CheckingAccount checkingAccount=new CheckingAccount();
        SavingAccount savingAccount=new SavingAccount();
        FilesFunctionCheckingAccount();
        FilesFunctionSavingAccount();
        FilesFunctionTransaction();
        do {

            Menu();

            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    int ch;
                    System.out.println("Which Account Do you want to Open: "+
                                       "\n1---Checking Account"+
                                       "\n2---Saving Account"+
                                       "\n3---Close Checking Account"+
                                       "\n4---Close Saving Account"+
                                       "\nPress anyother Key to Exit\n");
                    System.out.println("Enter Your Choice: ");
                    ch= sc.nextInt();
                    sc.nextLine();
                     if(ch==1)
                     {
                         checkingAccount.OpenAccount();
                     }
                     else if(ch==2)
                     {
                         savingAccount.OpenAccount();
                     }
                     else if(ch==3)
                     {
                         checkingAccount.CloseAccount();
                     }
                     else if(ch==4)
                     {
                         savingAccount.CloseAccount();
                     }

                    break;
                }
                case 2:
                {
                    String AccountNumber;
                    boolean flag =false;
                    boolean b=false;
                    System.out.println("Enter a Account Number You Want to Login: ");
                    AccountNumber=sc.nextLine();
                    for (CheckingAccount i: CheckingAccount.checkingaccount) {
                        if(!CheckingAccount.checkingaccount.isEmpty())
                        {
                            if(AccountNumber.equals(i.C1.getAccountNumber()))
                            {
                                b=false;
                                flag=true;
                                break;
                            }
                        }
                    }
                    for (SavingAccount i: SavingAccount.savingAccounts) {
                        if(!SavingAccount.savingAccounts.isEmpty())
                        {
                            if(AccountNumber.equals(i.C1.getAccountNumber()))
                            {
                                b=true;
                                flag=true;
                                break;
                            }
                        }
                    }
                    if(flag==true)
                    {

                        char ch;
                        System.out.println(" Do you want to perform Any Action(Y/N) ");
                        ch=sc.next().charAt(0);
                        if(ch=='y' || ch=='Y') {
                                    if(b==false)
                                    {
                                        do {
                                            System.out.println("Press 1 to Deposit Amount");
                                            System.out.println("Press 2 to Withdraw Amount");
                                            System.out.println("Press 3 to Check Balance");
                                            System.out.println("Press 4 to Transfer Amount");
                                            System.out.println("Press 5 To Calculate Tax");
                                            System.out.println("Press 6 to Print Statement");
                                            System.out.println("Press any other key to exit");
                                            System.out.print("Enter your choice: ");
                                             cho = sc.nextInt();
                                            sc.nextLine();
                                            switch (cho) {
                                                case 1: {
                                                    BankAccounts.makeDeposit(AccountNumber);
                                                    break;
                                                }
                                                case 2: {
                                                    BankAccounts.makeWithdrawal(AccountNumber);
                                                    break;
                                                }
                                                case 3: {
                                                    BankAccounts.CheckBalance(AccountNumber);
                                                    break;
                                                }
                                                case 4: {
                                                    BankAccounts.transferAmount(AccountNumber);
                                                    break;
                                                }
                                                case 5: {
                                                    checkingAccount.CalculateTax(AccountNumber);
                                                    break;
                                                }
                                                case 6:
                                                {
                                                    BankAccounts.printStatement(AccountNumber);
                                                    break;
                                                }
                                                default:
                                                    break;
                                            }
                                        }while(cho>0 && cho<6);
                        }
                                    else if (b==true)
                                    {
                                        do {
                                            System.out.println("Press 1 to Deposit Amount");
                                            System.out.println("Press 2 to Withdraw Amount");
                                            System.out.println("Press 3 to Check Balance");
                                            System.out.println("Press 4 to Transfer Amount");
                                            System.out.println("Press 5 to Add and Calculate  Zakat");
                                            System.out.println("Press 6 to Add and Calculate Interest for your Account");
                                            System.out.println("Press 7 to Print Statement");
                                            System.out.println("Press any other key to exit");
                                            System.out.print("Enter your choice: ");
                                             cho = sc.nextInt();
                                            sc.nextLine();
                                            if (cho == 1) {
                                                BankAccounts.makeDeposit(AccountNumber);
                                            } else if (cho == 2) {
                                                BankAccounts.makeWithdrawal(AccountNumber);
                                            } else if (cho == 3) {
                                                BankAccounts.CheckBalance(AccountNumber);
                                            } else if (cho == 4) {
                                                BankAccounts.transferAmount(AccountNumber);
                                            } else if (cho == 5) {
                                                savingAccount.CalculateZakat(AccountNumber);
                                            } else if (cho == 6) {
                                                savingAccount.CalculateInterest(AccountNumber);
                                            }
                                            else if(cho==7)
                                            {
                                                BankAccounts.printStatement(AccountNumber);
                                            }
                                        }while(cho>0 && cho<8);

                                    }
                        }
                    }
                    else if (flag==false)
                    {
                        System.out.println("Sorry! No Account Found");
                    }
                    break;
                }
                case 3:
                {
                    String AccountNumber;
                    System.out.println("Enter a Account Number You Want to Login: ");
                    AccountNumber=sc.nextLine();
                    savingAccount.CalculateInterest(AccountNumber);
                    break;
                }
                case 4:
                {
                    String AccountNumber;
                    System.out.println("Enter a Account Number You Want to Login: ");
                    AccountNumber=sc.nextLine();
                    savingAccount.CalculateZakat(AccountNumber);
                    break;
                }
                case 5:
                {
                    savingAccount.printDetails();
                    checkingAccount.printDetails();
                    break;
                }
                case 6:
                {
                    String AccountNumber;
                    System.out.println("Enter a Account Number You Want to Login: ");
                    AccountNumber=sc.nextLine();
                    BankAccounts.DisplayAllDeductions(AccountNumber);
                    break;
                }
            }
        }while(choice>0 && choice<=6);
    }
}
