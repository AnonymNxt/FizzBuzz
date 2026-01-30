package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BuzzHandlerTest {

    BuzzHandler handler;
    Handler nextHandler;

    @BeforeEach
    void setup() {
        handler = new BuzzHandler();
        nextHandler = mock(Handler.class);
        handler.setNext(nextHandler);
    }

    @Test
    void testHandle_WhenNumberIsDivisibleBy3And5_ReturnsFizzBuzz() {
        int number = 5;

        String result = handler.handle(number);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void testHandle_WhenNumberIsNotDivisibleBy3And5_CallsNextHandler() {
        int number = 7;

        String result = handler.handle(number);

        verify(nextHandler).handle(number);
    }
}
