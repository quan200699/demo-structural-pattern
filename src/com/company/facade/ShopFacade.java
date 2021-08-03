package com.company.facade;

public class ShopFacade {
    private static final ShopFacade INSTANCE = new ShopFacade();
    private CustomerService customerService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private FeedbackService feedbackService;

    private ShopFacade() {
        customerService = new CustomerService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        feedbackService = new FeedbackService();
    }

    public static ShopFacade getInstance(){
        return INSTANCE;
    }

    public void buyProductAndUsingVisaToPayAndUsingShip(String email) {
        customerService.showAccountInfo(email);
        paymentService.pay("VISA");
        shippingService.ship();
        feedbackService.feedback();
    }

    public void buyProductAndUsingCashToPayAndWithoutShip(String email) {
        customerService.showAccountInfo(email);
        paymentService.pay("CASH");
    }
}
