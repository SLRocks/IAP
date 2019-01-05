import data.DataMock;
import rand.Random;

public class Test {
    public static void main(String[] args) {
        DataMock co2 = new DataMock("CO2", 10, -2, 2);
        DataMock so2 = new DataMock("SO2", 5, -2, 2);

        for (int i = 0; i < 20; i++) {
            System.out.println("第" + i + "次");
            System.out.println(co2.getName() + " : " + String.format("%.2f", co2.getValue()));
            System.out.println(so2.getName() + " : " + String.format("%.3f", so2.getValue()));
            System.out.println("----------------------------------");
        }
    }
}
