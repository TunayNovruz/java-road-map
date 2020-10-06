/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.kitabla.com");
        System.out.println(address);

        InetAddress[] ads = InetAddress.getAllByName("www.nba.com");
        for (InetAddress x : ads) {
            System.out.println(x);
        }
    }
}
