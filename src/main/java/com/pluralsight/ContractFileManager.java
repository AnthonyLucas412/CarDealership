package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.pluralsight.Contract;
import com.pluralsight.LeaseContract;
import com.pluralsight.SalesContract;


public class ContractFileManager {
    private static final String CONTRACTS_FILE_PATH = "contracts.csv";

    public void saveContract(Contract contract) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTRACTS_FILE_PATH, true))) {
            if (contract instanceof SalesContract salesContract) {
                writer.write("SALE|" + contract.getContractDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicleSold() + "|");
            } else if (contract instanceof LeaseContract leaseContract){
                writer.write("LEASE|" + contract.getContractDate() + "|" + contract.getCustomerName() + "|" + contract.getCustomerEmail() + "|" + contract.getVehicleSold() + "|");

            }
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}