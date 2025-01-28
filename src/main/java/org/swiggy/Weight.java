package org.swiggy;

public class Weight {
    private final double quantity;
    private final WeightUnit unit;

    public Weight(double quantity, WeightUnit unit) {
        if(quantity < 0) {
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;
        this.unit = unit;
    }

    public Weight convertTo(WeightUnit weightUnit) {
        return new Weight(0, weightUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Weight)) {
            return false;
        }
        Weight weight = (Weight) obj;
        return weight.unit == unit && weight.quantity == quantity;
    }
}
