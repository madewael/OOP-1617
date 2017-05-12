package oop.les07;

public class Node {
    // Een node houdt één element bij (val) 
    String val;
    
    // En weer enkel wie de volgende node is (next) ...
    Node next;

    Node(String val) {
        this(val, null);
    }

    Node(String val, Node next) {
        this.val = val;
        this.next = next;
    }
    
}
