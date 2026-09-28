package bank.loans;

public class Loan {
    private String loanNumber;
    private String loanType;
    private double loanAmount;

    public Loan(String loanNumber, String loanType, double loanAmount) {
        this.loanNumber = loanNumber;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    public void displayLoan() {
        System.out.println("----- Loan Details -----");
        System.out.println("Loan Number : " + loanNumber);
        System.out.println("Loan Type   : " + loanType);
        System.out.println("Loan Amount : Rs. " + loanAmount);
    }
}