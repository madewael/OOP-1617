package oop.les16;

public class Les16 {
    public static void main(String[] args) {
        new Les16().run();
    }
    
    public void run() {
        
        // Person p = new Person("Alice", 12); // je kan geen instanties maken van een abstracte klasse.
        Person s = new Student("Alice", 12,"howest");
        System.out.println( s ); // gebruikt de toString van Student.
        
        Person e = new Employee("Bob", 41 ,1986);
        System.out.println( e ); // gebruikt de toString van Employee.
    }
}
