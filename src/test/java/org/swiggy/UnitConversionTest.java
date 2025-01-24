package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitConversionTest {
    @Test
    public void testConvertLitreToMilliLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new UnitConversion(-1);});
    }

    @Test
    public void testConvertLitreToMilliLitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new UnitConversion(-100);});
    }
}