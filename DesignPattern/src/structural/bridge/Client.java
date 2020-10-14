/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package structural.bridge;

public class Client {
    public static void main(String[] args) {
        Device radio = new Radio();
        Remote radioRemote = new RemoteBridge(radio);
        radioRemote.power();
        radioRemote.power();
        System.out.println(radio.isEnabled());
    }
}
