import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class Solutions {

    public class Problems {

        // Problem #1: Filter Out Strings from an Array

        //Create a function that takes an array of non-negative integers and strings
        //and returns a new array without the strings.

        public static <E> List<E> filterArray(List<E> toFilter){
            List<E> filteredList = toFilter.stream()
                    .filter(Problems::notInteger)
                    .collect(Collectors.toList());
            return filteredList;
        }

        //Filter predicate
        private static boolean notInteger(Object e){
            if (e.getClass() == Integer.class){
                return true;
            }
            return false;
        }

        //Problem #2: Multiply by 11

        //Given a positive number as a string, multiply the number by 11 and also return it as a string.
        //"You are NOT ALLOWED to simply cast the numeric string into an integer!"


    }

    public static void main(String[] args) {
        List myList = new ArrayList<>();
        myList.add(10);
        myList.add(30);
        myList.add("200");
        myList.add("400");
        myList.add(30);
        List filterArray = Problems.filterArray(myList);

        System.out.println("No filter: " + myList);
        System.out.println("Filtered: " + filterArray);
    }
}

// Problem #3: Logical Reasoning Question

//In this logic question, you are standing in a room with three light switches.
//The switches all correspond to three different light bulbs in an adjacent room that you cannot see into.
//With all the light switches starting in the off position,
//how can you find out which switch connects to which light bulb?

// My answer

// Switch on two out of the three and wait for the bulbs to heat up. After some time passes switch one off.
// One light bulb is on
// One light bulb is warm
// One light bulb is cold
// From this point it is possible to figure out what light bulb is attached to the respective switch.