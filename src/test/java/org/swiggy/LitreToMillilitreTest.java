package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LitreToMillilitreTest {
    // Test cases for convertLitreToMilliLitre
    @Test
    public void testConvertLitreToMilliLitreReturnExceptionWhenInputMinus1() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToMillilitre(-1);});
    }

    @Test
    public void testConvertLitreToMilliLitreReturnExceptionWhenInputMinus100() {
        assertThrows(IllegalArgumentException.class, () -> {new LitreToMillilitre(-100);});
    }
    @Test
    public void testConvertLitreToMilliLitreReturnZeroWhenInputZero() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(0);
        double result = litreToMillilitre.convert();
        assertEquals(0, result);
    }

    @Test
    public void testConvertLitreToMilliLitreReturn5000WhenInput5() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(5);
        double result = litreToMillilitre.convert();
        assertEquals(5000, result);
    }

    @Test
    public void testConvertLitreToMilliLitreReturn10000WhenInput55() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(55);
        double result = litreToMillilitre.convert();
        assertEquals(55000, result);
    }

    @Test
    public void testConvertLitreToMilliLitreReturn11550WhenInput11Point55() {
        UnitConversion litreToMillilitre = new LitreToMillilitre(11.55);
        double result = litreToMillilitre.convert();
        assertEquals(11550, result);
    }

}