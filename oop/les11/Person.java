package oop.les11;

public class Person {

    // final zorg ervoor dat een field niet kan veranderen.
    private final String name;
    private int age;

    public String getName() { return name; } // getter: haalt de waarde van een field op.
    public int getAge() { return age; }
    
    public void setAge(int age) { this.age = age; } // setter: past de waarde van een field aan.
    // geen setter voor "name", want namen veranderen normaal nooit.
    // als je dit weet: een field dat nooit van waarde zal veranderen, kan je dit ook melden aan java: zie final
    
    
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name) {
        this(name, 18);
    }
    
    @Override // Override omdat eigelijk alle object een toString methode hebben.
    // Probeer eens 'toString' op een persoon uit een eerdere 'les'.
    // Dan zie je iets in de zin van Persoon@4597654. Dit is de "standaard" versie van toString
    // Als je een "eigen" versie wil moet je de standaard overschrijven (overriden):
    public String toString() { // public String toString() exact over te nemen !!!
        return this.getName() + " is " + getAge() + " years old.";
        // Je kan excpliciet this voor  een field of method access zetten .. . of niet ...
    }
    
    // methods (methoden, functies die bij een object horen).
    public boolean isAdult(){
        // in de body van een method, kan je aan de fields van het object.
        return age>=18;
    }
    
    @Override // Override omdat eigelijk alle object een toString methode hebben.
    // Zelfde verhaal als bij toString: als je je eigen versie wil,
    // moet je de standaard overschrijven (overriden):
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
