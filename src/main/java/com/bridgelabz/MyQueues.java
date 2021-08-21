package com.bridgelabz;

public class MyQueues {
    MyNode front;
    MyNode rear;

    public void enqueue(int element) {
        MyNode node = new MyNode();
        node.key = element;
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public void display() {
        if (front == null)
            System.out.println("Queue is empty");
        else {
            MyNode temp = front;
            System.out.println("Queue list is -");
            while (temp != null) {
                System.out.println(temp.key);
                temp = temp.next;
            }
        }
    }
}
