package oop.les11;

import java.util.Arrays;

public class Les11 {

    public static void main(String[] args) {
        new Les11().run();
    }

    void run() {

        int x = 1;
        int y = 1;
        
        // ints met dezelfde waarde zijn gelijk aan elkaar
        System.out.printf("%d == %d is %b\n",x,y,x == y);
        
        String temp = "X";
        String a = temp+temp;
        String b = temp+temp;
        
        // Strings met dezelfde waarde zijn NIET altijd gelijk aan elkaar
        System.out.printf("%s == %s is %b\n",a,b,a==b);
        // Strings met dezelfde waarde zijn wel 'equals'.
        System.out.printf("%s.equals(%s) is %b\n\n",a,b,a.equals(b));
        
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");
        // Persons met dezelfde waarde zijn NIET altijd gelijk aan elkaar
        System.out.printf("(%s) == (%s) is %b\n",p1,p2,p1==p2);
        // Persons met dezelfde waarde zijn wel 'equals'. omdat we zelf de equals hebben overschreven (override)
        System.out.printf("(%s).equals(%s) is %b\n\n",p1,p2,p1.equals(p2));
        

        arrayOfIntsEquality();
        arrayOfObjectsEquality();
    }

    void arrayOfIntsEquality() {
        int[] i1 = {1, 2, 3};
        int[] i2 = {1, 2, 3};
        System.out.println("Arrays of integers");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        // Speciale functie nodig om de INHOUD van arrays te vergelijken !
        System.out.println(Arrays.equals(i1, i2));
        System.out.println();
    }

    void arrayOfObjectsEquality() {
        System.out.println("Arrays of Person-objects");
        Person p0 = new Person("Bart");
        Person p1 = new Person("Marieke");
        Person p2 = new Person("Tom");
        Person[] family1 = new Person[]{p0, p1, p2};
        Person[] family2 = new Person[]{
            new Person("Bart"),
            new Person("Marieke"),
            new Person("Tom")
        };
        System.out.println(family1 == family2);
        System.out.println(family1.equals(family2));
        System.out.println(Arrays.equals(family1, family2));
        System.out.println();
    }

}
