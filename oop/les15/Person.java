package oop.les15;

public class Person {

    private final String name;
    private int age;

    public String getName() { return name; }
    public int getAge() { return age; }
    
    public void setAge(int age) { this.age = age; }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
