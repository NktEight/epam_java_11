package by.epam.learn.issues.first;

import java.util.*;
import java.util.stream.Collectors;

public class MathOperations {
    public static void evenAndOddNumbers(List<Integer> integerList) {
        List<Integer> oddIntegers = new ArrayList<>();
        List<Integer> evenIntegers = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 1) {
                oddIntegers.add(integerList.get(i));
            } else {
                evenIntegers.add(integerList.get(i));
            }
        }
        System.out.println("Odds" + oddIntegers + "\n" + "Even: " + evenIntegers);
    }

    public static void minAndMaxNumber(List<Integer> integerList) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : integerList) {
            if (max <= i) {
                max = i;
            }
            if (min >= i) {
                min = i;
            }
        }
        System.out.println("Max :" + max + "  " + "Min :" + min);
    }

    public static void modThreeNumbers(List<Integer> integerList) {
        List<Integer> modThreeNumbers = new ArrayList<>();
        for (int i : integerList) {
            if (i % 3 == 0) {
                modThreeNumbers.add(i);
            }
        }
        System.out.println("Mod three numbers :" + modThreeNumbers);
    }

    public static void modFiveOrSevenNumbers(List<Integer> integerList) {
        List<Integer> modFiveOrSevenNumbers = new ArrayList<>();
        for (int i : integerList) {
            if (i % 5 == 0 || i % 7 == 0) {
                modFiveOrSevenNumbers.add(i);
            }
        }
        System.out.println("Mod five or seven numbers :" + modFiveOrSevenNumbers);
    }

    public static void getNoDublicates(List<Integer> integerList) {
        List<Integer> noDublicates = new ArrayList<>();
        for (Integer i : integerList) {
            if ((-1000 > i || i < 1000) && !isDublicates(i.toString().split(""))) {
                noDublicates.add(i);
            }
        }
        System.out.println("No dublicates :" + noDublicates);
    }

    public static boolean isDublicatesList(List<String> number) {
        if (number.size() > 1) {
            String firstValue = number.remove(0);
            for (String i : number) {
                if (Objects.equals(i, firstValue)) {
                    return false;
                }
            }
            return isDublicatesList(number);
        }
        return true;
    }

    public static boolean isDublicates(String[] number) {
        for (int i = 0; i < number.length; i++) {
            String first = number[i];
            for (int j = i + 1; j < number.length; j++) {
                if (first.equals(number[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void getPrimeNumbers(List<Integer> integerList) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (Integer i : integerList) {
            boolean isPrime = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Prime numbers :" + primeNumbers);
    }

    public static List<Integer> sortAscending(List<Integer> integerList) {
        boolean sorted = false;
        for (int i = 0; i < integerList.size() - 1; i++) {
            sorted = true;
            for (int j = 0; j < integerList.size() - 1; j++) {
                int firstValue = integerList.get(j);
                if (integerList.get(j) > integerList.get(j + 1)) {
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, firstValue);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        System.out.println(integerList);
        return integerList;
    }

    public static List<Integer> sortRediction(List<Integer> integerList) {
        boolean sorted = false;
        for (int i = 0; i < integerList.size() - 1; i++) {
            sorted = true;
            for (int j = 0; j < integerList.size() - 1; j++) {
                int firstValue = integerList.get(j);
                if (integerList.get(j) < integerList.get(j + 1)) {
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, firstValue);
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        System.out.println(integerList);
        return integerList;
    }

    public static int[] sortAscending(int[] testArray) {
        boolean sorted = false;
        for (int i = 0; i < testArray.length - 1; i++) {
            sorted = true;
            for (int j = 0; j < testArray.length - 1; j++) {
                int firstValue = testArray[j];
                if (testArray[j] > testArray[j + 1]) {
                    testArray[j] = testArray[j + 1];
                    testArray[j + 1] = firstValue;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        System.out.println(testArray);
        return testArray;
    }

    public static HashMap<Integer, Integer> numberFrequency(List<Integer> integerList) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (Integer i : integerList) {
            Integer value = frequency.get(i);
            if (value == null) {
                frequency.put(i, 1);
            } else {
                frequency.put(i, value + 1);
            }
        }
        System.out.println(frequency);
        return frequency;
    }

    public static void luckyNumbers(List<Integer> integerList) {
        HashMap<Integer, Integer> numberFrequencyMap = numberFrequency(integerList);
        StringBuilder stringBuilder = new StringBuilder("Lucky numbers[ ");
        for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue())) {
                System.out.println(entry.getKey() + " key-value :" + entry.getValue());
                stringBuilder.append("Value :" + entry.getKey() + " Key :" + entry.getValue() + ", ");
            }
        }
        System.out.println(stringBuilder + " ]");

    }

    public static void getPalindromes(List<Integer> integerList) {
        List<Integer> palindromes = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (isPalindrome(integerList.get(i))) {
                palindromes.add(integerList.get(i));
            }
        }
        System.out.println("Palindromes: " + palindromes.toString());
    }

    public static String wordFlip(String word) {
        StringBuilder stringBuilder = new StringBuilder("");
        String[] wordFlip = new String[word.length()];
        String[] wordArray = word.split("");
        for (int i = 0; i < wordArray.length; i++) {
            stringBuilder.append(wordArray[wordArray.length - 1 - i]);
        }
        return stringBuilder.toString();
    }

    public static boolean isPalindrome(Integer integer) {
        return wordFlip(integer.toString()).equals(integer.toString()) && integer > 10;
    }

    public static void getHalfSums(List<Integer> integerList) {
        List<Integer> halfSums = new ArrayList<>();
        for (int i = 1; i < integerList.size() - 1; i++) {
            if (integerList.get(i) == (integerList.get(i + 1) + integerList.get(i - 1)) / 2){
                halfSums.add(integerList.get(i));
            }
        }
        System.out.println("Half sums : " + halfSums);
    }

    public static void main(String[] args) {
        byte b = 42;
        b  += 1000;
        System.out.println(b);
        System.out.println((Byte) b instanceof Byte);
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            integerList.add(scanner.nextInt());
        }

//        System.out.println(integerList);
//        1 24 11 413 49 599 1230 40 89 1 2 3 2 1 d
//        0 3 1 8 7 2 5 4 6 9 d
//        sortAscending(integerList);
        getHalfSums(integerList);
        getPalindromes(integerList);
        luckyNumbers(integerList);
        minAndMaxNumber(integerList);
        evenAndOddNumbers(integerList);
        modThreeNumbers(integerList);
        modFiveOrSevenNumbers(integerList);
        getPrimeNumbers(integerList);
        getNoDublicates(integerList);
        sortAscending(integerList);
        sortRediction(integerList);
        numberFrequency(integerList);
    }
}
