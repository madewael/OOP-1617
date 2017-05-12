package oop.les12;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    // Een static field, is een field van een klasse, het bestaat dus maar één keer (want elke klasse is uniek).
    public static List<String> names = new ArrayList<String>();
    
    // Een static method, is een method van een klasse, je roept deze methodes op op de klasse:
    // Person.isExistingName("Alice");
    public static boolean isExistingName(String name) {
        return names.contains(name);
    }
    
    // Een static method kan ook private zijn
    private static int frequency(String name) {
        int count = 0;
        for(String existingName : names) { // enhanced for: loop over all elements of a list (or array, or ...)
            if (existingName.equals(name))
                count++; // increment the int variable count.
        }
        return count;
    }
    
    public static String mostPopularName(){
        String mostPopularName = null;
        int maxFrequency = -1;
        for(String name : names) {
            int frequency = frequency(name);
            if ( frequency>maxFrequency ) {
                maxFrequency = frequency;
                mostPopularName = name;
            }
        }
        return mostPopularName;
    }

    // Een niet static method bestaat PER OBJECT.
    private final String name;
    private int age;

    public String getName() { return name; }
    public int getAge() { return age; }
    
    public void setAge(int age) { this.age = age; }
    
    public Person(String name, int age) {
        this.name = name; // niet-static
        this.age = age; // niet-static
        names.add(name); // static: elke Persoon die nieuw aangemaakt wordt, stopt zijn eigen naam in 
        // de static lijst van namen. Deze lijst is een static field van Person, en  bestaat dus EEN KEER.
    }
    
    public Person(String name) {
        this(name, 18);
    }
    
    @Override
    public String toString() {
        return this.getName() + " is " + getAge() + " years old.";
    }
    
    public boolean isAdult(){
        return age>=18;
    }
    
    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) // null kan nooit hetzelfde zijn als dit object.
            return false;
        
        // Hier wordt this gebruikt als het volledige object !
        if (obj == this) // als dit object hetzelfde object is als 'obj', dan is het zeker ook 'equals'.
            return true;
        
        if ( !(obj instanceof Person) ) // een object van een andere klasse kan nooit hetzelfde zijn als dit object.
            return false;
        
        // WIJ zijn nu zeker dat obj ook een Persoon-object is, nu Java nog overtuigen:
        Person other = (Person) obj; // casten (hier gebeurt NIETS! Enkel extra info voor Java.
        
        
        return this.getName().equals(other.getName()) // Namen zijn Strings, Strings zijn objecten dus equals gebruiken als je ze wil vergelijken.
                && this.getAge() == other.getAge(); // Leeftijded zijn ints, ints zijn primitives dus == kan je gebruiken om te vergelijken.
    }
}
