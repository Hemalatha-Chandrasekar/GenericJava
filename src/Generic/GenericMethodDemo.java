package Generic;

import java.util.ArrayList;


public class GenericMethod<T> {

    public createArray() {
        Integer[] intArray = {1, 2};
        String[] stringArray = {"John Doe", "Jane Smith"};
        printArray(intArray);   //invoke printArray()
        printArray(stringArray);
    }


    //T is any type of object - Generics work with object only.
    public <T> void createArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }

    }
}

/// / Generic Method to print the list of any type
//    public <T> void printArray(T[] array) {
//        System.out.println("Printing List of Empoyee :\n");
//
//        for (T element : array) {
//            System.out.println(element);
//
//        }
//    }
