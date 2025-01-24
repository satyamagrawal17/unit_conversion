package org.swiggy;

public class UnitConversion {
    private final double value;
    public UnitConversion(double value) {
        if(value < 0) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }
}
