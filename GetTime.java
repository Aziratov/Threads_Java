import java.util.*;
import java.text.DateFormat;

public class GetTime extends Thread {


  public void run() {
    Date currentTime;
    Locale currentLocale;
    DateFormat timeFormatter;
    DateFormat dateFormatter;
    String timeOutput;
    String dateOutput;

    for (int i = 1; i <= 20; i++) {
      currentTime = new Date();
      currentLocale = new Locale("en");

      timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
      dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

      timeOutput = timeFormatter.format(currentTime);
      dateOutput = dateFormatter.format(currentTime);

      System.out.println(timeOutput);
      System.out.println(dateOutput);
      System.out.println();

      try {
        Thread.sleep(2000);
      } catch (Exception e) {}

    }

  }
  
}
