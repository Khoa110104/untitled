package oop.tuan.lab11.strategy.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsParent()){
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount()-paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm'yy': ");
            String date = READER.readLine();
            System.out.println("Enter the Card Verification Value code:");
            String cardVerificationValue = READER.readLine();
            if (CreditCardValidator.isValid(number)) {
                card = new CreditCard(number, date, cardVerificationValue);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private boolean cardIsParent() {
        return card != null;
    }
}
