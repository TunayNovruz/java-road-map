/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package structural.adaptor;

public class Client {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(34, 77);
        RectangleAdaptor adaptor = new RectangleAdaptor();
        long area = adaptor.calculateArea(rec);
        System.out.println(area);
    }
}
