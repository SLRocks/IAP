import data.DataCenter;
import data.DataMock;

public class Show implements Runnable {
    DataCenter dataCenter = new DataCenter();
    DataMock co2 = new DataMock("CO2", 10, -2, 2);
    DataMock so2 = new DataMock("SO2", 5, -2, 2);
    @Override
    public void run() {
        DataCenter dataCenter = new DataCenter();
        dataCenter.signInDataMock(co2, 100);
        dataCenter.signInDataMock("SO2", 5, -2, 2, 100);
        while (true) {
            dataCenter.getValue();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
