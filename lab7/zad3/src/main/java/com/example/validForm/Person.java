package com.example.validForm;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Person {
    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should be start at least two characters")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;

    @NotNull(message = "postal code is required")
    @PostalCode
    private String postalCode;

    @NotNull(message = "Salary is required")
    @Salary
    private int salary;

    @NotNull(message = "You must accept the rules")
    @AssertTrue(message = "You must accept the rules")
    private boolean acceptsRules;
}
