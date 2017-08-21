import java.util.Date;
public class PotatoeField  extends Field implements Sensor {
    public static int humidityLevel= 250;
    public void getLevel(int level) {
        if (this.humidityLevel < level) {
            Main main = new Main();
            main.irrigation();
        }
    }
    public void startIrrigation() {
        System.out.println("Полив картофельного поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив картофельного поля закончил выполняться в: " + new Date());
    }
}
