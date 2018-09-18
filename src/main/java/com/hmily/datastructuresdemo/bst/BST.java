package com.hmily.datastructuresdemo.bst;

public class BST<E extends Comparable<E>> {
    private class Node{
        public E e;
        private Node left;
        private Node right;
        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int getSize(){
        return  size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        if (root == null){
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    public void add(Node node, E e){
        if (e.equals(node.e)){
            return;
        } else if(e.compareTo(node.e) < 0 && node.left == null){
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null){
            node.right = new Node(e);
            size++;
            return;
        }
        if(e.compareTo(node.e) < 0){
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }
}
