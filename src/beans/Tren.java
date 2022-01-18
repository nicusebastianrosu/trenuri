package beans;

import java.io.Serializable;

public class Tren implements Serializable {

    private String nrtren;
    private String directia;
    private String minute;

    public Tren() {
    }

    public Tren(String nrtren, String directia, String minute) {
        this.nrtren = nrtren;
        this.directia = directia;
        this.minute = minute;
    }

    public String getNrtren() {
        return nrtren;
    }

    public void setNrtren(String nrtren) {
        this.nrtren = nrtren;
    }

    public String getDirectia() {
        return directia;
    }

    public void setDirectia(String directia) {
        this.directia = directia;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Trenul: " + nrtren + " din directia " + directia + " - Constanta " + " are: " + minute + " minute intarziere.";
    }

}
