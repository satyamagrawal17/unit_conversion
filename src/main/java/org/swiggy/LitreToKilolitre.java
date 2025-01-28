package org.swiggy;

public class LitreToKilolitre implements UnitConversion {

    private final double value;
    private final UnitType fromUnitType;
    private final UnitType toUnitType;
    public LitreToKilolitre(double value) {
        if(value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = value;
        this.fromUnitType = UnitType.LITRE;
        this.toUnitType = UnitType.KILOLITRE;
    }
    @Override
    public double convert() {
        return 0;
    }

}
