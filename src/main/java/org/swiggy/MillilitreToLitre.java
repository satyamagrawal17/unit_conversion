package org.swiggy;

public class MillilitreToLitre extends UnitConversion {
    public MillilitreToLitre(double value) {
        super(value, UnitType.MILLILITRE, UnitType.LITRE);
    }

    @Override
    public double convert() {
        return value / 1000;
    }

}
