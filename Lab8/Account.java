package OOP.Lab8;

import java.util.Date;

public class Account {
    String id;
    double balance;
    double AnnIntRate;
    Date date;

    public Account(String id){
        this.id = id;
        date = new Date();
    }

    public void setID(String id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setAnnIntRate(double AnnIntRate){
        this.AnnIntRate=AnnIntRate;
    }
    public String getID(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnIntRate(){
        return AnnIntRate;
    }
    public String getDate(){
        return date.toString();
    }

    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }

    public String toString(){
        return "Account ID: " + getID() +"\nBalance:" + getBalance() +"\nAnnual Interest Rate: " + getAnnIntRate()
        + "\nDate: " + getDate();
    }
}
