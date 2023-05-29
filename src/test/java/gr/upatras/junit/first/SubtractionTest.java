package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractionTest {
    @Test
    void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        String result = subtraction.subtraction(10, 5);
        assertEquals("POSITIVE", result, "10 - 5 must be POSITIVE");
    }
}
