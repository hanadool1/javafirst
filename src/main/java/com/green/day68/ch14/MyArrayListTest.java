package com.green.day68.ch14;

import com.green.day18.ch7.MyArrayList;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(13);
        list.add(16);
        list.add(19);
        list.add(22);
        list.forEach((i) -> System.out.println("i :" + i));
        System.out.println("----------------");
        list.removeIf2((i) -> { return i % 2 == 0; });
        list.forEach((i) -> System.out.println("i :" + i));
    }
}
