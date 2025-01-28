package org.swiggy;

public class UnitConversion implements AbstractConversion {
    protected final double value;
    private final UnitType fromUnitType;
    private final UnitType toUnitType;

    public UnitConversion(double value, UnitType fromUnitType, UnitType toUnitType) {
        if(value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
        this.fromUnitType = fromUnitType;
        this.toUnitType = toUnitType;
    }

    @Override
    public double convert() {
        return value;
    }
}
