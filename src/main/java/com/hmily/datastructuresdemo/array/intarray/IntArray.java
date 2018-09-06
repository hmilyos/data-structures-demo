package com.hmily.datastructuresdemo.array.intarray;

public class IntArray {
    private int[] data;
    private int size;

    public IntArray(int capacity){
        data = new int[capacity];
        size = 0;
    }
    public IntArray(){
        this(10);
    }

    public int getCapacity(){
        return data.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int index, int e){
        if (size == data.length){
            throw new IllegalArgumentException(" Add failed. Array is full.");
        }
        if(index < 0 || index > data.length){
            throw new IllegalArgumentException(" Add failed. Require index >= 0 and index <= size.");
        }
        for (int i = size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size ++;
    }
}
