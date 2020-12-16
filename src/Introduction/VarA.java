package Introduction;

/*Задания к главе 1
        Вариант A
        */

import java.sql.Time;
import java.util.Scanner;

public class VarA {
    private static String name = "";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        first();
        second(args);
        third();
        fourth();
        fifth();
        sixth();
    }

    //1. Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void first(){
        //1
        System.out.print("Your name:");
        try {
            name = scanner.next();
        }
        catch (Exception exception){
            System.out.println("Ошибка ввода");
        }
        System.out.println("Hello," + name);

        System.out.println("/////////////");
    }

    public static String[] reverse(String[] string){
        String tmp = "";
        for (int i = 0; i < string.length/2; i++) {
            tmp = string[i];
            string[i] = string[string.length - i - 1];
            string[string.length - i - 1] = string[i];
        }
        return string;
    }

    // 2. Отобразить в окне консоли аргументы командной строки в обратном
    //порядке.
    public static void second(String[] args){
        for (String arg : args) {
            System.out.println(arg);
        }
        reverse(args);

        //2.1 Просто решение задачи с преобразованием в обратный массив
        String[] stringsToTurning = new String[10];
        stringsToTurning[0] = "";
        for (int i = 0; i < stringsToTurning.length; i++){
            stringsToTurning[i] = Integer.toString(i);
            System.out.println(stringsToTurning[i]);
        }
        System.out.println("Reversed:");
        reverse(stringsToTurning);
        for(String str:stringsToTurning){
            System.out.println(str);
        }

        System.out.println("/////////////");
    }

    //3. Вывести заданное количество случайных чисел с переходом и без перехода
    //        на новую строку.
    public static void third(){
        int amount = 0;
        System.out.print("Введите количество случайных чисел: ");
        try{
            amount = scanner.nextInt();
        }
        catch (Exception exception){
            System.out.println(exception.fillInStackTrace().toString());
            System.out.println("Введенные данные некорректны");
        }

        StringBuilder resultInOneLine = new StringBuilder();
        int[] numbers = new int[amount];
        for (int i=0; i<amount;i++){
            numbers[i] = (int) (Math.random()*10);
            resultInOneLine.append(Integer.toString(numbers[i]));
            System.out.println(numbers[i]);
        }

        System.out.println("Вывод без перехода на новую строку:");

        /*for (int i=0; i<amount;i++){
            System.out.print(numbers[i]);
        }*/
        System.out.println(resultInOneLine);//такая реализации менее затратная
        System.out.println("\n/////////////");
    }

    //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
    public static void fourth(){
        System.out.println("Введите - АБВГД");
        String str = scanner.next();
        String strExample = "АБВГД";
        if (str.equals(strExample))
            System.out.println("Введенная строка совпадает со строкой образцом АБВГД");
        else
            System.out.println("Введенная строка НЕ совпадает со строкой образцом АБВГД");

    }

     //5. Ввести целые числа как аргументы командной строки,
     // подсчитать их суммы (произведения) и вывести результат на консоль.
    public static void fifth(){
        try {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите второго число: ");
            int number2 = scanner.nextInt();
            System.out.println("Сумма этих чисел: " + Integer.toString(number1 + number2));
        }
        catch (Exception exception){
            System.out.println(exception.fillInStackTrace().toString());
            System.out.println("Ошибка ввода данных");
        }

    }
    //6. Вывести фамилию разработчика, дату и время получения задания, а также
    //дату и время сдачи задания.
    public static void sixth(){
        System.out.println("Ткач Евгений Михайлович");
        System.out.println("Начал 13/12/20 н.э, доделал 16/12/20 н.э. 2 подхода по 20-30 минут");
    }
}
