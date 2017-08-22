import java.util.Date;

public class OilBearing extends Field {
    public void startIrrigation() {
        System.out.println("Полив эфиромасличных полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив эфиромасличных полей закончил выполняться в: " + new Date());
    }
}
