package Generic;


import java.util.List;

public class GenericMethodDemo<T> {

   // public createArray() {
//        Integer[] intArray = {1, 2};
//        String[] stringArray = {"John Doe", "Jane Smith"};
//        printArray(intArray);   //invoke printArray()
//        printArray(stringArray);
//    }


    //T is any type of object - Generics work with object only.
    //public static <T> void  printArray(T[] Array) {
    public static <T> void printList(List<T> list){
        System.out.println("Printing List of Employee :");
        for (T element : list) {
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
