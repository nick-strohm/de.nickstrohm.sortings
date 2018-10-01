package de.nickstrohm.sortings.algorithms;

public class SelectionSort extends BaseAlgorithm {
    @Override
    public void sort(int[] x, Object... args) {
        boolean minimum = true;
        boolean ascending = true;

        if (args.length > 0) {
            minimum = getValueOfArg(boolean.class, args[0]);
        }

        if (args.length > 1) {
            ascending = getValueOfArg(boolean.class, args[1]);
        }

        selectionSort(x, minimum, ascending);
    }

    private void selectionSort(int[] x, boolean minimum, boolean ascending) {
        if (minimum && ascending) {
            sortMinimumAscending(x);
        }
        else if (minimum && !ascending) {
            sortMinimumDescending(x);
        }
        else if (!minimum && ascending) {
            sortMaximumAscending(x);
        }
        else {
            sortMaximumDescending(x);
        }
    }

    private void sortMinimumAscending(int[] x) {
        int n = x.length;
        int left = 0;

        while (left < n) {
            int min = left;

            for (int i = left + 1; i < n; i++) {
                if (x[i] < x[min]) {
                    min = i;
                }
            }

            swap(x, min, left);
            left++;
        }
    }

    private void sortMinimumDescending(int[] x) {
        int n = x.length;
        int right = n - 1;

        while (right > 0) {
            int min = right;

            for (int i = right + 1; i < n; i++) {
                if (x[i] < x[min]) {
                    min = i;
                }
            }

            swap(x, min, right);
            right--;
        }
    }

    private void sortMaximumAscending(int[] x) {
        int n = x.length;
        int left = 0;

        while (left < n) {
            int min = left;

            for (int i = left + 1; i < n; i++) {
                if (x[i] > x[min]) {
                    min = i;
                }
            }

            swap(x, min, left);
            left++;
        }
    }

    private void sortMaximumDescending(int[] x) {
        int n = x.length;
        int right = n - 1;

        while (right > 0) {
            int min = right;

            for (int i = right + 1; i < n; i++) {
                if (x[i] > x[min]) {
                    min = i;
                }
            }

            swap(x, min, right);
            right--;
        }
    }
}
