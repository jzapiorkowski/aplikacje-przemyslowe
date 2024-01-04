package com.tje.users;

import java.util.Date;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Data
public class User {
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 20, message = "Name should be between 3 and 20 characters")
    private String name;

    @NotNull(message = "Age cannot be null")
    @Min(value = 18, message = "Age should be greater than 18")
    private int age;

    @NotNull(message = "User type cannot be null")
    private UserType userType;

    @NotNull(message = "Registration date cannot be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    public static enum UserType {
        GUEST, REGISTERED, ADMIN
    }
}
