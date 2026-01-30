package org.example;

public class FizzHandler extends Handler {

    @Override
    public String handle(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            return nextHandler.handle(number);
        }
    }
}
