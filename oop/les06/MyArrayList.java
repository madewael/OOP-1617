package oop.les06;

// De klasse MyArrayList verbindt zich ertoe om alle methoden van MyList (interface) te implemteren.

import oop.les09.MyList;

// MyArrayList implementeert een lijst-structuur door elementen naast elkaar in een (te) grote array te stoppen.
public class MyArrayList implements MyList {

    // de array is groter dan het aantal elementen in de lijst.
    private String[] array;
    
    // size is het aantal elementen.
    // Door het aantal elementen bij te houden, weten we welke plek in de te grote array nog vrij is.
    private int size = 0;

    public MyArrayList() {
        array = new String[10]; // intial capacity
        size = 0;
    }

    @Override // dit kan je schrijven boven elke method die je moet implementeren van de interface.
    // http://stackoverflow.com/questions/94361/when-do-you-use-javas-override-annotation-and-why
    public int size() {
        return size;
    }

    // private methods zijn vaak hulp-methoden ...
    private int capacity() {
        return array.length;
    }

    private boolean isFull() {
        return size() == capacity();
    }

    private void ensureCapacity() {
        if (isFull()) {
            String[] oldArray = array;
            array = new String[oldArray.length * 2];
            for (int i = 0; i < oldArray.length; i++) {
                array[i] = oldArray[i];
            }
        }
    }

    @Override
    public void add(String val) {
        ensureCapacity();
        array[size] = val;
        size = size + 1;
    }

    private boolean isValidIndex(int idx) {
        return idx >= 0 && idx < size();
    }

    @Override
    public String get(int idx) {
        if (isValidIndex(idx)) {
            return array[idx];
        } else {
            /* oeps */
            return null;
        }
    }

    @Override
    public void set(int idx, String val) {
        if (isValidIndex(idx)) {
            array[idx] = val;
        } else {
            /* oeps */
        }
    }

    @Override
    public void add(int idx, String val) {
        ensureCapacity();

        for (int i = size; i >= idx; i--) {
            array[i + 1] = array[i];
        }
        array[idx] = val;
        size = size + 1;
    }

    @Override
    public void remove(int idx) {
        for (int i = idx; i < size; i++) {
            array[i] = array[i + 1];
        }
        size = size - 1;
    }

    public int indexOf(String str) {
        for (int i = 0; i < size; i++) {
            if ((array[i] == null && str == null) || array[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(String str) {
        int idx = indexOf(str);
        if (idx <= 0) {
            return false;
        }
        remove(idx);
        return true;
    }

    @Override
    public void clear() {
        // clean up
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

}
