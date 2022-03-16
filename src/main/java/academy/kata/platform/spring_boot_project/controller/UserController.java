package academy.kata.platform.spring_boot_project.controller;

import academy.kata.platform.spring_boot_project.model.User;
import academy.kata.platform.spring_boot_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String userController() {
        return "index";
    }

    @GetMapping("/users")
    public String allUsers(ModelMap model) {

        List<User> users = userService.getAllUsers();
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", users);

        return "users";

    }

    @PostMapping("/users")
    public String saveNewUser(@ModelAttribute("user") User user) {
        userService.saveOrUpdate(user);
        return "redirect:/users";
    }

    @DeleteMapping("/users/{id}")
    public String removeUser(@PathVariable("id") int id) {
        userService.removeUserById(id);
        return "redirect:/users";
    }

    @PatchMapping("/users/{id}")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.saveOrUpdate(user);
        return "redirect:/users";
    }

}
