package de.nickstrohm.sortings.algorithms;

public class InsertionSort extends BaseAlgorithm {
    @Override
    public void sort(int[] x, Object... args) {
        insertionSort(x);
    }

    private void insertionSort(int[] x) {
        int n = x.length;

        for (int i = 1; i < n; i++) {
            int key = x[i];
            int j = i;

            while (j > 0 && x[j - 1] > key) {
                x[j] = x[j - 1];
                j--;
            }

            x[j] = key;
        }
    }
}
