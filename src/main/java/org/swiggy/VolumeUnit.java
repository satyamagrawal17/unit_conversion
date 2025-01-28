package org.swiggy;

public enum VolumeUnit implements Unit {
    LITRE(1),
    MILLILITRE(1000),
    KILOLITRE(0.001),
    DECALITRE(0.1),
    DECILITRE(10),
    CENTILITRE(100);

    public final double value;
    VolumeUnit(double value) {
        this.value = value;
    }

    public double getConversionFactor() {
        return value;
    }
}
