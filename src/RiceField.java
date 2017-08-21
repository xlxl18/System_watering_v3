import java.util.Date;
public class RiceField extends Field implements Sensor{
    public static int humidityLevel= 100;
    public void getLevel(int level) {
        if (this.humidityLevel < level) {
            Main main = new Main();
            main.riceIrrigation();
        }
    }
    public void startIrrigation() {
        System.out.println("Полив рисового поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив рисового поля закончил выполняться в: " + new Date());
    }
}
