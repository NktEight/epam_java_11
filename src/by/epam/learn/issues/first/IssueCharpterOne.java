package by.epam.learn.issues.first;

import java.util.Scanner;

public class IssueCharpterOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello user: " + name);
        for (int i = args.length - 1; i > -1; --i) {
            System.out.println(args[i]);
        }
    }
}
