package de.nickstrohm.sortings.algorithms;

public class BubbleSort extends BaseAlgorithm {
    @Override
    public void sort(int[] x, Object... args) {
        boolean ascending = true;

        if (args.length >= 1) {
            ascending = getValueOfArg(boolean.class, args[0]);
        }

        bubbleSort(x, ascending);
    }

    private void bubbleSort(int[] x, boolean ascending) {
        int n = x.length - 1;
        boolean swapped = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
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
}
