package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

       private Dealership dealership;
       private Scanner myScanner;

    public UserInterface() {
        myScanner = new Scanner(System.in);
    }
    public void display(){

    }
    public void processGetByPriceRequest(){

    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetbyYearRequest(){

    }
    public void  processGetbyColorRequest(){

    }
    public void processGetbyMileageRequest(){

    }
    public void processGetbyVehicleRequest(){

    }
    public void processGetAllVehiclesRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
    private void init(){
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }
}
