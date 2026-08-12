public class pattern7 {
    public static void main(String[] args) {
        int[] rowStart = {1, 5, 3, 1};

        for (int i = 0; i < 4; i++) {
            int value = rowStart[i];
            for (int j = 0; j < 4; j++) {
                System.out.print(value + " ");
                value = value == 6 ? 1 : value + 1;
            }
            System.out.println();
        }
    }
}
