package IO;

import java.io.PrintWriter;

public class OutData {
    public static void main(String[] args) {
        System.out.println("line");
        System.out.print(" word ");
        System.out.write('c');
        System.out.printf(" \n %d lines",15);
        System.out.close();

        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("\n Xello world");

    }
}
