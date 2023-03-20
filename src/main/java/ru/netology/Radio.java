package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int quantity) {
        maxRadioStation = quantity - 1;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextRadioStation() {

        int station = currentRadioStation + 1;
        if (station > maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = station;
        }
    }

    public void prevRadioStation() {
        int station = currentRadioStation - 1;
        if (station < 0) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = station;
        }
    }

    public void volumeUp() {
        int volume = currentVolume + 1;
        setCurrentVolume(volume);
    }

    public void volumeDown() {
        int volume = currentVolume - 1;
        setCurrentVolume(volume);
    }

}
