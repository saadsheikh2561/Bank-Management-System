package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SavingAccount extends BankAccounts{
    public static ArrayList<SavingAccount> savingAccounts=new ArrayList<SavingAccount>();
    static double Interest_Rate=7;
    SavingAccount()
    {
        super();
    }


    @Override
    public void setC1(Customer c1) {
        super.setC1(c1);
    }





    @Override
    public Customer getC1() {
        return super.getC1();
    }

    @Override
    public void setDate(Date date) {
        super.setDate(date);
    }

    @Override
    public Date getDate() {
        return super.getDate();
    }

    @Override
    public void OpenAccount() throws IOException {

        char choice;
        do {
            Customer temp=new Customer();
            SavingAccount temp2=new SavingAccount();
            Date d1=new Date();

            Scanner sc=new Scanner(System.in);
            String Name,Phone_no,Address,account_id;
            String AccountNumber;
            double Balance;

            System.out.print("Enter The Account ID: ");
            account_id = sc.nextLine();
            for (CheckingAccount i:CheckingAccount.checkingaccount) {
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
            for (CheckingAccount i: CheckingAccount.checkingaccount) {
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
            savingAccounts.add(temp2);
            for (SavingAccount i: savingAccounts) {
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

            }


            System.out.print("Do you want to add another account?(Y/N)");
            choice=sc.next().charAt(0);
        }while(choice!='N' && choice!='n');

    }
    @Override
    public void CloseAccount() {
        Scanner Sc = new Scanner(System.in);
        String AccountNumber;
        boolean flag = false;
        System.out.println("Enter a Account Number you want to Close: ");
        AccountNumber = Sc.nextLine();
        try {
            File F1 = new File("C:\\Users\\SAAD\\Assignment_2\\src\\com\\SavingAccount\\"+AccountNumber+".txt");
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
        for (SavingAccount i: savingAccounts) {
            if(!SavingAccount.savingAccounts.isEmpty())
            {
                if(AccountNumber.equals(i.C1.getAccountNumber()))
                {
                    flag=true;
                    savingAccounts.remove(i);
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

    public void CalculateZakat(String AccountNumber) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        double Zakat;
        for (SavingAccount i : SavingAccount.savingAccounts) {
            if (!SavingAccount.savingAccounts.isEmpty()) {
                if (AccountNumber.equals(i.C1.getAccountNumber())) {

                    flag = true;
                    if (i.C1.getBalance() > 20000) {

                        Zakat = (i.C1.getBalance() * 2.5) / 100;
                        System.out.println("The Zakat Calculated is :" + Zakat);
                        i.C1.setBalance(i.C1.getBalance()-Zakat);
                        Transaction T=new Transaction();
                        Customer customer=new Customer();
                        Date D=new Date();
                        T.setType("Zakat Deduction");
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
                        T.setZakatDeduction(Zakat);
                        customer.setName(i.C1.getName());
                        customer.setBalance(i.C1.getBalance());
                        customer.setAddress(i.C1.getAddress());
                        customer.setPhone_no(i.C1.getPhone_no());
                        customer.setAccountNumber(i.C1.getAccountNumber());
                        customer.setAccount_ID(i.C1.getAccount_ID());
                        T.setC(customer);
                        T.setD1(D);
                        transactions.add(T);
                        try{
                            FileWriter F1=new FileWriter("C:\\Users\\SAAD\\Assignment_2\\src\\com\\Transaction\\"+AccountNumber+".txt",true);

                            F1.append(T.getType()+"\n"
                                    +T.getTime()+"\n"
                                    +T.getC().getName()+"\n"
                                    +T.getC().getAccountNumber()+"\n"
                                    +T.getC().getAccount_ID()+"\n"
                                    +T.getZakatDeduction()+"\n"
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
                    } else {
                        System.out.println("No Zakat Caculated Because you have Balance Less Than 20000");
                        break;
                    }
                }
            }

        }
        if (!flag) {
            System.out.println("Sorry!....There is no Account Found with given Account Number ");
        }
    }
    public void CalculateInterest(String AccountNumber)
    {
        Scanner sc=new Scanner(System.in);
        char choice;
        double interest;
        boolean flag=false;

        System.out.println("Do you want to Change the Interest Rate(Y/N): ");
        choice=sc.next().charAt(0);
        if(choice=='Y' || choice=='y')
        {
            System.out.println("Enter The Interest Rate: ");
            Interest_Rate=sc.nextDouble();
        }
        else
        {
            for (SavingAccount i : SavingAccount.savingAccounts) {
                if (!SavingAccount.savingAccounts.isEmpty()) {
                    if (AccountNumber.equals(i.C1.getAccountNumber())) {
                        flag = true;
                        interest = (Interest_Rate*i.C1.getBalance())/100;;
                        i.C1.setBalance(i.C1.getBalance()+interest);
                        System.out.println("The Interest Calculated is :" + interest);
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
                System.out.println("Sorry!....There is no Account Found with given Account Number");
            }
        }
    }
    public void printDetails()
    {
        for(SavingAccount i: savingAccounts)
        {
            System.out.println("    *********************    \n\n\n");
            System.out.println("The account Type is Saving");
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
