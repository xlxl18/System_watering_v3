import java.util.Date;
public class WheatField extends Field {
    public static double humidityLevel= 0.3;
    public double getLevel() {
        return this.humidityLevel;
    }
    public void startIrrigation() {
        System.out.println("Полив кукурузного поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив кукурузного поля закончил выполняться в: " + new Date());
    }
}
