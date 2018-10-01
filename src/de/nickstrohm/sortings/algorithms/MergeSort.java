package de.nickstrohm.sortings.algorithms;

public class MergeSort extends BaseAlgorithm {
    @Override
    public void sort(int[] x, Object... args) {
        mergeSort(x);
    }

    private void mergeSort(int[] x) {
        if (x.length <= 1) {
            return;
        }

        int pivot = x.length / 2;
        int[] left = new int[pivot];
        int[] right = new int[x.length - pivot];

        for(int i = 0; i < left.length; i++) {
            left[i] = x[i];
        }

        for (int i = 0; i < + right.length; i++) {
            right[i] = x[i + pivot];
        }

        mergeSort(left);
        mergeSort(right);

        x = merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] x = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int indexResult = 0;

        while (indexLeft < left.length && indexResult < right.length) {
            if (left[indexLeft] < right[indexRight]) {
                x[indexResult] = left[indexLeft];
                indexLeft++;
            }
            else {
                x[indexResult] = right[indexRight];
                indexRight++;
            }

            indexResult++;
        }

        while(indexLeft < left.length) {
            x[indexResult] = left[indexLeft];
            indexLeft++;
            indexResult++;
        }

        while(indexRight < right.length) {
            x[indexResult] = right[indexRight];
            indexRight++;
            indexResult++;
        }

        return x;
    }
}
