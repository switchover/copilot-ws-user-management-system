package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // R1: Internal employee login
    // Endpoint for internal employee login using employee number, name, and department
    @PostMapping("/internal/login")
    public String internalEmployeeLogin(@RequestParam String employeeNumber, @RequestParam String name, @RequestParam String department) {
        return userService.internalEmployeeLogin(employeeNumber, name, department);
    }

    // R2: External employee registration
    // Endpoint for external employee registration using name, date of birth, contact information, and store code
    @PostMapping("/external/register")
    public String externalEmployeeRegister(@RequestParam String name, @RequestParam String dateOfBirth, @RequestParam String contactInfo, @RequestParam String storeCode) {
        return userService.externalEmployeeRegister(name, dateOfBirth, contactInfo, storeCode);
    }

    // R3: User information update
    // Endpoint for updating user information such as name, email, phone number, store code, and password
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // R4: Consent feature for personal information usage
    // Endpoint for implementing consent feature for personal information usage and account management during the first login
    @PostMapping("/{id}/consent")
    public String consentForPersonalInfo(@PathVariable Long id, @RequestParam boolean consent) {
        return userService.consentForPersonalInfo(id, consent);
    }
}
