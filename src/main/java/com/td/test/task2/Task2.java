package com.td.test.task2;

import java.util.Arrays;

public class Task2 {
    // в тз было указано, что "массив не обязательно числовой",
    // поэтому было принято сделать универсальное решение
    public static void main(String[] args) {
        Object[] objects1 = new Object[] {23, 53, "efe", true, 2, 's', "q"};
        Object[] objects2 = new Object[] {"q", 's', 2, true, "efe", 53, 23};
        System.out.println(Arrays.toString(addArray(objects1, objects2)));
    }

    public static Object[] addArray(Object[] firstArray, Object[] secondArray) {
        Object[] objects = new Object[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, objects, 0, firstArray.length);
        System.arraycopy(secondArray, 0, objects, firstArray.length, secondArray.length);
        return objects;
    }
}
