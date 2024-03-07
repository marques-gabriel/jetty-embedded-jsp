import server.AppServer;
import util.Logger;

public class Application {

    public static void main(String[] args) {
        try {
            long startTime;

            startTime = System.currentTimeMillis();

            Logger.showBanner();
            Logger.log("Embedded Web Container", "Starting... ");

            AppServer.start(startTime);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
