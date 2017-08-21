import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.concurrent.*;

public class Main {
    private static PotatoeField potatoeField = new PotatoeField();
    private static WheatField wheatField = new WheatField();
    private static RiceField riceField = new RiceField();
    private static double minLevel = 0.5;

    public static boolean checkLevel(double level) {
        if (level < minLevel) {
            return true;
        }
        else {
            return false;
        }
    }
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
                if(checkLevel(potatoeField.getLevel())) {
                    potatoeIrrigation();
                }
                else if(checkLevel(wheatField.getLevel())) {
                    wheatIrrigation();
                }
                 else if (checkLevel(riceField.getLevel())) {
                    riceIrrigation();
                }
            }
        },0, 86400, TimeUnit.SECONDS);
    }
}
