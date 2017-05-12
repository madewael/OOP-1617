package oop.les02;

// Een klasse heeft een naam, en is een verzameling van ...
class Person {
    // fields (velden), en
    String name;
    int age;
    
    // methods (methoden, functies die bij een object horen).
    boolean isAdult(){
        // in de body van een method, kan je aan de fields van het object.
        return age>=18;
    }
}
