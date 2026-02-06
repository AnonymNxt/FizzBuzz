package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultHandlerTest {

    @Test
    void handle_shouldReturnNumberAsString() {
        Handler handler = new DefaultHandler();

        String result = handler.handle(1);

        assertThat(result).isEqualTo("1");
    }
}
