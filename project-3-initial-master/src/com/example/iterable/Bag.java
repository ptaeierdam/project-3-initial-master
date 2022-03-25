package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T>{

    ArrayList<T> array_1 = new ArrayList<T>();

    public boolean isEmpty() {
        return array_1.isEmpty();
    }

    public int size(){
        return array_1.size();
    }

    public void add(T item){
        array_1.add(item);
    }

    public Iterator iterator() {
        return array_1.iterator();
    }
}
