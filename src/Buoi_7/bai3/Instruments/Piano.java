package Buoi_7.bai3.Instruments;

public class Piano implements Playable {
    private int keys;

    public Piano(int keys) {
        this.keys = keys;
    }

    public Piano() {
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println("Piano is played");
    }
}