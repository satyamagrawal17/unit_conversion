package org.swiggy;

public class Measurement implements IMeasurement {


    protected final double quantity;
    protected final Unit unit;

    public Measurement(double quantity, Unit unit) {
        if(quantity < 0) {
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public Measurement convertTo(Unit toUnit) {
        return new Measurement((1 / unit.getConversionFactor()) * toUnit.getConversionFactor() * quantity, (Unit) toUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Measurement)) {
            return false;
        }
        Measurement Measurement = (Measurement) obj;
        return Measurement.unit == unit && Measurement.quantity == quantity;
    }
}
