package de.nickstrohm.sortings;

import de.nickstrohm.sortings.algorithms.*;
import java.util.Random;
import static de.nickstrohm.sortings.Sort.sortArray;

public class Main {

    public static void main(String[] args) {
        int tests = 10;
        int elements = 10000;
        int maxValue = elements;

        System.out.println("Generating random values to sort (" + elements + " elements with a max value of " + maxValue + ").");

        int[] baseArr = getRandomValues(elements, maxValue);

        System.out.println("Starting to sort. Running " + tests + " tests per sorting algorithm.");

        System.out.println("Results:");

        measureSortingTime(BubbleSort.class, baseArr, tests, elements, maxValue);
        measureSortingTime(CountingSort.class, baseArr, tests, elements, maxValue);
        measureSortingTime(InsertionSort.class, baseArr, tests, elements, maxValue);
        measureSortingTime(MergeSort.class, baseArr, tests, elements, maxValue);
        measureSortingTime(QuickSort.class, baseArr, tests, elements, maxValue);
        measureSortingTime(SelectionSort.class, baseArr, tests, elements, maxValue);

        System.out.println();
        System.out.println();
    }

    private static void output(String name, int tests, int elements, int maxValue, double neededTime) {
        System.out.format(pad(name, 15) + " | Tests: " + pad("" + tests, 5) + " | Elements: " + pad("" + elements, 10) + " | Max Value: " + pad("" + maxValue, 10) + " | Needed time median: " + pad("" + neededTime, 10) + " Milliseconds\r\n");
    }

    private static String pad(String input, int len) {
        return String.format("%" + len + "s", input);
    }

    private static void measureSortingTime(Class cl, int[] baseArr, int tests, int elements, int maxValue) {
        long[] times = new long[tests];
        String name = cl.getSimpleName();

        for (int i = 0; i < tests; i++) {
            int[] arr = new int[baseArr.length];
            for (int j = 0; j < baseArr.length; j++) {
                arr[j] = baseArr[j];
            }

            long start = System.currentTimeMillis();
            sortArray(cl, arr);
            long end = System.currentTimeMillis();
            times[i] = end - start;
        }

        double median = 0;
        for (int i = 0; i < times.length; i++) {
            median += times[i];
        }
        median /= times.length;

        output(name, tests, elements, maxValue, median);
    }

    private static int[] getRandomValues(int length, int maxValue) {
        int[] arr = new int[length];
        Random rng = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rng.nextInt(maxValue);
        }

        return arr;
    }
}
