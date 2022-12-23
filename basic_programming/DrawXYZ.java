public class Main {
    public static void main(String[] args) {
        drawXyz(3);
        drawXyz(5);
        drawXyz(1);
    }

    private static void drawXyz(int a) {
        int nilai = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                nilai = nilai + 1;
                if (nilai % 3 == 0) {
                    System.out.print("x");
                } else if (nilai % 2 != 0) {
                    System.out.print("y");
                } else if (nilai % 2 == 0) {
                    System.out.print("z");
                }
            }
            System.out.println();
        }
    }
}