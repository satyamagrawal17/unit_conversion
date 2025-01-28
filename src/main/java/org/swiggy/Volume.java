package org.swiggy;

public class Volume {
    private final double quantity;
    private final VolumeUnit unit;
    public Volume(double quantity, VolumeUnit unit) {
        if(quantity < 0) {
            throw new IllegalArgumentException("Volume cannot be negative");
        }
        this.quantity = quantity;
        this.unit = unit;
    }

    public Volume convertTo(Unit toUnit) {
        return new Volume((VolumeUnit.LITRE.value / unit.value) * toUnit.getConversionFactor() * quantity, (VolumeUnit) toUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Volume)) {
            return false;
        }
        Volume volume = (Volume) obj;
        return volume.unit == unit && volume.quantity == quantity;
    }
}
