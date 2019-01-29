package edu.up.cs371.epp.photofunpattern;

public class SeekBarState {
    private static final SeekBarState ourInstance = new SeekBarState();
    private int ourBrightnessDelta;
    public static SeekBarState getInstance() {
        return ourInstance;
    }
    public int getBrightnessDelta() {return ourBrightnessDelta;}

    public void setBrightnessDelta(int delta) {

            ourBrightnessDelta = delta;

    }
    private SeekBarState() {
        ourBrightnessDelta = 0;
    }
}
