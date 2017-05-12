package oop.les10;

public class Les10 {
    public static void main(String[] args) {
        new Les10().run();
    }
    
    public void run() {
        // gebruik JUnit testing om Finder te testen...
        Finder f = new Finder();
        
        
        int[] unsortedArray = {1,9,7,6,3,5,4,2,0,8};
        int[] sortedArray   = {0,1,2,3,4,5,6,7,8,9};
        
        System.out.println( f.find(5,  unsortedArray) );
        System.out.println( f.find(1,  unsortedArray) );
        System.out.println( f.find(7,  unsortedArray) );
        System.out.println( f.find(10,  unsortedArray) );
        
        System.out.println( f.find(5,  sortedArray) );
        System.out.println( f.find(1,  sortedArray) );
        System.out.println( f.find(7,  sortedArray) );
        System.out.println( f.find(10,  sortedArray) );
        
    }
}
