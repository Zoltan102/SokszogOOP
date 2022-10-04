package hu.petrik.sokszogoop;

public abstract class Sokszog {
    private double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    abstract double getKerulet();

    abstract double getTerulet();

    @Override
    public String toString() {
        return String.format("K = %-10.3f T = %-10.3f", getKerulet(), getTerulet());
    }
}
