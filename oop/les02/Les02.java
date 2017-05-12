package oop.les02;

public class Les02 {
    public static void main(String[] args) {
        new Les02().run();
    }
    
    public void run() {
        // Je kan van een klasse een object maken: instantiëren.
        Person p1 = new Person();
        p1.name = "Alice"; // Je kan waarden toekennen aan de fields van elk object.
        p1.age = 12;
        
        System.out.println(p1.name + " is " +  p1.age + " jaar oud." );
        if ( p1.isAdult() ) {
            System.out.println(p1.name + " is volwassen." );
        }
        
        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 21;
        
        System.out.println(p2.name + " is " +  p2.age + " jaar oud." );
        if ( p2.isAdult() ) {
            System.out.println(p2.name + " is volwassen." );
        }
        
        Person p3 = new Person();
        p3.name = "Bob";
        p3.age = 21;
        
        if ( p2 == p3 ) {
            // een object van dezelfde klasse met de dezelfde waarden in zijn fields is niet "hetzelfde" object.
            // ze "lijken" enkel maar op elkaar.
        } else {
            System.out.println("p2 is niet gelijk aan p3 !!!");
        }
        
        
        
    }
}
