import java.util.Date;

public class Berry extends Field {
    public void startIrrigation() {
        System.out.println("Полив ягодных полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив ягодных полей закончил выполняться в: " + new Date());
    }
}
