import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        double average = 0;
        double average2 = 0;
        int sum = 0;
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число диапазона: ");
        Integer a = scanner.nextInt();
        System.out.println("Введите второе целое число диапазона: ");
        Integer b = scanner.nextInt();

        for (int i = 0; i <= (b - a); i++) {
            sum = sum + a + i;
        }
        average = (double) sum / (b - a + 1);

//        if (a % 2 == 0 && b % 2 == 0) {
//            for (int i = 0; i <= (b - a); i = i + 2) {
//                sum2 = sum2 + a + i;
//                average2 = (double) 2*sum2/(b - a + 2);     }
//        }

        System.out.printf("Среднее арифимитичсекое чисел из диапазона [%d,%d]: %f", a, b, average);
        // System.out.printf("Среднее арифимитичсекое четных чисел из диапазона [%d,%d]: %f",a,b,average2);
    }
}

