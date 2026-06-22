/**
 *  Java program to demonstrate bubble sorting algorithm of an array of integers.
 */

package com.mysort;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array of integers.
        int[] array = {7, 4, 3, 9, 0, 1, 2, 6, 3};

        // Calling method bubbleSort().
        bubbleSort(array);

    }

    // Method to sort numbers in ascending order.
    public static void bubbleSort(int[] array) {

        // Iterating through all elements of array.
        for (int index = 0; index < array.length - 1; index++) {

            // Iterating through subarray until last sorted elements.
            for (int j = 0; j < array.length - 1 - index; j++) {

                // Find the biggest element.
                if (array[j] > array[j + 1]) {

                    // Swapping elements.
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        // Printing sorted array to console.
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}