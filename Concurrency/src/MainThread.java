import simple.SimpleThread;

public class MainThread {
    public static void main(String[] args) {
        SimpleThread st = new SimpleThread("child thread");
        st.obj.start();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main counting" + i);
                Thread.sleep(500);
            }
            System.out.println("Main thread dies");
        } catch (InterruptedException e) {
            System.out.println("inteerupted Main thread");
        }
    }
}
