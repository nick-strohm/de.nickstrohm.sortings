package de.nickstrohm.sortings.algorithms;

public abstract class BaseAlgorithm {
    public BaseAlgorithm() { }

    public abstract void sort(int[] x, Object... args);

    public static void swap(int[] x, int firstIndex, int secondIndex) {
        int tmp = x[firstIndex];
        x[firstIndex] = x[secondIndex];
        x[secondIndex] = tmp;
    }

    public static boolean isArgOfType(Class cl, Object arg) {
        return arg.getClass() == cl;
    }

    public static <T> T getValueOfArg(Class<T> type, Object arg) {
        if (!isArgOfType(type, arg)) {
            return null;
        }

        return (T)arg;
    }
}
