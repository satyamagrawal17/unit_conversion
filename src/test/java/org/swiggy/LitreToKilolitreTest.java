package org.swiggy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LitreToKilolitreTest {

    // Test cases for convert Litre to Kilolitre
    @Test
    public void testConvertLitreToKilolitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToKilolitre(-1);});
    }

    @Test
    public void testConvertLitreToKilolitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToKilolitre(-100);});
    }

    @Test
    public void testConvertLitreToKilolitreReturnZeroWhenInputZero() {
        UnitConversion litreToKilolitre = new LitreToKilolitre(0);
        double result = litreToKilolitre.convert();
        assertEquals(0, result);
    }

}
