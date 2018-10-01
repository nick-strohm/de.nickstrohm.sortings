package de.nickstrohm.sortings;

import de.nickstrohm.sortings.algorithms.BaseAlgorithm;

public class Sort {
    public static void sortArray(Class cl, int[] x, Object... args) {
        try {
            ((BaseAlgorithm)cl.newInstance()).sort(x, args);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
