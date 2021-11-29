package com.varun.core.util;

import com.varun.core.util.CredentialService;

public class Employee {
    String firstName, lastName, departmentName;

    public Employee(String firstName, String lastName, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        CredentialService cs = new CredentialService();
        String email = cs.generateEmailAddress(firstName, lastName, departmentName);
        String passwordFinal = cs.generatePassword();
        System.out.println("Hi " + firstName + " " + lastName);
        System.out.println("Your mail id is " + email);
        System.out.println("Your password  is " + passwordFinal);


    }
}
