package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int arrayLength = array.length;
        if (arrayLength % 2 == 0) {
            Arrays.fill(array, 0, arrayLength / 2, valueStart);
            Arrays.fill(array, arrayLength / 2, arrayLength, valueEnd);
        } else {
            Arrays.fill(array, 0, (arrayLength / 2) + 1, valueStart);
            Arrays.fill(array, (arrayLength / 2) + 1, arrayLength, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
