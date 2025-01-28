package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillilitreToLitreTest {
    // Test cases for convertMilliLitreToLitre
    @Test
    public void testConvertToMilliLitreToLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new MillilitreToLitre(-1);});
    }

    @Test
    public void testConvertToMilliLitreToLitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new MillilitreToLitre(-100);});
    }

    @Test
    public void testConvertToMilliLitreToLitreReturnZeroWhenInputZero() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(0);
        double result = millilitreToLitre.convertTo();
        assertEquals(0, result);
    }

    @Test
    public void testConvertToMilliLitreToLitreReturn5WhenInput5000() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(5000);
        double result = millilitreToLitre.convertTo();
        assertEquals(5, result);
    }

    @Test
    public void testConvertToMilliLitreToLitreReturn55WhenInput55000() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(55000);
        double result = millilitreToLitre.convertTo();
        assertEquals(55, result);
    }

    @Test
    public void testConvertToMilliLitreToLitreReturn11Point55WhenInput11550() {
        UnitConversion millilitreToLitre = new MillilitreToLitre(11550);
        double result = millilitreToLitre.convertTo();
        assertEquals(11.55, result);
    }

}