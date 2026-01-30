package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzTest {

    private final Handler handler = mock(Handler.class);

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz(handler);
    }

    @Test
    void start_shouldReturnOne_whenMethodeIsCalledWithNumberOne() {
        when(handler.handle(1)).thenReturn("1");

        assertThat(fizzBuzz.start(1).equals("1"));
    }


    @Test
    void start_shouldReturnOneTwo_whenMethodeIsCalledWithNumberTwo() {
        when(handler.handle(1)).thenReturn("1");
        when(handler.handle(2)).thenReturn("2");

        assertThat(fizzBuzz.start(2).equals("1 2"));
    }
}
