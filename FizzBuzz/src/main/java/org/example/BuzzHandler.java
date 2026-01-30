package org.example;

public class BuzzHandler extends Handler {

    @Override
    public String handle(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return nextHandler.handle(number);
        }
    }
}
