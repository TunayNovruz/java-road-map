/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class whois {
    public static void main(String[] args) {
        int c;
        try {
            Socket s = new Socket("whois.enom.com", 43);
            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader isr = new BufferedReader(in);
            OutputStream out = s.getOutputStream();
            String str = "www.kitabla.com";
            byte[] buf = str.getBytes();

            out.write(buf);
            String sss;
            while ((sss = isr.readLine()) != null){
                System.out.print(sss);
            }

            s.close();


        } catch (Exception e) {
            System.out.println("Exception: ");
            System.out.println(e.getMessage());
        }
    }
}
