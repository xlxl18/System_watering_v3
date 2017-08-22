import java.util.Date;

public class Technical extends Field {
    public void startIrrigation() {
        System.out.println("Полив полей технических культур начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив полей технических культур закончил выполняться в: " + new Date());
    }
}
