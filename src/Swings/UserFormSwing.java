/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

/**
 *
 * @author Jaction76
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserFormSwing {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    public static void main(String[] args) {
        String email = "asm@yopmail.com";
        Matcher m = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if(m.find()){
            System.out.println("valid email");
        }else{
            System.out.println("Invalid email");
        }
    }
}