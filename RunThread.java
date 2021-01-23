public class RunThread implements Runnable {
  private int timeStart;

  public RunThread(int timeStart) {
    this.timeStart = timeStart;
  }

  public void run() {

    try {
      Thread.sleep(timeStart * 1000);
    } catch (Exception e) {}
    System.out.println("Running Second Thread.");
  }
}
