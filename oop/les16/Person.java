package oop.les16;

// Van een abstracte klasse kan je geen instanties maken.
public abstract class Person {

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
    
    // Een abstracte klasse kan abstracte methoden hebben: een method zonder body
    // Een subklasse van een abstracte klasse is verplicht alle abstract methods te implementeren.
    // dit is vergelijkbaar met de methods in een interface, maar hier kunnen ze ook bv protected zijn...
    protected abstract String getSpecialPropertiesAsString();
    @Override
    public String toString() {
        // Er bestaan geen instanties van Person zelf (abstract) maar alle subklassen zijn verplicht zelf
        // getSpecialPropertiesAsString() te implementeren. Java is dus zeker dat als je in dit stuk code komt
        // dat er EEN implementatie zal zijn voor getSpecialPropertiesAsString().
        // Het is dus veilig om deze te gebruiken.
        return this.getName() + " is " + getAge() + " years old.\n"
                + this.getSpecialPropertiesAsString();
    }
    
    public boolean isAdult(){
        return age>=18;
    }


}
