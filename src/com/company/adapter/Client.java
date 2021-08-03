package com.company.adapter;

public class Client {
    public static void main(String[] args) {
        EnglishAdaptee englishAdaptee = new EnglishAdaptee();
        VietnameseTarget vietnameseTarget = new TranslatorAdapter(englishAdaptee);
        vietnameseTarget.sendMessage("Xin chào");
    }
}
