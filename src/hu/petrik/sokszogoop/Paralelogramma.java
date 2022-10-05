package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog {
    private double alfa;

    public Paralelogramma() {
        super(getVeletlen());
        this.alfa = Math.random() * 180 + 1;
    }

    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.alfa = alfa;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A Paralelogramma nem szerkeszthető!");
        }
    }

    private boolean isSzerkesztheto() {
        boolean b = !(alfa < 1) && !(alfa > 180);
        return b;
    }

    private static double getVeletlen() {
        return Math.random() * 10 + 5;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A Paralelogramma nem szerkeszthető!");
        }
    }

    public double getKerulet() {
        return 4 * getA();
    }

    public double getTerulet() {
        return (getA() * 2 * Math.sin(alfa * 0.017453292519943));
    }

    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %f alfa = %f %s",
                getA(), alfa, super.toString());
    }
}
