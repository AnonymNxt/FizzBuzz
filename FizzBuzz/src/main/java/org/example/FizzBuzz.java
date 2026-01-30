package org.example;

public class FizzBuzz {

    private Handler next;

    public FizzBuzz(Handler next) {
        this.next = next;
    }

    public String start(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            result.append(next.handle(i));
        }

        return result.toString().stripTrailing();
    }
}

