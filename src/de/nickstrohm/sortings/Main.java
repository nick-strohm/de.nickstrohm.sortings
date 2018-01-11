package de.nickstrohm.sortings;

public class Main {

    public static void main(String[] args) {
        int[] values = Tester.generateArray(20);
        Sort.bubbleSort(values.clone(), false);
    }
}
