package ru.synergy;

import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args){
//        double num1 = getNumber();
//        double num2 = getNumber();
//        char operation = getOperation();
//        double result = calc(num1, num2, operation);
//        System.out.println("Result " + result);

        int[] a = {10,15,20,75,30};
        writeArray(a);

        String[] strings = {"dwadwa", "dwadagrhgrth", "dkhljikhnf", "231234"};
        writeArray(strings);

        writeArray(strings, 2);
    }


    /*
    * //ПСЕВДОКОД
    * [модификаторы] <тип возвращаемого значение> <название метода>([параметры]){
    * тело метода
    * }
    *
    *
    * */

    private static double calc(double num1, double num2, char operation) {
        switch (operation){
            case '+':
                return num1+num2;
            case '-':
                return  num1 - num2;
            case '*':
                return num1 * num2;
            default: return 0;
        }
    }

    private static char getOperation() {
        Scanner in = new Scanner(System.in); // 1 +, 2 -, 3 *
        switch (in.nextInt()){
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            default: return '+';
        }
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
         return scanner.nextInt();
    }

    public static void writeArray(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            System.out.println("Значение: " +  (arr[i]+1));
        }
    }

    public static void writeArray(String[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            System.out.println("Значение: " +  (arr[i]+1));
        }
    }

    public static void writeArray(String[] arr, int numberOfPrints){
        for(int i = 0; i <= numberOfPrints-1; i++){
            System.out.println("Значение: " +  (arr[i]+1));
        }
    }


}
