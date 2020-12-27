package Introduction.Vol2;

public class NumberWithLength {
    private int number;
    private int length;

    public NumberWithLength(int number) {
        this.number = number;
        this.length = lengthNumbers(number);
    }

    public int getNumber() {
        return number;
    }


    public int getLength() {
        return length;
    }

    public void setNumber(int number) {
        this.number = number;
        this.length = lengthNumbers(number);
    }

    @Override
    public String toString() {
        return number +
                "{" + length +
                "} ";
    }

    public static int lengthNumbers(int number) {
        return Integer.toString(number).length();

    }

    public static void sortArrayByLength(NumberWithLength[] numberWithLengths) {
        NumberWithLength tmp;
        for (int j = 0; j < numberWithLengths.length; j++) {
            for (int i = 0; i < numberWithLengths.length - 1; i++) {
                if (numberWithLengths[i].getLength() > numberWithLengths[i + 1].getLength()) {
                    tmp = numberWithLengths[i];
                    numberWithLengths[i] = numberWithLengths[i + 1];
                    numberWithLengths[i + 1] = tmp;
                }

            }

        }
    }

    public static int amountDifferentDigits(int a) {
        int[] digits = new int[10];

        while (a > 0) {
            digits[Math.abs(a % 10)] += 1;
            a /= 10;
        }

        int amount = 0;
        for (int iterator :
                digits) {
            if (iterator > 0) {
                amount++;
            }
        }
        return amount;
    }

    /*5. Найти количество чисел, содержащих только четные цифры, а среди них —
количество чисел с равным числом четных и нечетных цифр.*/
    //среди кого них то???
    private static void task5(){}

    




}
