package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog {
    private double b;
    private double alfa;

    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.b = b;
        this.alfa = alfa;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double m) {
        this.alfa = alfa;
    }

    public double getKerulet() {
        return 2 * (getA() + getB());
    }

    public double getTerulet() {

    }
}
