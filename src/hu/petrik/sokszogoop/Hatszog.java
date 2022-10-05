package hu.petrik.sokszogoop;

public class Hatszog extends Sokszog {

    public Hatszog() {
        super(getRandom());
    }

    public Hatszog(double a) {
        super(a);
    }

    private static double getRandom() {
        return Math.random() * 10 + 5;
    }

    @Override
    double getKerulet() {
        return 6 * getA();
    }

    @Override
    double getTerulet() {
        return ((3 * Math.sqrt(3)) * 2) * (2 * getA());
    }

    @Override
    public String toString() {
        return String.format("Hatszög: a = %f %s",
                getA(), super.toString());
    }
}
