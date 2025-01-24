package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitConversionTest {

    // Test cases for convertLitreToMilliLitre
    @Test
    public void testConvertLitreToMilliLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new UnitConversion(-1);});
    }

    @Test
    public void testConvertLitreToMilliLitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new UnitConversion(-100);});
    }
    @Test
    public void testConvertLitreToMilliLitreReturnZeroWhenInputZero() {
        UnitConversion unitConversion = new UnitConversion(0);
        double result = unitConversion.convertLitreToMilliLitre();
        assertEquals(0, result);
    }

    @Test
    public void testConvertLitreToMilliLitreReturn5000WhenInput5() {
        UnitConversion unitConversion = new UnitConversion(5);
        double result = unitConversion.convertLitreToMilliLitre();
        assertEquals(5000, result);
    }

    @Test
    public void testConvertLitreToMilliLitreReturn10000WhenInput55() {
        UnitConversion unitConversion = new UnitConversion(55);
        double result = unitConversion.convertLitreToMilliLitre();
        assertEquals(55000, result);
    }

    @Test
    public void testConvertLitreToMilliLitreReturn11550WhenInput11Point55() {
        UnitConversion unitConversion = new UnitConversion(11.55);
        double result = unitConversion.convertLitreToMilliLitre();
        assertEquals(11550, result);
    }

    // Test cases for convertMilliLitreToLitre
    @Test
    public void testConvertMilliLitreToLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new UnitConversion(-1);});
    }

}