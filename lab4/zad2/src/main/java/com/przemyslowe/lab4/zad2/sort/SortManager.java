package com.przemyslowe.lab4.zad2.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortManager {
    private final SortAlgorithm sortAlgorithm;

    public SortManager(@Qualifier("bubbleSort") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void performSort(int[] array) {
        sortAlgorithm.sort(array);
    }
}
