import java.util.Date;

public class Leguminous extends Field {
    public void startIrrigation() {
        System.out.println("Полив зерно-бобовых полей начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив зерно-бобовых полей закончил выполняться в: " + new Date());
    }
}
