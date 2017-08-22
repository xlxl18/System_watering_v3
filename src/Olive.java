import java.util.Date;

public class Olive extends Field {
    public void startIrrigation() {
        System.out.println("Полив масличных полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив масличных полей закончил выполняться в: " + new Date());
    }
}
