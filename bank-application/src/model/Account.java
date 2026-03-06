package model;

import java.time.LocalDate;

public class Account {
    private long accNumber;
    private int customerId;
    private String accountType;
    private double bankBalance;
    private String Status;
    private LocalDate openingDate;

    public Account(long accNumber, int customerId, String accountType, double bankBalance, String status, LocalDate openingDate) {
        this.accNumber = accNumber;
        this.customerId = customerId;
        this.accountType = accountType;
        this.bankBalance = bankBalance;
        Status = status;
        this.openingDate = openingDate;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }
}
