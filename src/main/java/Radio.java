public class Radio {

    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int sizeStation) {
        this.maxStation = sizeStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {
        this.currentStation = currentStation - 1;
        if (currentStation < minStation) {
            this.currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}