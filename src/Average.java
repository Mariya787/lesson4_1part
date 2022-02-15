import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        double average;
        double average2;
        int sum = 0;
        int sum2 = 0;
        int count = 0;
        int count2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное целое число диапазона: ");
        int a = scanner.nextInt();
        System.out.println("Введите конечное целое число диапазона: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            sum = sum + i;
            count = count + 1;
        }
        average = (double) sum / count;

        for (int j = a; j <= b; j++) {
            if (j % 2 == 0) {
                sum2 = sum2 + j;
                count2 = count2 + 1;
            }
        }
        average2 = (double) sum2 / (count2);

        System.out.printf("Среднее арифметическое чисел из диапазона [%d,%d]: %.1f%n", a, b, average);
        System.out.printf("Среднее арифметическое четных чисел из диапазона [%d,%d]: %.1f", a, b, average2);
    }
}

