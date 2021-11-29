package com.varun.main.util;

import com.varun.core.util.Employee;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Driver  {
    public static String departmentName1="";
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=sc.next();
        System.out.println("Enter Last Name");
        String lastName=sc.next();
        System.out.println("Please Enter department from the following \n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal");
        int option=sc.nextInt();
         switch (option) {
                 case 1:
                     departmentName1="Technical";
                    break;
                 case 2 :
                     departmentName1= "Admin";
                    break;
                 case 3 :
                     departmentName1= "HumanResource";
                    break;
                 case 4 :
                     departmentName1= "Legal";
                    break;
             default: break;

         }

            Employee e=new Employee(firstName,lastName,departmentName1);
    }

}

