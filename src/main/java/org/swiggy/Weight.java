package org.swiggy;

public class Weight extends Measurement {

    public Weight(double quantity, Unit unit) {
        super(quantity, unit);
    }

    public Weight convertTo(Unit toUnit) {
        Measurement result = super.convertTo(toUnit);
        return new Weight(result.quantity, result.unit);
    }
}
