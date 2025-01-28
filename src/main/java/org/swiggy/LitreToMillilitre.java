package org.swiggy;

public class LitreToMillilitre extends UnitConversion {
    public LitreToMillilitre(double value) {
        super(value, UnitType.LITRE, UnitType.MILLILITRE);
    }
    @Override
    public double convert() {
        return value * 1000;
    }
}
