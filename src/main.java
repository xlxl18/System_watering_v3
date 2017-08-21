import java.util.Date;
import java.util.concurrent.*;

public class Main {
    private static PotatoeField potatoeField = new PotatoeField();
    private static WheatField wheatField = new WheatField();
    private static RiceField riceField = new RiceField();

    public static void potatoeIrrigation() {

        potatoeField.startIrrigation();

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        potatoeField.endIrrigation();

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void wheatIrrigation() {

        wheatField.startIrrigation();

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wheatField.endIrrigation();

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void riceIrrigation() {

        riceField.startIrrigation();

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        riceField.endIrrigation();

    }

    public static void main(String[] args) {
        ScheduledExecutorService serviceIrrigation = Executors.newSingleThreadScheduledExecutor();
        serviceIrrigation.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                potatoeIrrigation();
                wheatIrrigation();
                riceIrrigation();
            }
        },0, 7200, TimeUnit.SECONDS);

        ScheduledExecutorService serviceCheckingHumidityLevel = Executors.newSingleThreadScheduledExecutor();
        serviceCheckingHumidityLevel.scheduleAtFixedRate(new Runnable() {
            public void run() {
                potatoeField.getLevel(300);
                wheatField.getLevel(300);
                riceField.getLevel(300);
            }
        },0, 86400, TimeUnit.SECONDS);
    }
}
