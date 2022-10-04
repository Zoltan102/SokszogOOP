package hu.petrik.sokszogoop;

public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return (getA() + b) * 2;
    }

    @Override
    public double getTerulet() {
        return getA() * b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f b = %f %s",
                getA(), b, super.toString());
    }
}
