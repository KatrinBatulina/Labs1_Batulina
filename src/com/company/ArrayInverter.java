package com.company;


public class ArrayInverter {
    public static void invert(int[] array) {
        for (int k = array.length / 2 - 1; k >= 0; k--) {
            int tmp = array[k];
            array[k] = array[array.length - k - 1];
            array[array.length - k - 1] = tmp;
        }

    }

}
