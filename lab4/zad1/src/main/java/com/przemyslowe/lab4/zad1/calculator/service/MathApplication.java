package com.przemyslowe.lab4.zad1.calculator.service;

import org.springframework.stereotype.Service;

import com.przemyslowe.lab4.zad1.calculator.domain.Calculator;

@Service
public class MathApplication {
    private final Calculator calculator;

    public MathApplication(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int a, int b) {
        return calculator.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculator.subtract(a, b);
    }
}
