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
public class PriorityLinkedList {
    
    private Node head, next;
    private int size;

    /**
     * PriorityLinkedList constructor
     */
    public PriorityLinkedList() {
        head = null;
        next = null;
        size = 0;
    }
    
    /**
     * the add() method is used to add an object to the list
     * @param object the object to be added
     * @param priority the priority of the object
     */
    public void add(Object object, int priority) {
        if(head == null){
            head = new Node(object, priority);
        }else{
            if(head.getPriority() <= priority) {
                Node node = new Node(object, priority, head);
                head = node;
            }else{
                if(!head.hasNext()) {
                    Node node = new Node(object, priority);
                    head.setNext(node);
                }else{
                    Node temp = head;
                    while(temp.getNext() != null && temp.getNext().getPriority() > priority) {
                        temp = temp.getNext();
                    }
                    Node node = new Node(object, priority, temp.getNext());
                    temp.setNext(node);
                }
            }
        }
        size++;
    }
    
    /**
     * the remove() method is used to remove an object from the list
     * @return the removed object
     */
    public Object remove() {
        if(head == null) {
            return null;
        }else{
            if(next == null) {
                return null;
            }else if(next == head) {
                Object object = head.getData();
                head = head.getNext();
                next = head;
                size--;
                return object;
            }else{
                Node node = head;
                while(node.getNext() != next) {
                    node = node.getNext();
                }
                Object object = next.getData();
                node.setNext(next.getNext());
                size--;
                return object;
            }
        }
    }
    
    /**
     * the remove() method is used to remove an object from the list by passing it
     * @param object the object to be removed
     * @return the removed object
     */
    public Object remove(Object object) {
        if(head == null) {
            return null;
        }else if(head.getData() == object) {
            head = head.getNext();
            size--;
            return object;
        }else{
            Node node = head;
            while(node.getNext() != null && node.getNext().getData() != object) {
                node = node.getNext();
            }
            if(node.getNext() == null) {
                return null;
            }else{
                node.setNext(node.getNext().getNext());
                size--;
                return object;
            }
        }
    }
    
    /**
     * getting the size of the list
     * @return the size of the list
     */
    public int getSize() {
        return size;
    }
    
    /**
     * selects the next object from the linked list
     * @return the next object
     */
    public Object next() {
        Object object;
        if(head == null) {
            return null;
        }else{
            if(next == null) {
                next = head;
                object = next.getData();
            }else{
                if(next.hasNext()) {
                    next = next.getNext();
                    object = next.getData();
                }else{
                    next = null;
                    return null;
                }
            }
        }
        return object;
    }
    
    /**
     * selects the next object after the selected object
     * @return the next object of the next object
     */
    public Object getNext() {
        if(head == null) {
            return null;
        }else{
            if(next == null) {
                return head.getData();
            }else{
                return next.getNext().getData();
            }
        }
    }
    
    /**
     * checks if the item has next
     * @return true if there is next item, or false if doesn't
     */
    public boolean hasNext(){
        if(head == null)
        {
            return false;
        }else{
            if(next == null) {
                return true;
            }else{
                return next.hasNext();
            }
        }
    }
    
    @Override
    public String toString() {
        String s = "(";
        if(head != null) {
            s += head.toString();
            Node node = head.getNext();
            while(node != null) {
                s += ","+node.getData().toString();
                node = node.getNext();
            }
        }
        s += ")";
        return s;
    }
}
