package oop.les03;

// Een klasse heeft een naam, en is een verzameling van ...
class Person {
    // fields (velden), en
    String name;
    int age;
    
    // constructors (speciale functie die nieuwe objecten aanmaakt)
    Person(String name, int age) {
        // de naam van een parameter heeft "voorrang" op de naam van field.
        // hier 'shadowed' (verbergt) de parameter "name" het field "name".
        // Om toch aan het field te kunnen gebruik je "this".
        // "this" is 'dit object', jezelf.
        this.name = name;
        this.age = age;
    }
    
    Person(String name) {
        // er kunnen meerdere constructores zijn (met andere parameters)
        // Je kan een andere condtruvtor oproepen (enkel als eerste statement)
        // dit wordt vaak gebruikt om "default" waarden toe te kennen: hier 18 als age.
        this(name, 18);
    }
    
    
    
    // methods (methoden, functies die bij een object horen).
    boolean isAdult(){
        // in de body van een method, kan je aan de fields van het object.
        return age>=18;
    }
}
