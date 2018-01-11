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
}
