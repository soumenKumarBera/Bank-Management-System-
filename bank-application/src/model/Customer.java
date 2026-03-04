package model;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String aadres;
    private String panNumber;
    private long aadharNumber;

    public Customer(long aadharNumber, String panNumber, String aadres, String phoneNumber, String email, String lastName, String firstName){
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.aadres = aadres;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;

    };


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAadres() {
        return aadres;
    }

    public void setAadres(String aadres) {
        this.aadres = aadres;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}
