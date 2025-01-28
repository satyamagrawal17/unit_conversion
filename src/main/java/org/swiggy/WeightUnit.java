package org.swiggy;

public enum WeightUnit {
    GRAM(1),
    KILOGRAM(0.001),
    MILLIGRAM(1000),
    DECIGRAM(10),
    DECAGRAM(0.1);

    public final double value;
    WeightUnit(double value) {
        this.value = value;
    }

}
