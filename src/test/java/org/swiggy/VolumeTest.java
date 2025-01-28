package org.swiggy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    // Test for LitreToMillilitre
    @Test
    public void testVolumeLToMLReturnExceptionWhenInputMinus9() {
        assertThrows(IllegalArgumentException.class, () -> {new Volume(-9, VolumeUnit.LITRE);});
    }

    @Test
    public void testVolumeLToMLReturn0WhenInput0() {
        Volume volume = new Volume(0, VolumeUnit.LITRE);
        Volume result = volume.convertTo(VolumeUnit.MILLILITRE);
        Volume expected = new Volume(0, VolumeUnit.MILLILITRE);
        assertEquals(expected, result);
    }

    @Test
    public void testVolumeLToMLReturn5000WhenInput5() {
        Volume volume = new Volume(5, VolumeUnit.LITRE);
        Volume result = volume.convertTo(VolumeUnit.MILLILITRE);
        Volume expected = new Volume(5000, VolumeUnit.MILLILITRE);
        assertEquals(expected, result);
    }

    @Test
    public void testVolumeLToMLReturn100000WhenInput100() {
        Volume volume = new Volume(1, VolumeUnit.LITRE);
        Volume result = volume.convertTo(VolumeUnit.MILLILITRE);
        Volume expected = new Volume(1000, VolumeUnit.MILLILITRE);
        assertEquals(expected, result);
    }

    // Test for Millilitre to Decalitre
    @Test
    public void testVolumeMLToDLReturnExceptionWhenInputMinus9() {
        assertThrows(IllegalArgumentException.class, () -> {new Volume(-9, VolumeUnit.MILLILITRE);});
    }

    @Test
    public void testVolumeMLToDLReturn0WhenInput0() {
        Volume volume = new Volume(0, VolumeUnit.MILLILITRE);
        Volume result = volume.convertTo(VolumeUnit.DECALITRE);
        Volume expected = new Volume(0, VolumeUnit.DECALITRE);
        assertEquals(expected, result);
    }

    @Test
    public void testVolumeMLToDLReturn1WhenInput100() {
        Volume volume = new Volume(100, VolumeUnit.MILLILITRE);
        Volume result = volume.convertTo(VolumeUnit.DECALITRE);
        Volume expected = new Volume(0.01, VolumeUnit.DECALITRE);
        assertEquals(expected, result);
    }

}