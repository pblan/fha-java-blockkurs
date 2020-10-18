public class Uebung06 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            if (a < 0 || b < 0)
                throw new ArithmeticException();
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static void task6_1() {
        System.out.println("########## Aufgabe 6.1: Größter gemeinsamer Teiler");
        
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        System.out.printf("Used parameters:\na := %d\nb := %d\n", a, b);
        System.out.printf("gcd(%d,%d) = %d\n", a, b, gcd(a, b));
    }

    public static void printTriangle(int n) {
        int spaces = n;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < spaces; k++) 
                System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            spaces--;
            System.out.print("\n");
        }
    }
    public static void task6_2() {
        System.out.println("########## Aufgabe 6.2: Zahlendreieck");
        
        int n = (int) (Math.random() * 5) + 5;
        printTriangle(n);
    }

    public static void printCircle(int radius) {
        double distance;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                if (distance > radius - 0.5 && distance < radius + 0.5)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        } 
    }

    public static void task6_3() {
        System.out.println("########## Aufgabe 6.3: Kreis");
        
        int radius = (int) (Math.random() * 10) + 5;
        printCircle(radius);
    }
    public static void main(String[] args) {
        task6_1();
        task6_2();
        task6_3();
    }
}
