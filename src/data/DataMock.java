package data;

import rand.Random;

public class DataMock {
    private String name = "";
    private double value = -1;
    private double min = -10;
    private double max = 10;


    //构造函数
    public DataMock(String name, double value, double min, double max) {
        this.name = name;
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public double getValue() {
        return value + Random.getRandom(this.min, this.max);
    }

    public void addInterference (double interference) {
        this.value += interference;
    }

    public void addIncremental (double incremental) {
        this.max += incremental;
        this.min += incremental;
    }

    public String getName() {
        return name;
    }
}
