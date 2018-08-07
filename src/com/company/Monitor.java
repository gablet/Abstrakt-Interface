package com.company;

public class Monitor implements Product {
    private int id;
    private String productName;
    private int size;
    private float weight;

    public Monitor(int id, String productName, int size, float weight) {
        this.id = id;
        this.productName = productName;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public void describe() {
        System.out.printf("Name: %s(Id:)%d\r\n Size: %d\r\n Weight: %f\r\n",
                productName, id ,size, weight);
    }


}
