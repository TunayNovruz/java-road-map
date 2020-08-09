import Synchronization.MessagePrinter;
import Synchronization.SyncThread;
import simple.SimpleThread;

public class MainThread {
    public static void main(String[] args) {
//         simpleThreadCheck();
        syncCheck();
    }

    public static void simpleThreadCheck() {
        SimpleThread st = new SimpleThread("birinci", 1000);
        SimpleThread st2 = new SimpleThread("ikinci", 3000);
        st2.obj.setPriority(10);
        st.obj.start();
        st2.obj.start();

        if (st.obj.isAlive()) {
            System.out.println(st.ThreadName + ": still alive");
        } else {
            System.out.println(st.ThreadName + ": is not alive");
        }

        try {
            //st.obj.join();// this means main thread waits for st thread ends

            System.out.println("priroity of " + st2.ThreadName + " - " + st2.obj.getPriority());
            System.out.println("priroity of " + st.ThreadName + " - " + st.obj.getPriority());
            if (st.obj.isAlive()) {
                System.out.println(st.ThreadName + ": still alive");
            } else {
                System.out.println(st.ThreadName + ": is not alive");
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("Main counting" + i);
                if (i == 5) {
                    throw new InterruptedException();
                }
                Thread.sleep(500);
            }
            System.out.println("Main thread dies");
        } catch (InterruptedException e) {
            System.out.println("inteerupted Main thread");
        }
    }

    public static void syncCheck() {
        try {
            MessagePrinter msgObj = new MessagePrinter();
            SyncThread st = new SyncThread(msgObj, "Jon");
            SyncThread st2 = new SyncThread(msgObj, "Rob");
            st.th.start();
            st2.th.start();

            //st.th.join();
            //st2.th.join();
            // bele olan halda menasi qalmir cunki ikisi de start olubsa bir birini gozlemir
            // amma main thread gozleyir her ikisini
        } catch ( Exception e) {
            System.out.println("Interrupted thread");
        }
    }

}
