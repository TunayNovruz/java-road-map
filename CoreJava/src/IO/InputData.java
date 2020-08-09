package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String str;
        char c;
        try {
            str  = br.readLine();
            c  = (char)br.read();
            System.out.println(str);
            System.out.println(c);
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
