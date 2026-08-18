public class pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 2) {
                for (int j = 1; j <= 2; j++) {
                    System.out.print('a');
                }
            } else if (i == 4) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print('b');
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
