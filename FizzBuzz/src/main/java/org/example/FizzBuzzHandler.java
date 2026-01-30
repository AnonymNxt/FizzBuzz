package org.example;

public class FizzBuzzHandler extends Handler {

    @Override
    public String handle(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else {
            return nextHandler.handle(number);
        }
    }
}
