package de.nickstrohm.sortings.algorithms;

public class QuickSort extends BaseAlgorithm {
    @Override
    public void sort(int[] x, Object... args) {
        int low = 0;
        int high = x.length - 1;

        if (args.length >= 2) {
            int arg0 = getValueOfArg(int.class, args[0]);
            int arg1 = getValueOfArg(int.class, args[1]);

            if (arg0 < high && arg0 < arg1) {
                low = arg0;
            }

            if (arg1 < high) {
                high = arg1;
            }
        }

        quickSort(x, low, high);
    }

    private void quickSort(int[] x, int low, int high) {
        if (low < high) {
            int pi = quickPartition(x, low, high);

            quickSort(x, low, pi - 1);
            quickSort(x, pi + 1, high);
        }
    }

    private int quickPartition(int[] x, int low, int high) {
        int pivot = x[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (x[j] <= pivot) {
                i++;
                swap(x, i, j);
            }
        }

        swap(x, i + 1, high);
        return i + 1;
    }
}
