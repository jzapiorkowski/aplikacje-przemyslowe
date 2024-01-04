package com.example.validForm;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PostalCodeValidator.class)
public @interface PostalCode {
 
    String message() default "Postal code in wrong format (xx-xxx)";
 
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
 
}