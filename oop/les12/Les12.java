package oop.les12;


public class Les12 {
    
    // Main bestaat al VOOR er ook maar één object van de klasse Les12 bestaat.
    public static void main(String[] args) {
        new Les12().run(); // pas als we een instance van Les12 maken, kan je run oproepen...
    }
    
    // run bestaat voor elk object van de klasse Les12
    // en kan dus niet opgeroepen worden zonder dat er een object van de klasse Les12 bestaat.
    public void run() {
        System.out.println(Person.isExistingName("Alice"));
        
        Person p1 = new Person("Alice");
        System.out.println(Person.isExistingName("Alice"));
        
        // het object in p1 heeft een naam en een leeftijd (als fields),
        // de klasse Persoon heeft enkel een lijst van namen (als fields).
        
        
        Person[] ps = {
            p1,
            new Person("Alice"),
            new Person("Bob"),
            new Person("Alice"),
            new Person("Carol"),
            new Person("Alice"),
            new Person("David")
        };
        
        // Je vraag de meest populaire naam aan DE KLASSE Person,
        // en niet aan een object afzonderlijk !
        System.out.println(Person.mostPopularName());
        
    }
}
