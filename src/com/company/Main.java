package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr = {0, 3, 1, 8, 9, 4, 7};
        System.out.println("arr = " + Arrays.toString(arr));
        ArrayInverter.invert(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

}