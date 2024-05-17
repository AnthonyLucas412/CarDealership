package com.pluralsight;

public abstract class Contract {
    private String contractDate;
    private String customerName;
    private String customerEmail;
    private Boolean vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String contractDate, Boolean vehicleSold, String customerEmail, String customerName) {
        this.contractDate = contractDate;
        this.vehicleSold = vehicleSold;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Boolean getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();

public abstract double getMonthlyPayment();


}
