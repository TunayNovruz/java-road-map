/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package structural.bridge;

public class RemoteBridge implements Remote {
    private final Device device;

    RemoteBridge(Device device) {
        this.device = device;
    }

    public void power() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }
}
