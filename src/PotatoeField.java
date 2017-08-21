import java.util.Date;
public class PotatoeField  extends Field {
    public static double humidityLevel= 0.2;
    public double getLevel() {
        return this.humidityLevel;
    }
    public void startIrrigation() {
        System.out.println("Полив картофельного поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив картофельного поля закончил выполняться в: " + new Date());
    }
}
