import java.util.Date;

public class Grain extends Field {
    public void startIrrigation() {
        System.out.println("Полив зерновых полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив зерновых полей закончил выполняться в: " + new Date());
    }
}
