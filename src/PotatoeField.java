import java.util.Date;
public class PotatoeField  extends Field {
    public void startIrrigation() {
        System.out.println("Полив картофельного поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив картофельного поля закончил выполняться в: " + new Date());
    }
}
