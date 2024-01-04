package com.przemyslowe.lab4.zad2.sort;

import org.springframework.stereotype.Component;

@Component("bubbleSort")
public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}