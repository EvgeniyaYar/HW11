package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);

        Assertions.assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationIfQuantitySet() {
        Radio rad = new Radio(5);
        rad.setCurrentRadioStation(3);
        Assertions.assertEquals(3, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio rad = new Radio();
        Assertions.assertEquals(9, rad.getMaxRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStationIfQuantitySet() {
        Radio rad = new Radio(7);
        Assertions.assertEquals(6, rad.getMaxRadioStation());
    }

    @Test
    public void shouldNotSetAboveMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(15);
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetAboveMaxRadioStationIfQuantitySet() {
        Radio rad = new Radio(5);
        rad.setCurrentRadioStation(5);
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetBelowMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-5);
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetBelowMaxRadioStationIfQuantitySet() {
        Radio rad = new Radio(5);
        rad.setCurrentRadioStation(-5);
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();

        Assertions.assertEquals(1, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStationIfDefault() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetNextRadioStationIfQuantitySet() {
        Radio rad = new Radio(5);
        rad.setCurrentRadioStation(4);
        rad.nextRadioStation();

        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.prevRadioStation();

        Assertions.assertEquals(2, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStationWhenZeroIfDefault() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        Assertions.assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStationWhenZeroIfQuantitySet() {
        Radio rad = new Radio(5);
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        Assertions.assertEquals(4, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(54);

        Assertions.assertEquals(54, rad.getCurrentVolume());

    }

    @Test
    public void shouldNotSetBelowVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-20);

        Assertions.assertEquals(0, rad.getCurrentVolume());

    }

    @Test
    public void shouldNoySetAboveVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(115);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void shouldNotUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.volumeUp();

        Assertions.assertEquals(100, rad.getCurrentVolume());

    }

    @Test
    public void shouldUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.volumeUp();

        Assertions.assertEquals(1, rad.getCurrentVolume());

    }

    @Test
    public void shouldDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.volumeDown();

        Assertions.assertEquals(99, rad.getCurrentVolume());
    }

    @Test
    public void shouldNotDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.volumeDown();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

}
