package com.pattern.behavioral.chain_of_responsibility;

public class Chain {
    public static void main(String[] args) {
        Notifier reportNotifier = new Report(Priority.ROUTINE);
        Notifier emailNotifier = new Email(Priority.IMPORTANT);
        Notifier smsNotifier = new Sms(Priority.ASAP);

        reportNotifier.setNext(emailNotifier);
        emailNotifier.setNext(smsNotifier);

        reportNotifier.notifyManager("Hurry up!", Priority.IMPORTANT);
    }
}
