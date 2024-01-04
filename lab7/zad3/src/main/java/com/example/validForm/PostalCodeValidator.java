package com.example.validForm;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {
   public void initialize(PostalCode constraint) {
   }
 
    @Override
    public boolean isValid(String postalCode, ConstraintValidatorContext constraintValidatorContext) {
        return postalCode.matches("\\d{2}-\\d{3}");
    }
}