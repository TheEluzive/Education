package Introduction.Vol2;

import static Introduction.Vol2.NumberWithLength.*;

public class Vol2VarA {
    public static void main(String[] args) {
        int[] numbers = {2, 22, 777, 1234, 94, 15, 8, 19, 843};
        task1(numbers);
        task2(numbers);
        task3(numbers);
        int[] numbers2 = {143, 554, 555, 22, 6734};
        task4(numbers2);
    }

    private static void task1(int[] numbers) {
        System.out.println("Task1:");

        int minLength = lengthNumbers(numbers[0]), maxLength = lengthNumbers(numbers[0]);
        int numberMinLength = numbers[0], numberMaxLength = numbers[0];

        int currentLength;
        for (int number : numbers) {
            currentLength = lengthNumbers(number);
            if (currentLength < minLength) {
                minLength = currentLength;
                numberMinLength = number;
            } else if (currentLength > maxLength) {
                maxLength = currentLength;
                numberMaxLength = number;
            }
        }


        System.out.println("Минимальная длина числа = " + minLength + " у числа = " + numberMinLength);
        System.out.println("Максимальная длина числа = " + maxLength + " у числа = " + numberMaxLength);
    }


    private static void task2(int[] numbers) {
        System.out.println("Task2:");

        NumberWithLength[] numbersWithLengths = new NumberWithLength[numbers.length];
        setArrayNumbersWithLength(numbersWithLengths, numbers);

        printArrayNumbersWithLength(numbersWithLengths);
        sortArrayByLength(numbersWithLengths);
        printArrayNumbersWithLength(numbersWithLengths);

    }

    private static void task3(int[] numbers) {
        System.out.println("Task3:");

        NumberWithLength[] numbersWithLengths = new NumberWithLength[numbers.length];
        setArrayNumbersWithLength(numbersWithLengths, numbers);
        printArrayNumbersWithLength(numbersWithLengths);

        double averageValueLength = 0;
        for (NumberWithLength iterator :
                numbersWithLengths) {
            averageValueLength += iterator.getLength();
        }
        averageValueLength /= numbersWithLengths.length;

        for (NumberWithLength iterator :
                numbersWithLengths) {
            if (iterator.getLength() > averageValueLength)
                System.out.println(iterator);
        }

    }

    private static void setArrayNumbersWithLength(NumberWithLength[] numbersWithLength, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbersWithLength[i] = new NumberWithLength(numbers[i]);
        }
    }

    public static void printArrayNumbersWithLength(NumberWithLength[] numbersWithLength) {
        for (NumberWithLength iterator : numbersWithLength) {
            System.out.print(iterator.toString());
        }
        System.out.println();
    }

    private static void task4(int[] numbers) {
        System.out.println("Task4:");

        int minDigit = amountDifferentDigits(numbers[0]), minDigitNumber = numbers[0];
        int curAmountDigit;
        for (int number : numbers) {
            curAmountDigit = amountDifferentDigits(number);
            if (curAmountDigit < minDigit) {
                minDigit = curAmountDigit;
                minDigitNumber = number;
            }
        }
        System.out.println("Первое число в массиве с минимальным количеством разных цифр = " + minDigitNumber);
    }



}
