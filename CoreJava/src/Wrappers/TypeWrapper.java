/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Wrappers;

/**
 * This class simply demonstrte wrapper
 */
public class TypeWrapper {

    /**
     *
     * @param a any int value
     * @param b any string value
     * @return simple bloolean value
     * @throws Exception can throw exception, just catch it
     */
    public Boolean test(int a, String b) throws Exception {
        int x = 0; // primitive
        Integer y = 7; // object
        x = y; //auto-unbox
        int x_ = 6;
        y = x_;//autoboxing
        byte t = y.byteValue();
        Character ch = 'h';
        Boolean boo = true;
        return true;
    }
}
