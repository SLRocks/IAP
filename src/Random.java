public class Random {
    public static int getRandom(int min, int max) {
        double rand = Math.random();
        return (int) (rand * (max - min) + min);
    }
}
