public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;


    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    public Radio(int sizeStation) {
        this.maxStation = sizeStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = minStation;
    }

    public void setPrevStation() {
        if (currentStation != minStation) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
        }
    }

