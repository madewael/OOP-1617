package oop.les10;


class Finder {
    
    public int find(int needle, int[] haystack) {
        if ( isSorted(haystack)) {
            // Binary search werkt enkel op gesorteerde data ...
            return binSearch(needle, haystack);
        } else {
             return linSearch(needle, haystack);
        }
    }

    private boolean isSorted(int[] haystack) {
        int last = haystack[0];
        for (int i=1 ; i<haystack.length ; i++) {
            if (last>haystack[i]) return false;
            last = haystack[i];
        }
        return true;
    }
    
    private int linSearch(int needle, int[] haystack) {
        for (int i=0 ; i<haystack.length ; i++) { // Loop over elk element
            if (haystack[i] == needle) // als je het vindt
                return i; // geef je de plaats terug
        }
        return -1; // als je het niet vindt, geef je -1 terug.
    }


    private int binSearch(int needle, int[] haystack) {
        // hulp methode op binSearch op te roepen voor de volledige array:
        // van 0 tot de lengte van de array.
        return binSearch(needle, haystack, 0, haystack.length);
    }
    
    private int binSearch(int needle, int[] haystack, int from, int to) {
        // Zoek needle in haystack vanaf postite "from" tot vlak voor postitie "to".
        if (  (to-from)<=1  ) { // Als er maar één element meer te bekijken valt
            if (haystack[from]==needle) // en het is het element dat we zoeken
                return from; // geef de positie terug
            else
                return -1; // anders komt het niet voor in het interval [from,to[ en dan geef je -1 terug.
        }
        
        int mid = (from+to)/2; // bereken het midden van het interval [from,to[.
        
        if (haystack[mid]==needle) { // Al shet element dat we zoeken net in het midden zit, geef dan de postite terug (mid).
            return mid;
        } else if ( needle < haystack[mid]) { // Als het element dat we zoeken kleiner is ...
            return binSearch(needle, haystack, from, mid); // zoek dan verder aan de linker kant [from,mid[
        } else { // als het element groter is ...
            return binSearch(needle, haystack, mid, to); // zoek dan verder aan de rechter kant [mid,to[
        }
        // Dit werkt enkel als de data gesorteerd is (ga na of je snapt waarom !).
        
    }
    
    
    
    
}
