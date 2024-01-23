package OOP.Lab8;

public class Saving 
extends Account{

    int limit=5;
    int withdraw_no= 1;

    public Saving(String name){
        super(name);
    }
    
    public void withdraw(double amount){
        if((super.balance - amount > 0) && (withdraw_no <= limit)){
            super.balance -= amount;
            System.out.println(withdraw_no);
            System.out.println(balance);
            withdraw_no++;
        }else
        System.out.println("Your withdraw cannot be process.");
        System.out.println("This month you attemp to withdraw " + withdraw_no + " times.");
    }
}
