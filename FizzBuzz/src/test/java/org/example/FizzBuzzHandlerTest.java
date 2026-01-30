package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FizzBuzzHandlerTest {

    FizzBuzzHandler handler;
    Handler nextHandler;

    @BeforeEach
    void setup() {
        handler = new FizzBuzzHandler();
        nextHandler = mock(Handler.class);
        handler.setNext(nextHandler);
    }

    @Test
    void testHandle_WhenNumberIsDivisibleBy3And5_ReturnsFizzBuzz() {
        int number = 15;

        String result = handler.handle(number);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void handle_shouldCallNextHandler_whenNumberIsNotDivisibleBy3And5() {
        int number = 7;

        String result = handler.handle(number);

        verify(nextHandler).handle(number);
    }
}
