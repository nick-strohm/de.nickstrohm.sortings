package de.nickstrohm.sortings;

public class Sort {
    /**
     * Swaps to variables inside an array
     * @param   x           Array of ints
     * @param   left        First index
     * @param   right       Second index
     */
    private static void swap(int[] x, int left, int right) {
        int tmp = x[left];
        x[left] = x[right];
        x[right] = tmp;
    }

    /**
     * Sorts an array of ints with the BubbleSort algorithm
     * @param   x           Array of ints
     * @param   ascending   Should the array be sorted ascending or descending
     */
    public static void bubbleSort(int[] x, boolean ascending) {
        int n = x.length;
        boolean swapped;

        for (int i = 0; i <= n; i++) {
            swapped = false;

            for (int j = i; j < n - i; j++) {
                if (x[j] > x[j + 1] && ascending) {
                    swap(x, j, j + 1);
                    swapped = true;
                }
                else if (x[j] < x[j + 1] && !ascending) {
                    swap(x, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Sorts an array of ints with the SelectionSort algorithm
     * @param   x           Array of ints
     */
    public static void selectionSort(int[] x) {
        int n = x.length;
        int min, minPos;

        for (int diff = 0; diff < n - 1; diff++) {
            min = x[diff];
            minPos = diff;

            for (int search = diff + 1; search < n; search++) {
                if (min > x[search]) {
                    min = x[search];
                    minPos = search;
                }
            }

            swap(x, diff, minPos);
        }
    }

    /**
     * Sorts an array of ints with the InsertionSort algorithm
     * @param   x           Array of ints
     */
    public static void insertionSort(int[] x) {
        int n = x.length;

        for (int i = 1; i < n; i++) {
            int key = x[i];
            int j = i - 1;

            while(j >= 0 && x[j] > key) {
                x[j + 1] = x[j];
                j++;
            }

            x[j + 1] = key;
        }
    }
}
