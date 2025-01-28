package org.swiggy;

public class Volume extends Measurement {
    public Volume(double quantity, Unit unit) {
        super(quantity, unit);
    }

    public Volume convertTo(Unit toUnit) {
        Measurement result = super.convertTo(toUnit);
        return new Volume(result.quantity, result.unit);
    }
}
