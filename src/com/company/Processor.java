package com.company;

public class Processor implements Product {
    private int id;
    private String productName;
    private int frequency;
    private int numberOfcores;

    public Processor(int id, String productName, int frequency, int numberOfcores) {
        this.id = id;
        this.productName = productName;
        this.frequency = frequency;
        this.numberOfcores = numberOfcores;
    }

    @Override
    public void describe(){
        System.out.printf("Name: %s(Id:)%d\r\n Frequency: %d\r\n NumberOfCores: %d\r\n",
                productName,id, frequency,numberOfcores);
    }
}
