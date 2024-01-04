package com.tje.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class UsersController {

    @GetMapping("/")
    public String home(Model model) throws ParseException {
        String startDateString = "20/05/2007 07:32";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Date startDate = df.parse(startDateString);

        long daysDifference = TimeUnit.DAYS.convert(new Date().getTime() - startDate.getTime(), TimeUnit.MILLISECONDS);


        User user = new User(2, "Artur", 34, User.UserType.ADMIN, startDate);
        model.addAttribute("user", user);
        model.addAttribute("daysFromRegister", daysDifference);
        return "home";
    }

    @GetMapping("/list")
    public String list(Model model) {
        Date startDate1 = new Date();
        Date startDate2 = new Date(System.currentTimeMillis() - 86400000);
        Date startDate3 = new Date(System.currentTimeMillis() - 172800000);
        Date startDate4 = new Date(System.currentTimeMillis() - 259200000);
        Date startDate5 = new Date(System.currentTimeMillis() - 345600000);
        Date startDate6 = new Date(System.currentTimeMillis() - 432000000);
        Date startDate7 = new Date(System.currentTimeMillis() - 518400000); 

        User user1 = new User(1, "John", 25, User.UserType.GUEST, startDate1);
        User user2 = new User(2, "Artur", 34, User.UserType.ADMIN, startDate2);
        User user3 = new User(3, "Alice", 28, User.UserType.GUEST, startDate3);
        User user4 = new User(4, "Bob", 45, User.UserType.REGISTERED, startDate4);
        User user5 = new User(5, "Eva", 31, User.UserType.GUEST, startDate5);
        User user6 = new User(6, "Charlie", 40, User.UserType.REGISTERED, startDate6);
        User user7 = new User(7, "Grace", 22, User.UserType.REGISTERED, startDate7);


        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);

        model.addAttribute("userList", userList);
        return "list";
    }
}
