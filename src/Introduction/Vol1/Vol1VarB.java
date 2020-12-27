package Introduction.Vol1;

import java.util.LinkedList;
import java.util.Scanner;

public class Vol1VarB {
    static int[] numbers;

    public static void main(String[] args) {
        generateNumbers(15);
        first();
        second();
        //third();
        thirdVar2();
        fourth();
        fifth();
        System.out.println("Task6:");
        LinkedList linkedList = task6(numbers);
        for (Object lnk : linkedList) {
            System.out.println(lnk);
        }
        System.out.println("NOD = " + NOD(9, 27));
        System.out.println("NOK = " + NOK(10, 4));
        System.out.println(isSimple(10));
        System.out.println(isSimple(7));
        task9();
        fFibonachi(15);
        palindroms(50);

        task14();
        buildPascalTriangleForFirstPositiveNumber(1);

    }

    public static void generateNumbers(int amountNumbers) {

        numbers = new int[amountNumbers + 2];
        System.out.println("Все числа: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 50 - 25);
            System.out.println(numbers[i]);
        }
        numbers[amountNumbers] = 100;//для проверки 6 задания 2 трехзначных числа
        numbers[amountNumbers] = 111;

    }

    //Четные и нечетные числа.
    public static void first() {
        int[] even = new int[numbers.length]; //можно переделать в список
        int[] uneven = new int[numbers.length];
        int amountEven = 0;
        int amountUneven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[amountEven] = numbers[i];
                amountEven++;
            } else {
                uneven[amountUneven] = numbers[i];
                amountUneven++;
            }
        }


        //можно тут вывести, а можно сделать новый массив неизбыточного размера, что я и делаю
        int[] evenFinally = new int[amountEven];
        System.out.println("Четные: ");
        for (int i = 0; i < amountEven; i++) {
            evenFinally[i] = even[i];
            System.out.println(evenFinally[i]);
        }

        int[] unevenFinally = new int[amountUneven];
        System.out.println("Нечетные: ");
        for (int i = 0; i < amountUneven; i++) {
            unevenFinally[i] = uneven[i];
            System.out.println(unevenFinally[i]);
        }
    }

    //Наибольшее и наименьшее число
    public static void second() {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    //Числа, которые делятся на 3 или на 9.
    public static void third() {
        System.out.println("Делится на 3 или 9: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 9 == 0)
                System.out.println(numbers[i]);
            else if (numbers[i] % 3 == 0)
                System.out.println(numbers[i]);
        }
    }

    //Признак делимости на 3: число делится на 3, если сумма всех цифр этого числа делится на 3.
    //Признак делимости на 9: число делится на 9, если сумма всех цифр этого числа делится на 9.
    public static void thirdVar2() {//ДОБАВИТЬ РАБОТУ С ОТРИЦАТЕЛЬНЫМИ ЧИСЛАМИ//сделано
        String toString;

        int sum = 0;
        StringBuilder charN = new StringBuilder();
        System.out.println("Делится на 3 или 9: ");

        for (int i = 0; i < numbers.length; i++) {
            toString = Integer.toString(numbers[i]);
            sum = 0;
            int start = 0; // 0 ==positive; 1 == negative
            if (numbers[i] > 0)
                start = 0;
            else
                start = 1;

            for (int j = start; j <= toString.length() - 1; j++) {

                charN.append(toString.charAt(j));
                sum = sum + Integer.parseInt(charN.toString());
                charN = new StringBuilder();


            }
            //System.out.println("Sum = " + sum);
            if (sum % 9 == 0)
                System.out.println(numbers[i]);
            else if (sum % 3 == 0)
                System.out.println(numbers[i]);
        }
    }

    public static void fourth() {
        int amountDivided = 0;
        System.out.println("Делится на 5 И 7: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0 && numbers[i] % 7 == 0) {
                System.out.println(numbers[i]);
                amountDivided++;
            }
        }
        if (amountDivided == 0) System.out.println("Нет таких делимых");
    }

    public static void fifth() {

        System.out.println("Сортировка по модулю");
        int tmp = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (Math.abs(numbers[j]) < Math.abs(numbers[j + 1])) {
                    tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static boolean haveEqualDigit(int num) {
        int mainNumber = num;
        boolean[] wasDigit = new boolean[10];
        int digit = 0;
        while (mainNumber > 9) {
            digit = mainNumber % 10;
            if (!wasDigit[digit]) wasDigit[digit] = true;
            else return true;
            mainNumber /= 10;
        }
        return false;
    }

    public static LinkedList task6(int[] arr) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            if (haveEqualDigit(arr[i]) && arr[i] > 99)
                linkedList.addLast(arr[i]);
        }
        return linkedList;

    }

    ///наибольше общий делитель числа методом перебора
    public static int NOD(int a, int b) {
        int NOD = 1;
        int smallest;

        if (a > b)
            smallest = b;
        else smallest = a;

        for (int i = 1; i <= smallest; i++) {
            if (a % i == 0 && b % i == 0)
                NOD = i;
        }

        return NOD;

    }

    public static int NOK(int a, int b) {
        return a * b / NOD(a, b);
    }

    public static boolean isSimple(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0)//можно добавить проверку на другие простые числа
                return false;

        }
        return true;
    }

    ///Отсортированные числа в порядке возрастания и убывания.
    public static void task9() {
        int tmp = 0;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");

        }

        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }


    }

    public static void fFibonachi(int n) {
        System.out.println("\nПервые " + n + " чисел ряда Фибоначчи");
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            System.out.print(arr[i] + " ");
        }
    }

    public static void palindroms(int n) {
        String number;
        String reversedNumber;
        System.out.println("Палиндромы:");
        for (int i = 10; i < n; i++) {
            number = Integer.toString(i);
            reversedNumber = reverseString(number);
            if (number.equals(reversedNumber))
                System.out.println(i + " ");

        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //14. Элементы, которые равны полусумме соседних элементоff
    public static void task14() {
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 2, 1, 10};
        for (int i = 1; i < arr.length - 1; i++) {
            if ((double) arr[i] == (arr[i - 1] + arr[i + 1]) / 2.0)
                System.out.println(arr[i]);
        }
    }

    public static void task15(int m, int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 4, 2, 1, 10};
        System.out.println();

    }

    public static void buildPascalTriangleForFirstPositiveNumber(
            int n) {


        System.out.print("Сколько строк треугольника Паскаля для числа "
                + n + " отображать? ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        for (int y = 0; y < rows; y++) {
            int c = n;
            for (int i = 0; i < rows - y; i++) {
                System.out.print("   ");
            }
            for (int x = 0; x <= y; x++) {
                System.out.print("   " + c + " ");
                c = c * (y - x) / (x + 1);
            }
            System.out.println();
        }
    }
}
