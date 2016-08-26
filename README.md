# ArrayList
Java custom implementation of the ArrayList structure written for Data Structures course

`Arraylist.java` is the actual implementation of the features of an arraylist, while `TestArray.java` is the code written to test the functionality. This code only works on objects.

It also imports `deck.Card` from my other project to have some objects to test with.

The key functions of this structure:
* Constructing an ArrayList of a specified size or, if no size is specified, initial size of 10
* Adds objects at the end of the list or at a specific location. If there is not enough space in the array, it copies the array into a replacement that has one more space available before it adds the object.
* Retrieves an object from a specified index.
* Returns the number of objects currently inside the ArrayList.
* Returns a boolean to determine if the ArrayList is empty.
* Searches the ArrayList for an object.
* Determines if an object is an element in the array.
* Removes the first instance of a specified object in the array.
