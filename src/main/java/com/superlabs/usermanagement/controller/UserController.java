package com.superlabs.usermanagement.controller;

import com.superlabs.usermanagement.model.User;
import com.superlabs.usermanagement.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Show the registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    // Handle form submission
    @PostMapping("/register")
    public String processRegistration(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        userRepository.save(user);
        return "redirect:/profile";
    }

    // Display the latest user profile
    @GetMapping("/profile")
    public String showProfile(Model model) {
        User latestUser = userRepository.findTopByOrderByIdDesc();
        model.addAttribute("user", latestUser);
        return "profile";
    }

    // Show login form
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    // Handle login form submission
    @PostMapping("/login")
    public String processLogin(@ModelAttribute("user") User user, Model model) {
        User foundUser = userRepository.findByEmail(user.getEmail());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            return "redirect:/profile";
        } else {
            model.addAttribute("loginError", "Invalid email or password");
            return "login";
        }
    }
}
