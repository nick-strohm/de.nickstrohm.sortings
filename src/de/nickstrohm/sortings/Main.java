package de.nickstrohm.sortings;

public class Main {

    public static void main(String[] args) {
        int[] x = Tester.generateArray(20);
        Tester.sortWithBubbleSort(x);
        Tester.sortWithSelectionSort(x);
        Tester.sortWithInsertionSort(x);
    }
}
