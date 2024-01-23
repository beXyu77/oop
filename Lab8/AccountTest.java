package OOP.Lab8;

public class AccountTest {
    public static void main(String[] args){
        Saving a = new Saving("Galileo");
        Checking b = new Checking("Albert");

        a.deposit(1000000);
        a.withdraw(2000000);
        a.withdraw(10);
        a.withdraw(10);
        a.withdraw(10);
        a.withdraw(10);
        a.withdraw(10);

        b.deposit(1000000);
        b.withdraw(2000000);
    }
}
