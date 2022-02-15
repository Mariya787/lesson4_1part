public class ForLoop {

    public static void main(String[] args) {

        System.out.println("Числа из диапазона [0,100], кратные 4, в обратном порядке: ");

        for (int i = 100; i >= 1; i--) {
            if (dividedByFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean dividedByFour(int j) {
        return j % 4 == 0;
    }
}





