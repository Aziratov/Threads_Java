public class MainTime {
  public static void main(String[] args) {
    Thread getTime = new GetTime();
    Runnable getThread = new RunThread(10);
    Runnable getThread2 = new RunThread(20);
    
    getTime.start();

    new Thread(getThread).start();
    new Thread(getThread2).start();
  }
  
}
