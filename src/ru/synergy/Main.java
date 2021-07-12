package ru.synergy;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initialization of variables
        /*
        {
            System.out.println("Введи мне два числа и я посчитаю тебе их сумму");
            System.out.println("______________________________________________");

            double a = 0, b = 0;
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);

            System.out.print("Введите сюда первое число: ");
            a = in.nextDouble();

            System.out.print("Введите сюда второе число: ");
            b = in.nextDouble();

            System.out.println("Сумма ваших чисел равна: " + (a + b));
        }
        */

        // types
        /*
        {
            //  int g =  ( (a + b) / c );

            // a + ( b + c ) ;

            long x = 1000000;

            // int размер 32 бита, int должен быть не более 2^31
            //  long размер 64 бита

            System.out.println((int) (x * x));
            System.out.println(x);
        }*/

        //operations
       /* {
        System.out.println((5) / 3); // можем разделить 1 раз
        System.out.println((double) (5)); // это double поэтому 5.0
        System.out.println((double) (5) / 3); // можем разделить 1.(6) раз

        Scanner in = new Scanner(System.in);
        double value = in.nextDouble();
        if (value % 2 == 0) { // (12.2)/2
            System.out.println("Вы ввели четное число");
        } else System.out.println("Вы ввели нечетное число");

        System.out.println(12.2 % 2);
    }*/

        /*{
        int minutes = 10;
        System.out.println(minutes++);// увеличивает на 1

        System.out.println(minutes);
        minutes -= 1;

        System.out.println(minutes);
    }*/

        // char explanation
        /*{
            // [ 10101010100101001 ] 31
            char a = 8667;
            char b = '\u21DB';
            char c = '⇛';

            System.out.println(a);
            System.out.println(b);
            System.out.println((int) c);
        }*/

/*        // ||  , &&
        {
            Scanner in = new Scanner(System.in);

*//*            if( in.nextInt() > 10){ // == , >, <, >= , <= , != , &&, ||, ! ;true false
                System.out.println( "условие сгенерировало true"); // true != 0  boolean
            } else {
                System.out.println("условие сгенерировало false");
            }*//*

            int x = in.nextInt();
            boolean a = !(x < 5 || x > 5 && x < 7); //  все числа меньше 5 не включая // и 6
            System.out.println(a);

        }*/

        //boolean
/*
        {
             boolean a = true;
            boolean b = false;

            int x = 5;
            boolean b1 = x > 0;
            boolean b2 = b1 && (x <=20);
        }
*/

        // Ternarn operation
        /*        {
         *//*
         *  <условие>? <значение если условие истино> : <значение если условие ложно>
         * *//*
            int a = -10;
            int b = 20;
            int max =  a>b ? a : b;
            System.out.println(max);

            System.out.println( a > 0 ? a * a : "Wrong");
        }*/

/*        //Shablon reshenia
        {
            Scanner in  = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(<условие> ? "YES": "NO");
        }*/

/*        //112165
        {
            Scanner in  = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println( x<2 && y < x && x*x + y*y > 4  && y > 0 ? "YES": "NO");
        }*/

/*        //112167
        {
            Scanner in  = new Scanner(System.in);
            in.useLocale(Locale.US);
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.println(  ( y < 2 - x *x && y > x && x < 0 ) || ( y < 2 - x*x && y > 0 && x >= 0) ? "YES": "NO");
        }*/

/*
        // if else
        {
            int max = 0;
            int a = 10, b = 5;
            if(a > b){
                max = a;
            } else {
                max = b;
            }

            */
        /*
         * if(price < 100)
         * if(x != 0)
         * if(x>0  && x<1)
         * if(country.equals("Russia") && city.equals("Ufa"))
         * if(country.equals("Sweden") || country.equals("India") ||  country.equals("Russia"))
         * if( country == "Sweden")
         * *//*


         */
/*
            if(){}
            else if (){}
            else if (){}
            else if (){}
            else { }
*//*


            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            if(x1> 9 && x1<100){
                x2 = x1 %10; // 32
                x1 = x1/10;
                System.out.println(x1 + ";" + x2);
                if( x1 == x2){
                    System.out.println("В числе одинаковые цифры");
                } else if(x2 < x1){
                    System.out.println("Первая цифра больше второй");
                } else System.out.println("Вторая цифра больше");
            } else System.out.println("Введено не двухзначное число");

        }
*/

        // switch  case
        /*       {
         *//*
         * switch( a ){
         * case значение1 : команды 1;
         * break;
         * case значение2 : команды 2
         * break;
         * case значение3 : команды 3
         * break;
         * case значение4 : команды 4
         * break;
         * }
         *
         * *//*

            Scanner in = new Scanner(System.in);
            switch (in.nextInt()){
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.print("31");
                    break;
                case 4:
                    System.out.print("30");
                    break;
                case 5:
                    System.out.print("31");
                    break;
                case 6:
                    System.out.print("30");
                    break;
                case 7:
                    System.out.print("31");
                    break;
                case 8:
                    System.out.print("31");
                    break;
                case 9:
                    System.out.print("30");
                    break;
                case 10:
                    System.out.print("31");
                    break;
                case 11:
                    System.out.print("30");
                    break;
                case 12:
                    System.out.print("31");
                    break;
                default:
                    System.out.print("0");
                    break;

            }

        }*/

        // blocks
/*        {
            *//*{
                int inf = 10;
                int price = 4;
                if (inf > 0) {
                    price += inf * price / 100;
                    System.out.println(price);
                }
                System.out.println(price);
            }
*//*
            {
                Scanner in = new Scanner(System.in);
                int x1, x2;
                x1 = in.nextInt();
                x2 = x1 %10;
                x1 = x1/10;
                if(x2 == 3 || x1 == 3){
                    System.out.println("В числе присутствует цифра 3");
                }
                else {
                    System.out.println("В числе отсутствует цифра 3");
                }

            }
        }*/

        //while
        {
            /*
            * while(<условие>){
            * Действия к выполнению;
            * }
            * */

            int  x = 0;
            /*while (x<5){
                System.out.print( x + " ");
                x++;
            }*/

/*            do {
                System.out.print( x + " ");
                x++;
            } while (x < 0);
            System.out.println(x);*/

            // Bus height 437 cm
            // 1 754 || No Crash
            // 2 300 800 || Crash 1

            Scanner in = new Scanner(System.in);
            int t = 0;
            int i = 1;
            int N = in.nextInt();
            while (i< N){
                t = in.nextInt();
                if(t < 437){
                    System.out.println("Crash" + i);
                    break;
                }
                i++;
            }
            if(t>437){
                System.out.println("No crash");
            }
        }

    }
}
