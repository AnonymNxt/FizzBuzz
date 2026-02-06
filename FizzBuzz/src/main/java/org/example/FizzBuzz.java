package org.example;

public class FizzBuzz {

    private final Handler next;

    public FizzBuzz(Handler next) {
        this.next = next;
    }

    public String start(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            result.append(next.handle(i)).append(" ");
        }

        return result.toString().stripTrailing();
    }
}

