package com.green.day68.ch14;


public class MyArrayList {
    private int[] arr;

    public MyArrayList(){
        arr= new int[0];
    }
    public void add(int val){
        int[] newArr= new int[arr.length+1];
        if(arr.length==0){
            newArr[0]= val;
        } else {
            for(int i=0; i<arr.length; i++){
                newArr[i]= arr[i];
            }
            newArr[arr.length]= val;
        }
        arr= newArr;
    }
    public int[] getArr(){
        return arr;
    }
}
