package org.swiggy;

public class LitreToMillilitre implements UnitConversion {
    private final double value;
    private final UnitType fromUnitType;
    private final UnitType toUnitType;
    public LitreToMillilitre(double value) {
        if(value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
        this.fromUnitType = UnitType.LITRE;
        this.toUnitType = UnitType.MILLILITRE;
    }
    @Override
    public double convertTo() {
        return value * 1000;
    }
}
