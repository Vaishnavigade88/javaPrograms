/*Create an abstract class &#39;Bank&#39; with an abstract method &#39;getBalance&#39;. $100, $150 and $200 are deposited
in banks A, B and C respectively. &#39;BankA&#39;, &#39;BankB&#39; and &#39;BankC&#39; are subclasses of class &#39;Bank&#39;, each
having a method named &#39;getBalance&#*/

 
abstract class Bank {
    abstract int getBalance();
}

 
class BankA extends Bank {
    private int balance = 100; 

    @Override
    int getBalance() {
        return balance;
    }
}

 
class BankB extends Bank {
    private int balance = 150;  
    @Override
    int getBalance() {
        return balance;
    }
}
/*

 
class BankC extends Bank {
    private int balance = 200; 

    @Override
    int getBalance() {
        return balance;
    }
}

 
public class Main {
    public static void main(String[] args) {
        Bank[] banks = { new BankA(), new BankB(), new BankC() };
        
        for (Bank bank : banks) {
            System.out.println("Balance in " + bank.getClass().getSimpleName() + ": $" + bank.getBalance());
        }
    }
}
