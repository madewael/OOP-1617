package oop.les04;


public class Les04 {
    public static void main(String[] args) {
        new Les04().run();
    }
    
    public void run() {
        // Je kan van een klasse een object maken: instantiëren.
        // door één van de constructors te gebruiken.
        Person p1 = new Person("Alice", 12);
        
        System.out.println(p1.getName() + " is " +  p1.getAge() + " jaar oud." );
        if ( p1.isAdult() ) {
            System.out.println(p1.getName() + " is volwassen." );
        }
        
        Person p2 = new Person("Bob"); // hier kies je de 2de constructor met enkel een naam.
        
        System.out.println(p2.getName() + " is " +  p2.getAge() + " jaar oud." );
        if ( p2.isAdult() ) {
            System.out.println(p2.getName() + " is volwassen." );
        }
        
        
        
    }
}
