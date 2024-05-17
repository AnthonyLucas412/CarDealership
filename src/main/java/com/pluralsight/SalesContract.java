package com.pluralsight;

public class SalesContract {
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean finance;
    private double totalPrice;
    private double monthlyPayment;

    public SalesContract(double salesTax, double processingFee, double recordingFee, boolean finance) {
        this.salesTax = salesTax;
        this.processingFee = processingFee;
        this.recordingFee = recordingFee;
        this.finance = finance;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

}
