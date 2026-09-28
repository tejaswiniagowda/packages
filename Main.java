import bank.customers.Customer;
import bank.loans.Loan;
import bank.accounts.Account;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("C101", "Rahul", "9876543210");
        Loan l = new Loan("L201", "Home Loan", 500000);
        Account a = new Account("A301", "Savings", 20000);

        c.displayCustomer();
        System.out.println();
        l.displayLoan();
        System.out.println();

        a.displayBalance();
        a.deposit(10000);      // valid deposit
        a.withdraw(5000);      // withdraw within balance
        a.withdraw(80000);     // more than balance
        a.deposit(-2000);      // negative deposit
        a.displayBalance();
    }
}