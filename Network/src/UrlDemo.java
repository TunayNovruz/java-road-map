/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static java.lang.System.out;

public class UrlDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://kitabla.com");
        out.println("protocol " + url.getProtocol());
        out.println("port  " + url.getPort());
        out.println("Host " + url.getHost());
        out.println("File " + url.getFile());
        out.println("Ext " + url.toExternalForm());

        URLConnection conn = url.openConnection();

        out.println("content type - " + conn.getContentType());
        InputStream in = conn.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s = bf.readLine()) != null){
            out.println(s);
        }
        in.close();
    }
}
