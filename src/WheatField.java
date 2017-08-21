import java.util.Date;
public class WheatField extends Field implements Sensor {
    public static int humidityLevel= 210;
    public void getLevel(int level) {
        if (this.humidityLevel < level) {
            Main main = new Main();
            main.irrigation();
        }
    }
    public void startIrrigation() {
        System.out.println("Полив кукурузного поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив кукурузного поля закончил выполняться в: " + new Date());
    }
}
