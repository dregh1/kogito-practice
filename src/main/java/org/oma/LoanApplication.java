package org.oma;

public class LoanApplication {
    private String applicant;
    private int income;
    private int amount;
    private boolean approved;

    public LoanApplication() {}

    public LoanApplication(String applicant, int income, int amount) {
        this.applicant = applicant;
        this.income = income;
        this.amount = amount;
    }

    // getters et setters
    public String getApplicant() { return applicant; }
    public void setApplicant(String applicant) { this.applicant = applicant; }

    public int getIncome() { return income; }
    public void setIncome(int income) { this.income = income; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public boolean isApproved() { return approved; }
    public void setApproved(boolean approved) { this.approved = approved; }
}
