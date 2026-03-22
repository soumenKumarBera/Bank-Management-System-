package model;

import java.time.LocalDate;

public class Transaction {
    private int transactionId;
    private long accountNumber;
    private String transactionType;
    private double amount;
    private LocalDate timestamp;
    private long relatedAccountNumber;
    private String description;

    public Transaction(long accountNumber, String transactionType, double amount, LocalDate timestamp, long relatedAccountNumber, String description) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = timestamp;
        this.relatedAccountNumber = relatedAccountNumber;
        this.description = description;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRansactionType() {
        return transactionType;
    }

    public void setRansactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public long getRelatedAccountNumber() {
        return relatedAccountNumber;
    }

    public void setRelatedAccountNumber(long relatedAccountNumber) {
        this.relatedAccountNumber = relatedAccountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
