package kea.exercises.grass;

// Not needed

public class Grass_unused {

    private final double lengthNow;
    private final double lengthMax;
    private final double growth;

    public Grass_unused(double lengthNow, double lengthMax, double growth) {
        this.lengthNow = lengthNow;
        this.lengthMax = lengthMax;
        this.growth = growth;
    }

    public double howManydaysUntilCut(double lengthNow, double lengthMax) {
        return (lengthMax - lengthNow)/growth;
    }
}
