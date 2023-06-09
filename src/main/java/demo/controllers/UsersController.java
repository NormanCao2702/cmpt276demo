package demo.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import models.Users;


@Controller
public class UsersController {
    
    // @Autowired
    // private UserRepository userRepo;

    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        // TODO: get all users from database
        List<Users> users = new ArrayList<>();
        users.add(new Users("bobby","1234",25));
        users.add(new Users("sara","1234",15));
        users.add(new Users("steve","1234",35));
        users.add(new Users("jacob","1234",5));
        // end of database call
        model.addAttribute("us", users);
        return "users/showAll.html";
    }

    // @GetMapping(value="/users/add")
    // public String AddUsers(){
    //     Users newuser = new Users("henry", "1234",25);
    //     userRepo.save(newuser);
    //     return "users/added";
    // }

}
