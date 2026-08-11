public class duplicate {

    public static void main(String[] args) {

        int[] values = {10, 20, 30,40,30, 20, 40, 10};
        int n = values.length;

        for (int i = 0; i < n; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (values[k] == values[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (values[i] == values[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("Value " + values[i] + " appears " + count + " times.");
            }
        }
    }
}