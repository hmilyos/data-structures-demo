package com.hmily.datastructuresdemo.array.intarray;

public class IntArray {
    private int[] data; //数据
    private int size; //实际数据长度

    //    构造函数，传入数组的容量capacity构造Array
    public IntArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }
    //无参数的构造函数，默认数组的容量capacity=10
    public IntArray() {
        this(10);
    }
    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }
    //  获取数组中的元素个数
    public int getSize() {
        return size;
    }
    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }
    // 在 index 索引的位置插入一个新元素 e
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full.");
        }
        if(size < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        // 相当于从原本 index 开始到最末的 都向后移动一位
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }
    // 在所有元素前添加一个新元素
    public void addFirst(int e){
        add(0, e);
    }
    // 向所有元素后添加一个新元素
    public void addLast(int e){
        add(size, e);
    }
    // 获取index索引位置的元素
    public int get(int index){
        if(size < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }
    // 修改index索引位置的元素为e
    public void set(int index, int e){
        if(size < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        data[index] = e;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

    // 查找数组中是否有元素 e
    public boolean contains(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return true;
            }
        }
        return false;
    }
    // 查找数组中元素 e 所在的索引，如果不存在元素 e，则返回-1
    public int find(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    // 从数组中删除 index 位置的元素, 返回删除的元素
    public int remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        int res = data[index];
        for (int i = index + 1; i < size; i++){
            data[i - 1] = data[i];
        }
        size--; // 这时候 data[size] 实际上是有元素的，但是用户访问不了
        return res;
    }
    // 从数组中删除第一个元素, 返回删除的元素
    public int removeFirst(){
        return remove(0);
    }
    // 从数组中删除最后一个元素, 返回删除的元素
    public int removeLast(){
        return remove(size - 1);
    }
    // 从数组中删除元素 e, 如果数组存在这个 e 返回索引，不存在返回 -1
    public int removeElement(int e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
        return index;
    }
}
