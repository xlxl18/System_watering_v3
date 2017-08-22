import java.util.Date;

public class Fodder extends Field {
    public void startIrrigation() {
        System.out.println("Полив кормовых полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив кормовых полей закончил выполняться в: " + new Date());
    }
}
