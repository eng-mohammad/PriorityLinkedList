/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 * @version 1.0
 * @author Mohammad
 */
public class Node {
    
    private Object object;
    private int priority;
    private Node next;

    public Node(Object object, int priority) {
        this(object, priority, null);
    }

    public Node(Object object, int priority, Node next) {
        this.object = object;
        this.priority = priority;
        this.next = next;
    }

    public Object getData() {
        return object;
    }

    public void setData(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }
    
    public boolean hasNext() {
        return next != null;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return object.toString();
    }

}
