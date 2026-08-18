public class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 2 || i == 4) {
                for (char c = 'a'; c <= 'd'; c++) {
                    System.out.print(c + " ");
                }
            } else {
                int start = i == 1 ? 1 : 5;
                for (int num = start; num < start + 4; num++) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
