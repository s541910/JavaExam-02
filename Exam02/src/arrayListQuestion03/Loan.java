/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListQuestion03;

/**
 *
 * @author Ramu Vallapurapu
 */
public class Loan {

    private String accountType;
    private double loanAmount;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Loan(String accountType, double loanAmount) {
        this.accountType = accountType;
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan{" + "accountType=" + accountType + ", loanAmount=" + loanAmount + '}';
    }

}
