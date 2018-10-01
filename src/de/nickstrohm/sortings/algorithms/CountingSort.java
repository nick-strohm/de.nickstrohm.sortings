package de.nickstrohm.sortings.algorithms;

public class CountingSort extends BaseAlgorithm {
    @Override
    public void sort(int[] x, Object... args) {
        countingSort(x);
    }

    private void countingSort(int[] x) {
        int n = x.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[x[i]]++;
        }

        int currentIndex = 0;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < count[i]; j++) {
                x[currentIndex] = i;
                currentIndex++;
            }
        }
    }
}
