import javax.swing.*;

public class Uebung02 {
    public static void task2_1() {
        System.out.println("########## Aufgabe 2.1: Reziproke Zahl");

        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Zahl: "));
        System.out.printf("Zahl: %d, Reziproke Zahl: %f\n", zahl, 1. / zahl);
    }

    public static void task2_2() {
        System.out.println("########## Aufgabe 2.2: Rechenoperationen");

        double x = Double.parseDouble(JOptionPane.showInputDialog("Zahl: "));
        System.out.printf("Absolut: %d, nat. Logarithmus: %f, Sinus Hyperbolikus: %f\n", (int) x, Math.log(x),
                Math.sinh(x));
    }

    public static double getFahrenheit(double celsius) {
        return celsius * (9. / 5.) + 32;
    }

    public static void task2_3() {
        System.out.println("########## Aufgabe 2.3: Temperaturumrechnung");

        double celsius = Math.random() * 100;
        System.out.printf("%f°C = %f°F\n", celsius, getFahrenheit(celsius));
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(((x1 - x2) * (x1 - x2)) + (y1 - y2) * (y1 - y2));
    }

    public static void task2_4() {
        System.out.println("########## Aufgabe 2.4: Punkt-Abstand");

        double x1 = Math.random() * 10;
        double x2 = Math.random() * 10;
        double y1 = Math.random() * 10;
        double y2 = Math.random() * 10;

        System.out.printf("P_1 := (%f,%f)\nP_2 := (%f,%f)\n(P_1,P_2) = %f\n", x1, x2, y1, y2,
                getDistance(x1, y1, x2, y2));
    }

    public static double getDoubleRandom(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    public static int getIntRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void task2_5() {
        System.out.println("########## Aufgabe 2.5: Zufallszahl");

        double min = Math.random() * 100;
        double max = Math.random() * 100 + min;

        System.out.printf("min := %f\nmax := %f\nrandom double: %f\nrandom int: %d\n", min, max,
                getDoubleRandom(min, max), getIntRandom((int) min, (int) max));
    }

    public static void main(String[] args) {
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task2_5();
    }
}
