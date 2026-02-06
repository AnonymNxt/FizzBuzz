package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzIT {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz(
            new FizzBuzzHandler()
                .setNext(new FizzHandler()
                    .setNext(new BuzzHandler()
                        .setNext(new DefaultHandler()))));
    }

    @Test
    void testFizzBuzzIntegration_WithNumber15_ReturnsCompleteSequence() {
        String result = fizzBuzz.start(15);

        assertThat(result).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
    }
}
