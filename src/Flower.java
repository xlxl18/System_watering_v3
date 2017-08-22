import java.util.Date;

public class Flower extends Field {
    public void startIrrigation() {
        System.out.println("Полив цветочных полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив цветочных полей закончил выполняться в: " + new Date());
    }
}
