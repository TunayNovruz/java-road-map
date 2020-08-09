package IO;

import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.System.out;

public class FileReading {
    public static void main(String[] args) {
        if (args.length != 1) return;
        String fileName = args[0];
        FileInputStream fin = null;

        try {
            fin = new FileInputStream(fileName);
            int i = fin.read();
            if (i > 0) {
                out.println((char) i);
            }
        } catch (IOException e) {
            out.println(e.getMessage());
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                out.println(e.getMessage());
            }
        }
    }

    public static void autoClose(String[] args) {
        if (args.length != 1) return;
        String fileName = args[0];

        try (FileInputStream fin = new FileInputStream(fileName)) {

            int i = fin.read();
            if (i > 0) {
                out.println((char) i);
            }
        } catch (IOException e) {
            out.println(e.getMessage());
        }
    }
}
