/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.factory;

public class WebNotification  implements Notification{
    @Override
    public void sendNotification(){
        System.out.println("web notification");
    }
}
