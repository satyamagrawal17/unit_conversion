package org.swiggy;

public class MillilitreToLitre implements UnitConversion {
    private final double value;
    private final UnitType fromUnitType;
    private final UnitType toUnitType;
    public MillilitreToLitre(double value) {
        if(value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
        this.fromUnitType = UnitType.MILLILITRE;
        this.toUnitType = UnitType.LITRE;
    }

    @Override
    public double convertTo() {
        return value / 1000;
    }

}
