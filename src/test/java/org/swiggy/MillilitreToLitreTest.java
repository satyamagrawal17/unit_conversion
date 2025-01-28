package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillilitreToLitreTest {
    // Test cases for convertMilliLitreToLitre
    @Test
    public void testConvertMilliLitreToLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new MillilitreToLitre(-1);});
    }

    @Test
    public void testConvertMilliLitreToLitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new MillilitreToLitre(-100);});
    }

    @Test
    public void testConvertMilliLitreToLitreReturnZeroWhenInputZero() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(0);
        double result = millilitreToLitre.convert();
        assertEquals(0, result);
    }

    @Test
    public void testConvertMilliLitreToLitreReturn5WhenInput5000() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(5000);
        double result = millilitreToLitre.convert();
        assertEquals(5, result);
    }

    @Test
    public void testConvertMilliLitreToLitreReturn55WhenInput55000() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(55000);
        double result = millilitreToLitre.convert();
        assertEquals(55, result);
    }

}