package Synchronization;

public class MessagePrinter {

    public synchronized void printMessage(String message) {
        try {
            System.out.print("Hello, ");
            System.out.print(message);
            Thread.sleep(1000);
            System.out.println(" How are you?");
        } catch (InterruptedException e) {
            System.out.println("Message Printer interrupted");
        }
    }

}
