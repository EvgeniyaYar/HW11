package ru.netology;

public class Radio {
    public int currentRadioStation;
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation( int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if(newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {

        int station = currentRadioStation + 1;
        if (station > 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = station;
        }
    }

    public void prevRadioStation() {
        int station = currentRadioStation - 1;
        if (station < 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = station;
        }
    }

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if(newCurrentVolume < 0) {
            return;
        }
        if(newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
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
