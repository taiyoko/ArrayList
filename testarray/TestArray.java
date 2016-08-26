/*
 * Sarah Overlander
 * CSC 3410 Fall 2015
 * Assignment #3
 * 23 September 2015
 */
package testarray;

import deck.Card;   //Import is to give me some objects to test with.
import java.lang.System;


public class TestArray {

    public static void main(String[] args) {
        
        /**
         * Card objects used for testing
         */
        Card threeOfHearts = new Card(3, "Hearts");
        Card sixOfSpades = new Card (6, "Spades");
        Card eightOfDiamonds = new Card(8, "Diamonds");
        
        /**
         * Boolean variables to determine successes of functions that do not
         * have any returns to show effects.
         */
        boolean success1 = false;
        boolean success2 = false;
        boolean success3 = false;
        boolean success4 = false;
        
        /**
         * Additional test arraylists because the ones from the try blocks
         * apparently don't persist afterwards.
         */
        Arraylist testArrayList3 = new Arraylist();
        Arraylist testArrayList4 = new Arraylist();
        
        /**
         * These two try blocks test to see if the arraylist constructors work.
         */
        try {
            Arraylist testArrayList1 = new Arraylist(5);
            success1 = true;
            System.out.println("Specific capacity arraylist created!");
        } finally {
            if (!success1) System.out.println("Specific Capacity arraylist failed.");
        }
        
        try {
            Arraylist testArrayList2 = new Arraylist();
            success2 = true;
            System.out.println("Generic 10-capacity arraylist created!");
        } finally {
            if (!success2) System.out.println("Generic 10-capacity arraylist failed.");
        }
        
        /**
         * The next two try blocks test the functioning of adding objects to 
         * Arraylists.
         */
        try {
            testArrayList3.add(threeOfHearts);
            success3 = true;
            System.out.println("3 of Hearts added to testArrayList3!");
            
        }finally {
            if (!success3) System.out.println("Object not added to list.");
        }
        
        try {
            testArrayList3.add(7, sixOfSpades);
            success4 = true;
            System.out.println("6 of Spades added to testArrayList3!");
        }finally {
            if (!success4) System.out.println("Object not added to list.");
        }
        
        //Tests the get function.
        System.out.println("The object in index 7 of testArrayList3 is: " + testArrayList3.get(7));
        
        //Tests the size function.
        System.out.println("The number of objects in testArrayList3 is: " + testArrayList3.size());
        
        //Tests both cases of the isEmpty function.
        System.out.println("testArrayList3 is empty: " + testArrayList3.isEmpty());
        System.out.println("testArrayList4 is empty: " + testArrayList4.isEmpty());
        
        //Tests both case of the isIn function.
        System.out.println("3 of Hearts is in testArrayList3: " + testArrayList3.isIn(threeOfHearts));
        System.out.println("8 of Diamonds is in testArrayList3: " + testArrayList3.isIn(eightOfDiamonds));
        
        //Tests the find function for both an object that is in the array list
        //and one that is not in the arraylist.
        
        System.out.println("Where is the 3 of Hearts? Index #" + testArrayList3.find(threeOfHearts));
        System.out.println("Where is the 8 of Diamonds? Index #" + testArrayList3.find(eightOfDiamonds));
        
        //Tests the remove function (and whether it updates the size correctly)
        System.out.println("Size before removal: " + testArrayList3.size());
        testArrayList3.remove(sixOfSpades);
        System.out.println("Size after removal: " + testArrayList3.size());
    }
    
}
