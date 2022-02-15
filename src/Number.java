import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();

        System.out.printf("Сумма цифр числа %d: %d%n", n, SumOfNumbers(n));
        System.out.printf("Сумма нечетных цифр числа %d: %d%n", n, SumOfOddNumbers(n));
        System.out.printf("Максимальная цифра числа %d: %d", n, getMaxValue(n));

    }

    public static int SumOfNumbers(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int SumOfOddNumbers(int n) {
        int sumOdd = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                sumOdd = sumOdd + n % 10;
                n = n / 10;
            } else if (n % 2 == 0) {
                n = n / 10;
            }
        }
        return sumOdd;
    }

    public static int getMaxValue(int n) {
        int maxValue = 0;
        while (n != 0) {
            if (n % 10 > maxValue) {
                maxValue = n % 10;
                n = n / 10;
            } else if (n % 10 <= maxValue) {
                n = n / 10;
            }
        }
        return maxValue;
    }
}


