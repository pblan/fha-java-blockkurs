public class Uebung16 {

    public static void SelectionSort(double[] x) {
        for (int i = 0; i < x.length; i++) {
            int max = i;
            for (int j = i+1; j < x.length; j++)
                max = x[j] > x[max] ? j : max;
            double help = x[max];
            x[max] = x[i];
            x[i] = help;
        }
    }

    public static void task16_1() {
        double[] x = new double[19];
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            x[i] = Math.random() * 100;
            System.out.printf("x[%d] = %f\n", i, x[i]);
        }
        System.out.print("\n");

        SelectionSort(x);

        for (int i = 0; i < 10; i++)
            System.out.printf("x'[%d] = %f\n", i, x[i]);
    }

    public static void main(String[] args) {
        task16_1();
    }
}
