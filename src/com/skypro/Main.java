package com.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] dailyExpensesPerMonth = generateRandomArray();

        //Task 1

        System.out.println("Task 1");
        int sumOfAllExpensesPerMonth = 0;
        for (int dailyExpense:
                dailyExpensesPerMonth) {
            sumOfAllExpensesPerMonth += dailyExpense;
        }
        System.out.println("The total sum per month is " + sumOfAllExpensesPerMonth);
        System.out.println("---------------------------");


        //Task 2
        //using Arrays.sort();
        System.out.println("Task 2 with Arrays.sort()");
        Arrays.sort(dailyExpensesPerMonth);
        System.out.println("The minimum expense is " + dailyExpensesPerMonth[0]);
        System.out.println("The maximum expense is " + dailyExpensesPerMonth[dailyExpensesPerMonth.length - 1]);


        //Task 2
        //using loops
        System.out.println("Task 2 using loops");
        int minValue = dailyExpensesPerMonth[0];
        for (int i = 0; i < dailyExpensesPerMonth.length; i++) {
            if (dailyExpensesPerMonth[i] < minValue) {
                minValue = dailyExpensesPerMonth[i];
            }
        }
        System.out.println("The minimum expense is " + minValue);

        int maxValue = dailyExpensesPerMonth[0];
        for (int i = 0; i < dailyExpensesPerMonth.length; i++) {
            if (dailyExpensesPerMonth[i] > maxValue) {
                maxValue = dailyExpensesPerMonth[i];
            }
        }
        System.out.println("The maximum expense is " + maxValue);
        System.out.println("---------------------------");


        //Task 3
        System.out.println("Task 3");
        double mediumExpenseFroTheWholeMonth = (double)sumOfAllExpensesPerMonth / dailyExpensesPerMonth.length;
        System.out.printf("The medium expense for the whole month is %.2f", mediumExpenseFroTheWholeMonth);
        System.out.println();
        System.out.println("---------------------------");

        //Task 4
        //using visual representation with sout
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        //Task 4
        //using loop
        char temp;
        char[] reverseFullName2 = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName2.length/2; i++) {
            temp = reverseFullName2[i];
            reverseFullName2[i] = reverseFullName2[reverseFullName2.length - 1 - i];
            reverseFullName2[reverseFullName2.length - 1 - i] = temp;
        }
        for (char charValue:
             reverseFullName2) {
            System.out.print(charValue);
        }
        System.out.println();
        System.out.println("---------------------------");

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
