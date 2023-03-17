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

        int expected = 8;
        int actual = rad.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationIfLess0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-2);

        int expected = 0;
        int actual = rad.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetAboveMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(15);

        int expected = 0;
        int actual = rad.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetBelowMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = rad.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();


        int expected = 1;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStationIf9() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();


        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(3);
        rad.prevRadioStation();

        int expected = 2;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStationIf0() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(54);

        int expected = 54;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);

    }
   @Test
    public void shouldNotSetBelowVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-20);

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNoySetAboveVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(115);

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotUpVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.volumeUp();
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldUpVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.volumeUp();
        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldDownVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.volumeDown();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotDownVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.volumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
