package Synchronization;

public class SyncThread implements Runnable {
    public Thread th;
    public String message;
    final MessagePrinter mp;

    public SyncThread(MessagePrinter m, String msg) {
        mp = m;
        this.message = msg;
        th = new Thread(this);
    }

    @Override
    public void run() {
        // sync etmeyin ikinci usulu
        synchronized (mp){
            mp.printMessage(message);
        }
    }
}
