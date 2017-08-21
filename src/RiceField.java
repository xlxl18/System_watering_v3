import java.util.Date;
public class RiceField extends Field {
    public void startIrrigation() {
        System.out.println("Полив рисового поля начал выполняться в: " + new Date());
    }
    public void endIrrigation() {
        System.out.println("Полив рисового поля закончил выполняться в: " + new Date());
    }
}
