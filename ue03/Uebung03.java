public class Uebung03 {
    public static String getTemperatureText(double temp) {
        if (temp < 10)
            return "kalt";
        if (temp < 25)
            return "lauwarm";
        if (temp < 40)
            return "warm";
        return "heiß";
    }

    public static void task3_1() {
        System.out.println("########## Aufgabe 3.1: Temperatursensor");

        double temp = Math.random() * 50;
        System.out.printf("%f°C ist %s.\n", temp, getTemperatureText(temp));
    }

    public static int getWaitingTime(int h, int min) {
        return 30 - (min % 30);
    }

    public static void task3_2() {
        System.out.println("########## Aufgabe 3.2: Zubringerbus");

        int h = (int) (Math.random() * 24);
        int min = (int) (Math.random() * 60);
        System.out.printf("Es ist %d:%d Uhr. Der nächste Bus kommt in %dmin.\n", h, min, getWaitingTime(h, min));
    }

    public static double solveLinearEquation(double a, double b) {
        if (a == 0)
            throw new ArithmeticException("Gleichung nicht eindeutig lösbar!");
        return (-b)/a;
    }

    public static void task3_3() {
        System.out.println("########## Aufgabe 3.3: Lineare Gleichungen");

        double a = Math.random() * 100;
        double b = Math.random() * 100;
        System.out.printf("a := %f\nb := %f\n=> x = %f\n", a, b, solveLinearEquation(a, b));
    }

    public static int getPostage(int order) {
        return order < 10000 ? order + 550 : order < 20000 ? order + 300 : order;
    }

    public static void task3_4() {
        System.out.println("########## Aufgabe 3.4: Bestellung");

        int order = (int) (Math.random() * 30000);
        int postage = getPostage(order);
        System.out.printf("Bestellwert: %d,%d€\n=> Zahlungsbetrag: %d,%d€\n", order/100, order%100, postage/100, postage%100);
    }

    public static String getNameOfMonth(int nr) {
        switch (nr) {
            case 1: return "Januar";
            case 2: return "Februar";
            case 3: return "März";
            case 4: return "April";
            case 5: return "Mai";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "August";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Dezember";
            default: throw new ArithmeticException();
        }

    }

    public static void task3_5() {
        System.out.println("########## Aufgabe 3.5: Monatsname");

        int nr = (int) (Math.random() * 12);
        System.out.printf("Monat #%d ist %s.", nr, getNameOfMonth(nr));
    }

    public static void main(String[] args) {
        task3_1();
        task3_2();
        task3_3();
        task3_4();
        task3_5();
    }
}
