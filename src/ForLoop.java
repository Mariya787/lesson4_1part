public class ForLoop {

    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            if (checkFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkFour(int j) {
        return j % 4 == 0;
    }
}





