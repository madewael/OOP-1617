package oop.les01;

import java.util.Scanner; // een import laat toe om een stuk code te gebruiken in deze file.

// Python 2 Java
public class Les01 {
    
    public static void main(String[] args) {
        // Deze methode is het startpunt v/e Java-programma.
        // je moet deze exact overnemen (enkel *args* mag je van naam veranderen.
        
        // alles na dubbele shuine strepen is commentaar.
        
        
        new Les01().run(); // dit komt aan bod in volgende les.
    }
    
    public void run() {
        
        
        int som = 0; // variabelen hebben een type.
        
        // for-lus: init, test, afterthought (hier increment) + body
        for (int i=0 ; i<10 ; i++) { 
            som+=i; // elk statement eindigt op een puntkomma.
        } // blokken code worden omgeven door accolades.
        
        if ( som == 45 ) { // if: met conditie, een then-tak en een else-tak.
            System.out.println("Som is juist berekend.");
        } else {
            System.out.println("Som is niet juist berekend.");
        }
        
        // Scanner is een klasse (zie later) die elders gedefinieerd is. Daarom moeten we deze importeren (zie lijn 3)
        Scanner in = new Scanner(System.in); // hier maken we een "Scanner". Die is nodig om input te vragen aan de gebruiker.
        boolean stop = false;
        
        // while-lus: conditie + body
        while ( !stop ) { 
            System.out.println("Continue? (y/n)"); // hier printen we op het scherm.
            String input = in.nextLine();
            stop = input.startsWith("n");
        }
        
        
        // hier 'weet' Java dat je de 'halve'-method met één int verwacht, want je geeft een int mee ...
        double d = halve(13); 
        System.out.println (d);
        
         // hier 'weet' Java dat je de 'halve'-method met int-array verwacht, want je geeft een (inline gekreerde) array mee ...
        double[] ds = halve( new int[]{1,2,3} ); 
        
        System.out.println("DONE");
    }
    
    // een functie (method) heeft een return-type, een naam, een parameterlijst en een body.
    // elke parameter heeft een type en een naam.
    double halve(int input) {
        return input/2.0; // return statement.
    }
    
    // een functie (method) kan dezelfde naam hebben maar andere paramter aantal/types en op return-type.
    // dit heet method overloading (meerdere methods met dezelfde naam).
    // Java kiest zelf (statisch) welke van de verschillende versies gekozen moet worden.
    double[] halve(int[] input) {
        double[] res = new double[ input.length ]; // maak een array ([]) van dezelfde lengte als de input array.
        
        for (int i=0 ; i<input.length ; i++) {
            res[i] = halve(input[i]); // hier 'weet' Java dat je de 'halve'-method met één int verwacht, want je geeft ene int mee ...
        }
        
        return res;
    }
    
}
