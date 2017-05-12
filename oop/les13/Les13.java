package oop.les13;

public class Les13 {
    public static void main(String[] args) {
        new Les13().run();
    }
    
    public void run() {
        // Tot nu toe weten we enkel hoe we object kunnen vergelijken met equal.
        // Maar daarmee weten we niet of ze 'groter' of 'kleiner' zijn dan een andere object,
        // enkel 'equal' of niet 'equal'.
        
        // bovendien werken de operatoren < en > enkel op getallen:
        System.out.printf("%d < %d is %b\n",1,2,1<2);
        System.out.printf("%d > %d is %b\n",1,2,1>2);
        
        // en niet op personen
        Person p1 = new Person("Alice",50);
        Person p2 = new Person("David",18);
        // System.out.printf("%s < %s is %b\n",p1,p2,p1<p2); // Mag niet van Java.
        
        // Je kan enkel objecten met elkaar vergelijken als ze vergelijkbaar zijn (Comparable)
        System.out.printf("(%s.compareTo(%s) is %d\n",p1,p2,p1.compareTo(p2));
        
        // Dit laat toe om te sorteren met  Arrays.sort( someArray ); als de elementen in someArray allemaal Comparable zijn met elkaar.
        
        PersonNameComparator check = new PersonNameComparator();
        // Als objecten niet met elkaar vergelijkbaar zijn (Comparable) of je wil ze op basis van iets anders vergelijken
        // kan je extern object inschakelen dat de vergelijking voor jou maakt: een Comparator (een vergelijker).
        System.out.printf("check.compare((%s),(%s))) is %d\n",p1,p2,check.compare(p1, p2));
        
        // Dit laat toe om te sorteren met  Arrays.sort( someArray, someComparator );
        
    }
}
