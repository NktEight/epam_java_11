package by.epam.learn.issues.first;

import java.util.Scanner;

public class PasswordChecker {
//    String password = "qwerty";
    public static boolean validatePassword(String passwordToCheck){
        return "qwerty".equals(passwordToCheck);
    }
    public static void main(String[] args) {
        System.out.println("Enter your password");
        Scanner scanner = new Scanner(System.in);
        boolean isPasswordCorret = validatePassword(scanner.next());
        System.out.println("Password is " + isPasswordCorret);
    }
}
