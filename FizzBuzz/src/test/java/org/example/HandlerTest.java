package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;

public class HandlerTest {

    @Test
    void testSetNext() {
        Handler handler = mock(Handler.class, CALLS_REAL_METHODS);
        Handler nextHandler = mock(Handler.class);

        handler.setNext(nextHandler);

        assertThat(handler.nextHandler).isSameAs(nextHandler);
    }


}
