import java.math.BigInteger;

public class Uebung11 {
    public static void printPi(int decimals) {
        double pi = Math.PI;
        System.out.printf("%d,", (int) pi);
        for (int i = 0; i < decimals; i++) {
            pi *= 10;
            pi %= 10;
            System.out.printf("%d", (int) pi);
        }
         System.out.print("\n");  
    }

    public static void task11_1() {
        System.out.println("########## Aufgabe 11.1: Formatierung");

        int decimals = (int) (Math.random() * 10);
        printPi(decimals);
    }

    public static int getMaxValue(int[][] arr) {
        int res = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                res = res < arr[i][j] ? res : arr[i][j];
        }
        return res;
    }

    public static int getDigitCount(int a) {
        int res = 1;
        while (a >= 10) {
            res++;
            a /= 10;
        }
        return res;
    }

    public static void printArray(int[][] arr) {
        int digitCount = getDigitCount(getMaxValue(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%" + (digitCount + 5) + "d", arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void task11_2() {
        System.out.println("########## Aufgabe 11.2: Feld ausgeben");
        
        int m = (int) (Math.random() * 10) + 1;
        int n = (int) (Math.random() * 10) + 1;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            int j = 0;
            for (; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 1000);
            }
        }
        printArray(arr);
    }

    public static BigInteger fakultaet(BigInteger n) {
        if (n.intValue() == 1)
            return new BigInteger("1");
        return n.multiply(fakultaet(n.subtract(new BigInteger("1"))));
    }

    public static void task11_3() {
        System.out.println("########## Aufgabe 11.3: Zahlen beliebiger Länge");
        
        BigInteger a = new BigInteger("1");

        String b = System.console().readLine();
        BigInteger res = fakultaet(new BigInteger(b));

        System.out.printf("%s! = %s", b, res.toString(10));
    }

    public static void main(String[] args) {
        task11_1();
        task11_2();
        task11_3();
    }
}
