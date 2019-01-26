package data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataCenter {
    private int numberOfPollutant = 0;
    private List<DataMock> dataMocks = new ArrayList<>();
    private List<Double> warnings = new ArrayList<>();

    /**
     *
     * @param name
     * @param value
     * @param min
     * @param max
     * @param warning
     */
    public void signInDataMock (String name, double value, double min, double max, double warning) {
        this.signInDataMock(new DataMock(name, value, min, max), warning);
    }

    /**
     *
     * @param dataMock
     */
    public void signInDataMock (DataMock dataMock, double warning) {
        this.dataMocks.add(dataMock);
        this.warnings.add(warning);
        numberOfPollutant++;
    }

    public void getValue() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        for (int i = 0; i < this.numberOfPollutant; i++ ) {
            DataMock dataMock = dataMocks.get(i);
            double warning = this.warnings.get(i);
            System.out.println(dataMock.getName() + " " + String.format("%.2f", dataMock.getValue()) + " " + String.format("%.2f", warning) + " " + (dataMock.getValue() > warning));
        }
        System.out.println("----------------------------------");
    }




}
