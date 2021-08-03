package com.company.facade;

public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductAndUsingVisaToPayAndUsingShip("quan.nguyen@codegym.vn");
    }
}
