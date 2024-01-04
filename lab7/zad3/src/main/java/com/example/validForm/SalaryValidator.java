package com.example.validForm;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SalaryValidator implements ConstraintValidator<Salary, Integer> {
    public void initialize(Salary constraint) {
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value >= 2000 && value <= 3000;
    }
    
}
