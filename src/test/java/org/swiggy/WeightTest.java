package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeightTest {
    @Test
    public void testWeightGmToMGmReturnExceptionWhenInputMinus9() {
        assertThrows(IllegalArgumentException.class, () -> {new Weight(-9, WeightUnit.GRAM);});
    }

    @Test
    public void testWeightGmToMGmReturn0WhenInput0() {
        Weight weight = new Weight(0, WeightUnit.GRAM);
        Weight result = weight.convertTo(WeightUnit.MILLIGRAM);
        Weight expected = new Weight(0, WeightUnit.MILLIGRAM);
        assertEquals(expected, result);
    }

    @Test
    public void testWeightGmToMGmReturn5000WhenInput5() {
        Weight weight = new Weight(5, WeightUnit.GRAM);
        Weight result = weight.convertTo(WeightUnit.MILLIGRAM);
        Weight expected = new Weight(5000, WeightUnit.MILLIGRAM);
        assertEquals(expected, result);
    }


}
