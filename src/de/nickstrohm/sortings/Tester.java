package de.nickstrohm.sortings;

import java.util.Random;

public class Tester {
    private static final Random rng = new Random();

    /**
     * Generates an array of ints with a length of <code>n</code> and a maximum value of 20
     * @param   n           Length of the returned array
     * @return              Array of ints
     */
    public static int[] generateArray(int n) {
        return generateArray(n, 20);
    }

    /**
     * Generates an array of ints with a length of <code>n</code> and a maximum value of <code>max</code>
     * @param   n           Length of the returned array
     * @param   max         Maximum value of the generated ints
     * @return              Array of ints
     */
    public static int[] generateArray(int n, int max) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++){
            output[i] = rng.nextInt(max);
        }

        return output;
    }

    /**
     * Prints an array of ints delimited by an comma
     * @param   x           Array of ints
     */
    public static void print(int[] x) {
        int n = x.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.print(x[i] + ", ");
        }

        System.out.println(x[n - 1]);
    }

    public static void sortWithBubbleSort(int[] x) {
        int[] array = x.clone();
        System.out.print("Bubble: ");
        print(array);
        Sort.bubbleSort(array, true);
        System.out.print("Bubble: ");
        print(array);
    }

    public static void sortWithSelectionSort(int[] x) {
        int[] array = x.clone();
        System.out.print("Selection: ");
        print(array);
        Sort.selectionSort(array);
        System.out.print("Selection: ");
        print(array);
    }

    public static void sortWithInsertionSort(int[] x) {
        int[] array = x.clone();
        System.out.print("Insertion: ");
        print(array);
        Sort.insertionSort(array);
        System.out.print("Insertion: ");
        print(array);
    }
}
