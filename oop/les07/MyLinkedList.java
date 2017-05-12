package oop.les07;

import oop.les09.MyList;

// De klasse MyLinkedList verbindt zich ertoe om alle methoden van MyList (interface) te implemteren.
// MyLinkedList implementeert een lijst-structuur door middel van de hulp-klasse Node.
// Elke Node bevat één element, de nodes worden dmv referenties aan alkaar gehangen (zoals een slinger).
public class MyLinkedList implements MyList {
    
    private Node head;
    private Node tail;
    private int size; // je kan de lengte ook berekenen door het aantal knopen te tellen (oefening?)
    
    public MyLinkedList() {
        clear();
    }

    @Override
    public int size() {
        return size;
    }

    private boolean isEmpty() { 
        return size == 0; 
    }
        
    private boolean isValidIndex(int i) { 
        return 0 <= i && i < size(); 
    }
    
    @Override
    public String get(int i) {
        if (isValidIndex(i)) {
            Node curr = head;
            for (int pos = 0; pos < i; pos++) {
                curr = curr.next;
            }
            return curr.val;
        } else {
            /* help! */ //throw new IndexOutOfBoundsException();
            return null;
        }
    }

    @Override
    public void set(int i, String val) {
        if (isValidIndex(i)) {
            Node curr = head;
            for (int pos = 0; pos < i; pos++) {
                curr = curr.next;
            }
            curr.val = val;
        } else {
            /* help! */ //throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void add(String val) {
        Node tmp = new Node(val, null);
        if(!isEmpty()) {
            tail.next = tmp;
        } else {
            head = tmp;
        }
        tail = tmp;
        size++;
    }

    @Override
    public void add(int i, String val) {
        if (isValidIndex(i)) {
            if (i == 0) {
                head = new Node(val, head);
            } else {
                Node curr = head;
                for (int pos = 0; pos < i-1; pos++) {
                    curr = curr.next;
                }
                curr.next = new Node(val, curr.next);
            }
            size++;
        } else {
            /* help! */ //throw new IndexOutOfBoundsException();
        }
    }

    public String removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Node tmp = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return tmp.val;
        }
    }
    
    public String removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            Node tmp = tail;
            if (tail != null){
                tail.next = null;
            }else {
                head = null;
            }        
            size--;
            return tmp.val;
        }
    }
     
    @Override
    public void remove(int i) {
        if (isValidIndex(i)) {
            if (i == 0) {
                removeFirst();
            } else {
                if (i == size-1) {
                    removeLast();
                } else {
                    Node curr = head;
                    for (int pos = 0; pos < i-1; pos++) {
                        curr = curr.next;
                    }
                    curr.next = curr.next.next;
                    if (curr.next == null) {
                        tail = curr;
                    }
                    size--;
                }
            }
        } else {
            /* help! */  //throw new IndexOutOfBoundsException();
        }
    }
    
    @Override
    public boolean remove(String val) {
        boolean deleted = false;
        if (!isEmpty()) {
            if (head.val.equals(val)) {
                removeFirst();
                deleted = true;
            } else {
                Node curr = head;
                while(!deleted && curr != null) {
                    if (curr.next != null && curr.next.val.equals(val)){
                        curr.next = curr.next.next; 
                        if (curr.next == null) {
                            tail = curr;
                        }
                        size--;
                        deleted = true;
                    } else {
                        curr = curr.next;           
                    }
                }
            }
        }
        return deleted;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }
    
}
