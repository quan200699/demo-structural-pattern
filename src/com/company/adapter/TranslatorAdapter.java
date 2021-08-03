package com.company.adapter;

public class TranslatorAdapter implements VietnameseTarget{
    private EnglishAdaptee englishAdaptee;

    public TranslatorAdapter(EnglishAdaptee englishAdaptee) {
        this.englishAdaptee = englishAdaptee;
    }

    @Override
    public void sendMessage(String message) {
        englishAdaptee.receiveMessage("Hello");
    }
}
