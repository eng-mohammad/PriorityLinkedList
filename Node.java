/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Mohammad
 */
public class Node {
    
    private Object oBject;
    private int priority;
    private Node next;

    public Node(Object oBject, int priority) {
        this.oBject = oBject;
        this.priority = priority;
        this.next = null;
    }

    public Node(Object oBject, int priority, Node next) {
        this.oBject = oBject;
        this.priority = priority;
        this.next = next;
    }

    public Object getData() {
        return oBject;
    }

    public void setData(Object oBject) {
        this.oBject = oBject;
    }

    public Node getNext() {
        return next;
    }
    
    public boolean hasNext() {
        if(next == null) {
            return false;
        }else{
            return true;
        }
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
        return oBject.toString();
    }

}
