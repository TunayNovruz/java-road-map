package simple;

public class SimpleThread implements Runnable {
    public  Thread obj;
    public String ThreadName;
    public int sleepTime;

    public SimpleThread(String name, int sleepTime) {
        ThreadName= name;
        this.sleepTime = sleepTime;
        obj = new Thread(this,name);
        //TODO why use this
        System.out.println("new simple thread : " + obj.getName());
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println(ThreadName + " counting:"+i);
                Thread.sleep(sleepTime);
            }
            System.out.println(ThreadName+" died (ended)");
        } catch (Exception e) {
            System.out.println(ThreadName + " thread interrup exception");
        }
    }
}
