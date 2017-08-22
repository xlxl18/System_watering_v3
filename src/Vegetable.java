import java.util.Date;

public class Vegetable extends Field {
    public void startIrrigation() {
        System.out.println("Полив овощных полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив овощных полей закончил выполняться в: " + new Date());
    }
}
