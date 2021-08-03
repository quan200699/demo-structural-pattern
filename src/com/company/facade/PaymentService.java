package com.company.facade;

public class PaymentService {
    public void pay(String type){
        switch (type){
            case "VISA":{
                System.out.println("Thanh toán qua visa");
                break;
            }
            case "CASH": {
                System.out.println("Thanh toán qua tiền mặt");
                break;
            }
            default:{
                System.out.println("Không có hình thức thanh toán này");
                break;
            }
        }
    }
}
