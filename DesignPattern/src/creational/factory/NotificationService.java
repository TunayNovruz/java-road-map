/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.factory;

public class NotificationService {
    public static void main(String[] args) {
        Notification sms;
        sms = NotificationFactory.createNotification(NotificationTypes.SMS);
        if (sms != null)
            sms.sendNotification();

        Notification web;
        web = NotificationFactory.createNotification(NotificationTypes.Web);
        if (web != null)
            web.sendNotification();

    }
}
