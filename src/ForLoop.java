public class ForLoop {

    public static void main(String[] args) {
        int i;
        for (i = 100; i >= 1; i--) {
            {
                System.out.print(getNumber(i) + " ");
            }
        }
    }

    public static int getNumber(int j) {
        if (j % 4 == 0) {
            return (int) j;
        } else return 0;
    }
}





