package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Processor cpu1 = new Processor(1,"Intel coe 17",3000,50);
        Processor cpu2 = new Processor(2,"Amd threadripper",3500,100);
        Keyboard kbd = new Keyboard(3,"Microsoft Natural Key",false,"Black",true);
        Monitor monitor = new Monitor(4,"Samsung T191T0",50,8.0f);


        List<Product> productList = new ArrayList<Product>();
        productList.add(cpu1);
        productList.add(cpu2);
        productList.add(kbd);
        productList.add(monitor);

        monitor.describe();
    }

    public static void printProduct(List<Product> products) {
        for (final var product : products) {
            product.describe();
        }
    }
}
