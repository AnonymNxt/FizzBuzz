package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class FizzHandlerTest {

    FizzHandler handler;
    Handler nextHandler;

    @BeforeEach
    void setup() {
        handler = new FizzHandler();
        nextHandler = mock(Handler.class);
        handler.setNext(nextHandler);
    }

    @Test
    void handle_shouldReturnFizz_whenNumberIsDivisibleByThree() {
        int number = 3;

        String result = handler.handle(number);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void handle_shouldCallNextHandler_whenNumberIsNotDivisibleByThree() {
        int number = 7;

        String result = handler.handle(number);

        verify(nextHandler).handle(number);
    }
}
