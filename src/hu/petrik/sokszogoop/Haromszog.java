package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    private boolean getSzerkesztheto() {
        return !((getA() + b) <= c) && (!(getA() + c <= b)) && !((b + c) <= getA());
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getKerulet() {
        return getA() + b + c;
    }

    private double getS() {
        return getKerulet() / 2;
    }

    public double getTerulet() {
        return Math.sqrt(getS() * (getS() - getA()) * (getS() - b) * (getS() - c));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f b = %f c = %f - K = %f - T = %f",
                getA(), b, c, getKerulet(), getTerulet());
    }
}
