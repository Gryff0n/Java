package Exo2;

public class Temps {
    long hour;
    int minutes, seconds;

    public Temps() {
    }

    public long getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(long hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Temps(long hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Temps(long t) {
    }

    public long conversion() {
        long conv = hour * 3600 + minutes * 60 + seconds;
        return conv;
    }

    public void ajouterTemps(Temps temps) {
        this.hour+=temps.getHour();
        this.minutes+=temps.getMinutes();
        this.seconds+=temps.getSeconds();
    }
}
