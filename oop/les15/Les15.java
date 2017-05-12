package oop.les15;

public class Les15 {
    public static void main(String[] args) {
        new Les15().run();
    }
    
    public void run() {
        
        Person p = new Person("Alice", 12);
        Student s = new Student("Alice", 12,"howest");
        s.getName(); // van uit Person
        s.getSchool(); // van uit Student
        
        System.out.println(s.toString()); // gebruikt de toString van Student.
        
        Person p2 = new Student("Alice", 12,"howest"); // Je kan een Student-object in een Person-variable stoppen.
        p2.getName(); // van uit Person
        // p2.getSchool(); // dit lukt niet meer omdat Java niet zeker is of de methode getSchool zal bestaan voor alle Personen...
        // er kan namelijk ook een "gewoon" persoon inzitten.
        
        
        System.out.println(p2.toString()); // gebruikt de toString van Student want het is het object ZELF dat reageert,
        // p2 is nog steeds een Student
    }
}
