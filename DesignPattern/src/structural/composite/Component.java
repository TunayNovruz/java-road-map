/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    protected List<Component> list = new ArrayList<>();
    AccountStatement accStatement;

    public abstract float getBalance();

    public abstract AccountStatement getStatement();

    public void add(Component g) {
        list.add(g);
    }

    public void remove(Component g) {
        list.remove(g);
    }

    public Component getChild(int i) {
        return list.get(i);
    }
}
