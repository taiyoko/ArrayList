/*
 * Sarah Overlander
 */
package testarray;

import java.util.Arrays;
import java.lang.System;
/**
 * Recreates certain basic functions of the Java Arraylist class as an exercise in 
 * creating data structures. Only operates on objects, and while arrays can become
 * larger as needed, they cannot get smaller, making this version
 * unsuitable for large amounts of data being added and then removed.
 */
public class Arraylist {
    /**
     * Size of the Arraylist (number of elements it contains)
     */
    private int size;
    
    /**
     * Array to contain the items, its capacity is its length.
     */
    private Object[] elementItems;
    
    /**
     * Constructs an empty list with the specified capacity.
     * 
     * @param   n initial capacity of the list
     * @throws  IllegalArgumentException if the initial capacity is negative
     */
    public Arraylist(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + n);
        this.elementItems = new Object[n];
    }
    
    /**
     * Constructs an empty list with a capacity of 10 objects.
     */
    public Arraylist() {
        this.elementItems = new Object[10];
    }
    
    /**
     * Adds an element to the end of the arraylist after checking for capacity.
     * If there is not enough space, it copies the array into a replacement array 
     * that can hold one more item.
     * 
     * @param   x is the object to add to the list.
     */
    public void add(Object x) {
        if ((this.size + 1) < elementItems.length) {
           elementItems[size++] = x; 
        } else {
            elementItems = Arrays.copyOf(elementItems, size+1);
            elementItems[size] = x;
            size++;
        }
    }
    /**
     * Checks the arraylist for capacity, adds capacity if necessary, then
     * shifts existing elements in the index location and beyond to fit the new
     * element.
     * 
     * @param index is the index location to add the new item
     * @param x is the object to be added
     */
    public void add(int index, Object x) {
        if ((size+1)> elementItems.length) {
            elementItems = Arrays.copyOf(elementItems, size+1);
        }
        System.arraycopy(elementItems, index, elementItems, index + 1, (elementItems.length -1 ) - index);
        elementItems[index] = x;
        size++;
    }
    
    /**
     * Retrieves an object from a given index.
     * 
     * @param   index is the index of the object to get
     * @throws  IndexOutOfBoundsException if the index does not correspond to 
     * the number of elements in the ArrayList.
     * @return  the object contained at the index point.
     */
    public Object get(int index) {
        if (index > elementItems.length) {
            throw new IndexOutOfBoundsException();
        } else {
            return this.elementItems[index];
        }
    }
    /**
     * Returns how many elements are in the array BUT DOES NOT EQUAL CAPACITY
     * There may be fewer elements than the ArrayList can hold!
     * 
     * @return number of elements in the array
     */
    public int size() {
        return size;
    }
    
    /**
     * 
     * @return true if there are no elements in the array
     */
    public Boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Calls the find function because I don't know another way of comparing
     * objects in the array to a specified object. find(x) will return -1 if the
     * object is not in the array, or an index number if it is present.
     * 
     * @param x object to determine if is in the array
     * @return true if the object exists in the array
     */
    public Boolean isIn(Object x) {
        return find(x) >= 0;
    }
    
    /**
     * Searches the array for an object. elementItems.length is used as the end
     * of the loop because adding items via index may mean there are empty spaces
     * between elements and thus an object may be located at an index greater
     * than size.
     * 
     * @param x is the object to be located
     * @return integer of the index of the located object, or -1 if the object
     * is not part of the array
     */
    
    public int find(Object x) {
        int indexOfObject = -1;
        for (int i = 0; i < elementItems.length; i++){
            if (elementItems[i] == x)
                indexOfObject = i;
        }
        return indexOfObject;
    }
    
    /**
     * Searches for the first instance of an object in the array and removes it
     * by copying all objects right of it one index to the left, then makes the 
     * final element of the array null. Does not reduce capacity, but does reduce
     * size to reflect the change in the number of objects in the array.
     * 
     * @param x object to be removed
     */
    public void remove(Object x){
        int index = find(x);
        System.arraycopy(elementItems, index +1 , elementItems, index, (elementItems.length - 1) - index);
        elementItems[elementItems.length - 1] = null;
        size--;
    }
}
