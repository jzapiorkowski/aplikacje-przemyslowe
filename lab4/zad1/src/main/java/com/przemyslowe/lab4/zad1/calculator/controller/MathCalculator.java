package com.przemyslowe.lab4.zad1.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.przemyslowe.lab4.zad1.calculator.service.MathApplication;

@RestController
public class MathCalculator {
    private final MathApplication mathApplication;

    public MathCalculator(MathApplication mathApplication) {
        this.mathApplication = mathApplication;
    }

    @GetMapping("/add")
    public int addNumbers() {
        return mathApplication.add(10, 5);
    }

    @GetMapping("/subtract")
    public int subtractNumbers() {
        return mathApplication.subtract(10, 5);
    }
}
