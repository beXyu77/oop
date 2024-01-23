package OOP.Lab8;

public class Checking 
extends Account{
    double overdraftLimit;

    public Checking(String id){
        super(id);
    }

    @Override
    public void withdraw(double amount){
        if(super.balance - amount <= 0){
            amount = 0;
            System.out.println("Your account has not enough money.");
        }else
        super.balance-=amount;
    }
}
