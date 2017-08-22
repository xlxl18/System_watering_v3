import java.util.Date;

public class Medicinal extends Field {
    public void startIrrigation() {
        System.out.println("Полив лекарственных полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив лекарственных полей закончил выполняться в: " + new Date());
    }
}
