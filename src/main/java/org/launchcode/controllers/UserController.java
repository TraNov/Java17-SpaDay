package org.launchcode.controllers;
import org.launchcode.models.User;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.Errors;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("/add")
    public String displayAddUserForm() {
        return "user/add";
    }
    @PostMapping
    @Valid
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors errors, String verify) {
        if (errors.hasErrors()) {
            return "user/add";
        }
        return "user/index";
    }

}
