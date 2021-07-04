package project.bubble;

//создать класс Bottle

public class Bottle {
    private int a, b, c;
    private double volume;

    public Bottle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Bottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
