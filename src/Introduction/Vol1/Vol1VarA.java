package Introduction.Vol1;

import java.util.Scanner;

public class Vol1VarA {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //1. Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void task1() {
        String name = "";
        //1
        System.out.print("Your name:");
        try {
            name = scanner.next();
        } catch (Exception exception) {
            System.out.println("Ошибка ввода");
        }
        printHelloName(name);

        System.out.println("/////////////");
    }

    public static void printHelloName(String name){
        System.out.println("Hello," + name);
    }


    // 2. Отобразить массив строк в обратном порядке.
    public static void task2() {

        String[] stringsToTurning = {"first", "second"};
        System.out.println("Array of strings:");
        for (String str:stringsToTurning
             ) {
            System.out.println(str);

        }
        System.out.println();

        System.out.println("Reversed :");
        for (int i = stringsToTurning.length - 1; i >= 0; i--) {
            System.out.println(stringsToTurning[i]);
        }

        System.out.println("/////////////");
    }

    //3. Вывести заданное количество случайных чисел с переходом и без перехода
    //        на новую строку.
    public static void task3() {
        final int amountRndNumbers = 10;
        final int maxRandomValue = 10;
        final boolean onlyPositive = true;

        int[] numbers = getRandomIntArray(amountRndNumbers, maxRandomValue, onlyPositive);

        System.out.println("Вывод без перехода на новую строку:");
        System.out.println(arrayIntToString(numbers));


        System.out.println("Вывод c переходом на новую строку:");
        printArrayNumbers(numbers);
        System.out.println("/////////////");
    }

    public static String arrayIntToString(int[] numbers){
        StringBuilder str = new StringBuilder();

        for (Integer num: numbers
             ) {
            str.append(num.toString()).append(" "); //или можно использовать метод из Arrays, вместо всего этого метода
        }
        return str.toString();
    }

    public static int[] getRandomIntArray(int length, int maxRandomValue, boolean onlyPositive){

        int[] array = new int[length];
        int varForNegativeNumbers;
        if (onlyPositive)  varForNegativeNumbers = 0;
            else varForNegativeNumbers = length/2;
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * maxRandomValue) - varForNegativeNumbers;
        }

        return array;
    }

    public static void printArrayNumbers(int[] numbers){ //можно переделать в дженерик, надо тогда надо менять работу с массивом
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
    public static void task4() {
        System.out.println("Введите - АБВГД");
        String str = scanner.next();
        final String strExample = "АБВГД";
        if (str.equals(strExample))
            System.out.println("Введенная строка совпадает со строкой образцом АБВГД");
        else
            System.out.println("Введенная строка НЕ совпадает со строкой образцом АБВГД");
    }


    //5. Ввести целые числа
    // подсчитать их суммы (произведения) и вывести результат на консоль.
    public static void task5() {
        try {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            System.out.println("Сумма этих чисел: " + number1 + number2);
        } catch (Exception exception) {
            System.out.println(exception.fillInStackTrace().toString());
            System.out.println("Ошибка ввода данных");
        }
    }


}
