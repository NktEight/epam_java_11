package by.epam.learn.main;

public class ComparisonString {
    public static void main(String[ ] args) {
        String str1, str2;
        str1 = "Java";
        str2 = str1; // variable refers to the same string
        System.out.println("comparison of references " + (str1 == str2)); // true
        str2 = new String("Java"); // is equivalent to str2 = new String(str1);
        System.out.println("comparison of references "+ (str1 == str2)); // false
        System.out.println("comparison of values " + str1.equals(str2)); // true
    }
}
