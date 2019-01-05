package rand;

public class Random {
    public static double getRandom(double min, double max) {
        double rand = Math.random();
        return (rand * (max - min) + min);
    }
}
