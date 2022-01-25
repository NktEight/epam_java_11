package by.epam.learn.issues.first;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberOut {
    public static String randomNumberOut(int mount) {
        int[] args = new int[mount];
        Random random = new Random();
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < mount; i++) {

            result.append(random.nextInt() + "\n");
        }
        return result.toString();
    }

    public static int sumOfNumbers(int[] numbers) {
        int result = 0;
        for (int i : numbers) {
            result += i;
        }
        return result;
    }

    public static int productOfNumbers(int[] numbers) {
        int result = 1;
        for (int i : numbers) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++){
            try{
                numbers[i] = Integer.parseInt(args[i]);

            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
                System.out.println("Summ: " + sumOfNumbers(numbers) + "\n" +
                "Prdouct Of Numbers" + productOfNumbers(numbers));
    }

}
