package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String WHITE = "\u001B[37m";
  public static final String RED = "\u001B[31m";
  public static final String RESET = "\u001B[0m";

  public static DateTimeFormatter DATE = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  public static void showBanner() {
    System.out.println(RED);
    System.out.println(
        "       _      _   _           ______           _              _     _          _        _ "
            + " _____ _____  ");
    System.out.println(
        "      | |    | | | |         |  ____|         | |            | |   | |        | |      |"
            + " |/ ____|  __ \\ ");
    System.out.println(
        "      | | ___| |_| |_ _   _  | |__   _ __ ___ | |__   ___  __| | __| | ___  __| |      | |"
            + " (___ | |__) |");
    System.out.println(
        "  _   | |/ _ \\ __| __| | | | |  __| | '_ ` _ \\| '_ \\ / _ \\/ _` |/ _` |/ _ \\/ _` |  _ "
            + "  | |\\___ \\|  ___/ ");
    System.out.println(
        " | |__| |  __/ |_| |_| |_| | | |____| | | | | | |_) |  __/ (_| | (_| |  __/ (_| | | |__|"
            + " |____) | |     ");
    System.out.println(
        "  \\____/ \\___|\\__|\\__|\\__, | |______|_| |_| |_|_.__/"
            + " \\___|\\__,_|\\__,_|\\___|\\__,_|  \\____/|_____/|_|     ");
    System.out.println(
        "                       __/ |                                                              "
            + "              ");
    System.out.println(
        "                      |___/                                                               "
            + "              ");
    System.out.println(RESET);
  }

  public static void log(String module, String message) {
    String date = LocalDateTime.now().format(DATE);
    System.out.printf(
        YELLOW + "%15s " + WHITE + "%-30s:" + GREEN + "%s\n" + RESET, date, module, message);
  }
}
