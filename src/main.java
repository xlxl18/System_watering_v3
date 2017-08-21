import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class main  {
    private static PotatoeField potatoeField = new PotatoeField();
    private static WheatField wheatField = new WheatField();
    private static RiceField riceField = new RiceField();

    public static void irrigation() {

        potatoeField.startIrrigation();

        try {
            Thread.sleep(120000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        potatoeField.endIrrigation();

        try {
            Thread.sleep(60000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        wheatField.startIrrigation();

        try {
            Thread.sleep(120000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        wheatField.endIrrigation();

        try {
            Thread.sleep(60000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        riceField.startIrrigation();

        try {
            Thread.sleep(120000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        riceField.endIrrigation();

    }
    public static void main(String[] args) {
        irrigation();

    }
}
