package com.company;

public class Keyboard implements  Product {
    private int id;
    private String productName;
    private boolean gotNumerickKeypad;
    private String color;
    private boolean isWireless;

    public Keyboard(int id, String productName, boolean gotNumerickKeypad, String color, boolean isWireless) {
        this.id = id;
        this.productName = productName;
        this.gotNumerickKeypad = gotNumerickKeypad;
        this.color = color;
        this.isWireless = isWireless;
    }

    @Override
    public void describe(){
        System.out.printf("Name: %s(Id:)%d\n Color: %s\r\n GotNumericKeyboard: %s\r\n IsWireless %s\r\n",
                productName,id, color,gotNumerickKeypad,isWireless);
    }
}
