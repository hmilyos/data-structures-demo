package com.hmily.datastructuresdemo.stack.basics;

public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
