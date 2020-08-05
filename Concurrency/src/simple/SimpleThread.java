package simple;

public class SimpleThread implements Runnable {
    public  Thread obj;

    public SimpleThread(String name) {
        obj = new Thread(this,name);
        System.out.println("new simple thread : " + obj);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println("child counting:"+i);
                Thread.sleep(1000);
            }
            System.out.println("Child thread die");
        } catch (InterruptedException e) {
            System.out.println("child thread interrup exception");
        }
    }
}
