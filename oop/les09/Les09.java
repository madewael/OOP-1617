package oop.les09;

import oop.les06.MyArrayList;
import oop.les07.MyLinkedList;

public class Les09 {
    public static void main(String[] args) {
        new Les09().run();
    }
    
    public void run() {
        /*
         * Les09 ging over interfaces: MyArrrayList en MyLinkedlist hebben dezelfde 'interface'
         * MyArrrayList en MyLinkedlist zijn zeer VERSCHILLEND wat betreft de code (implementatie)
         * MyArrrayList en MyLinkedlist zijn zeer GELIJKAARDIG wat betreft de hun gedrag (doel en gebruik)
         * MyArrrayList en MyLinkedlist zijn zeer GELIJKAARDIG wat betreft hun methoden (namen en gebruik)
         * Daarom introduceren we de interface: een contract waar verschillende klassen zich toe kunnen verbinden:
         * Het doet er nu niet meer toe of je een MyArrrayList en MyLinkedlist gebruikt: ze doen hetzelfde, op andere manier
         */
        
        // De naam van een interface kan gebruikt worden als type !
        MyList lst1 = new MyArrayList();  // een MyArrayList object kan in een variabele van het type MyList gestoken worden...
        MyList lst2 = new MyLinkedList(); // een MyLinkedList object kan in een variabele van het type MyList gestoken worden...
        
        
        
    }
}
