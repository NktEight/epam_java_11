package by.epam.learn.arg;

public class PrintArgumentMain {
    public static void main(String[] args) {
        for( String str: args){
            System.out.printf("argument--> %s%n", str);
        }
    }
}
