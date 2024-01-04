package com.tje.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

@Controller
public class UsersController {
    private List<User> userList = new ArrayList<>();

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("userList", this.userList);
        return "list";
    }
    
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }


    @PostMapping("/create")
    public String createUser(@Valid User user, Errors errors) {
        if(errors.hasErrors()){
            return "form";
        }

        this.userList.add(user);

        return "redirect:/list";
    }
}
