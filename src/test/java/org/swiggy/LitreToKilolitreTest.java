package org.swiggy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LitreToKilolitreTest {

    // Test cases for convert Litre to Kilolitre
    @Test
    public void testConvertToLitreToKilolitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToKilolitre(-1);});
    }

    @Test
    public void testConvertToLitreToKilolitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToKilolitre(-100);});
    }

    @Test
    public void testConvertToLitreToKilolitreReturnZeroWhenInputZero() {
        UnitConversion litreToKilolitre = new LitreToKilolitre(0);
        double result = litreToKilolitre.convertTo();
        assertEquals(0, result);
    }

    @Test
    public void testConvertToLitreToKilolitreReturn5WhenInput5000() {
        UnitConversion litreToKilolitre = new LitreToKilolitre(5000);
        double result = litreToKilolitre.convertTo();
        assertEquals(5, result);
    }

}
