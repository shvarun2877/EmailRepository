package com.varun.core.util;

import java.util.Locale;
import java.util.Random;

public class CredentialService {

    public static String generateEmailAddress(String firstName,String lastName,String department){
        String mailId=firstName.toLowerCase(Locale.ROOT)+lastName.toLowerCase(Locale.ROOT)+"@"+department.toLowerCase(Locale.ROOT)+".company.com";
        return mailId;
    }
    public static String generatePassword(){
       String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase="abcdefghijklmnopqrstuvwxyz";
        String number="0123456789";
        String specialCharacters="!@#$%^()_-+={}[]|";
        String password =upperCase+lowerCase+number+specialCharacters;
        Random random=new Random();

        char[] pwd=new char[8];
     for (int i=0;i<8;i++)
     {
         pwd[i]= password.charAt(random.nextInt(password.length()));
     }

    return String.valueOf(pwd);
    }
}
