package oop.les09;

// Een interface is een verzameling van methoden zonder body.
// Dit vormt een contract voor andere klassen (zie MyArrayList)
public interface MyList {
    
    public int size(); // geef het aantal elementen terug
    
    public void add(String val); // voeg een element toe

    public String get(int idx); // haal een element op
    
    public void set(int idx, String val); // verander een element

    public void add(int idx, String val); // voeg een element toe op een bepaalde plek.
    
    public void remove(int idx); // verwijder een element op een bepaalde plek.
    
    public boolean remove(String str); // verwijder een bepaald element.
    
    public void clear(); // maak de lijst leeg.
    
    
}


