package oop.les04;

class Person {

    // Kan fields, methods en construtors "beschermen" of "verstoppen" voor buitenstaanders (bv. een andere klasse).
    // Dit doe je door visibility modifiers toe te voegen.
    
    // public  : zichtbaar voor iedereen
    // private : enkel zichtbaar voor de eigen klasse
    // niet    : zichtbaar voor alle klassen in dezelfde package.
    // er komt er later nog ééntje bij.
    
    // elke visibility modifiers kan gebruikt worden op zowel fields, methods als constructors.
    
    
    // Klassiek gaan we de fields verbergen voor de buitenwereld:
    private String name;
    private int age;
    
    // En voorzien we methods om deze op te vragen en aan te passen:
    public String getName() { return name; } // getter: haalt de waarde van een field op.
    public int getAge() { return age; }
    
    public void setAge(int age) { this.age = age; } // setter: past de waarde van een field aan.
    // geen setter voor "name", want namen veranderen normaal nooit.
    // als je dit weet: een field dat nooit van waarde zal veranderen, kan je dit ook melden aan java:
    // final zorg ervoor dat een field niet kan veranderen.
    // public final String name; ipv lijn 17.
    
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name) {
        this(name, 18);
    }
    
    
    
    // methods (methoden, functies die bij een object horen).
    public boolean isAdult(){
        // in de body van een method, kan je aan de fields van het object.
        return age>=18;
    }
}
