public class Uebung04 {
    public static int getFactorial(int x) {
        if (x < 1)
            throw new ArithmeticException();

        return x == 1 ? 1 : x-- * getFactorial(x);
    }

    public static void task4_1() {
        System.out.println("########## Aufgabe 4.1: Fakultät");

        int x = (int) (Math.random() * 10) + 1;
        System.out.printf("%d! = %d\n", x, getFactorial(x));
    }

    public static double doubleNotBirthday(int size) {
        if (size < 2)
            throw new ArithmeticException();
        if (size == 2)
            return 364. / 365.;
        return (365. - size--) / 365. * doubleNotBirthday(size);
    }

    public static double doubleBirthday(int size) {
        return 1. - doubleNotBirthday(size);
    }

    public static void task4_2() {
        System.out.println("########## Aufgabe 4.2: Geburtstage");

        int size = (int) (Math.random() * 50) + 2;
        System.out.printf("Für %d Menschen beträgt die Wahrscheinlichkeit %f.\n", size, doubleBirthday(size));
    }

    public static double getLeibniz(int n) {
        if (n < 1)
            throw new ArithmeticException();
        return n == 1 ? n : (n % 2) == 1 ? 1. / (2. * n-- - 1) + getLeibniz(n) : -1. / (2 * n-- - 1) + getLeibniz(n);
    }

    public static double getPi(int n) {
        return 4 * getLeibniz(n);
    }

    public static void task4_3() {
        System.out.println("########## Aufgabe 4.3: Pi");
        int n = (int) (Math.random() * 5000) + 1;

        System.out.printf("Pi mit %d Reihengliedern: %f\n", n, getPi(n));
    }

    public static int getPartialSum(int i) {
        return i == 1 ? i : i-- + getPartialSum(i);
    }

    public static int getNextPartialSum(int v) {
        if (v < 1)
            throw new ArithmeticException();
        int i;
        for (i = 1; getPartialSum(i) <= v; ++i)
            ;
        return getPartialSum(i);
    }

    public static void task4_4() {
        System.out.println("########## Aufgabe 4.4: Summe");

        int v = (int) (Math.random() * 50) + 1;
        System.out.printf("getNextPartialSum(%d) = %d\n", v, getNextPartialSum(v));
    }

    public static void task4_5() {
        System.out.println("########## Aufgabe 4.5: Summe und Durchschnitt");

        int n, sum;
        sum = 0;
        do {
            System.out.println("Gib eine Zahl ein (0: Abbruch):");
            n = Integer.parseInt(System.console().readLine());
            sum += n;
        } while (n != 0);

        System.out.printf("Summe: %d\n", sum);
    }

    public static void task4_6() {
        System.out.println("########## Aufgabe 4.6: ASCII-Werte");

        int n;
        do {
            System.out.println("Gib eine Zahl ein (0-127, 0: Abbruch):");
            n = Integer.parseInt(System.console().readLine());
            System.out.printf("Character: %c\n", (char) n);
        } while (n != 0);

    }

    public static int getFibonacciNumber(int n) {
        if (n < 1)
            throw new ArithmeticException();
        return (n == 1) || (n == 2) ? 1 : getFibonacciNumber(--n) + getFibonacciNumber(--n);
    }

    public static void task4_7() {
        System.out.println("########## Aufgabe 4.7: Fibonacci-Zahlen");

        int n = (int) (Math.random() * 50) + 1;
        System.out.printf("Die %d. Fibonacci-Nummer ist: %d", n, getFibonacciNumber(n));
    }

    public static void main(String[] args) {
        task4_1();
        task4_2();
        task4_3();
        task4_4();
        task4_5();
        task4_6();
        task4_7();
    }
}
