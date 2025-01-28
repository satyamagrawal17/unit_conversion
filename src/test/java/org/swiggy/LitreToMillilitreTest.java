package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LitreToMillilitreTest {
    // Test cases for convertLitreToMilliLitre
    @Test
    public void testConvertToLitreToMilliLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToMillilitre(-1);});
    }

    @Test
    public void testConvertToLitreToMilliLitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToMillilitre(-100);});
    }
    @Test
    public void testConvertToLitreToMilliLitreReturnZeroWhenInputZero() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(0);
        double result = litreToMillilitre.convertTo();
        assertEquals(0, result);
    }

    @Test
    public void testConvertToLitreToMilliLitreReturn5000WhenInput5() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(5);
        double result = litreToMillilitre.convertTo();
        assertEquals(5000, result);
    }

    @Test
    public void testConvertToLitreToMilliLitreReturn10000WhenInput55() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(55);
        double result = litreToMillilitre.convertTo();
        assertEquals(55000, result);
    }

    @Test
    public void testConvertToLitreToMilliLitreReturn11550WhenInput11Point55() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(11.55);
        double result = litreToMillilitre.convertTo();
        assertEquals(11550, result);
    }

}