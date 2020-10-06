/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.factory;

public class NotificationFactory {
    public static Notification createNotification(NotificationTypes type) {
        if (type == NotificationTypes.SMS) {
            return new SMSNotification();
        } else if (type == NotificationTypes.Web) {
            return new WebNotification();
        } else {
            return null;
        }
    }
}
