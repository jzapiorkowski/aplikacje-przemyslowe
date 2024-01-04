package com.example.validForm;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SalaryValidator.class)
public @interface Salary {
 
    String message() default "Salary must be within 2000 and 3000";
 
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
 
}