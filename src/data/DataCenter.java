package data;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {
    private int numberOfPollutant = 0;
    private List<DataMock> dataMocks = new ArrayList<>();

    public void signInDataMock (String name, double value, double min, double max) {
        this.dataMocks.add(new DataMock(name, value, min, max));
        numberOfPollutant ++;
    }
}
