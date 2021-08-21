package com.bridgelabz;

public class MyStack {
    private MyNode top;


    public void push(int element) {
        MyNode node = new MyNode();
        node.key = element;
        node.next = top;
        top = node;
    }

    public int peak() {
        System.out.println("Top element is " +top.key);
        return top.key;
    }


    public void pop() {
        if (top == null)
            System.out.println("Stack empty");
        else {
            MyNode temp = top;
            System.out.println("Popped out element is " + temp.key);
            top = top.next;
        }

    }
    public void display() {
        MyNode tempNode = top;
        if (top == null)
            System.out.println("Stack empty");
        else {
            System.out.println("Stack List is -");
            while (tempNode != null) {
                System.out.println(tempNode.key);
                tempNode = tempNode.next;
            }
        }
    }
}
