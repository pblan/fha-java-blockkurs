public class Uebung08 {
    public static double[][] getDoubleArray(int x, int y){
        return new double[x][y];
    }
    
    public static void task8_1() {
        System.out.println("########## Aufgabe 8.1: Feld erzeugen");
        
        int x = (int) (Math.random() * 10) + 1;
        int y = (int) (Math.random() * 10) + 1;
        double[][] test = getDoubleArray(x, y);

        System.out.print("Hat funktioniert.\n");
    }
    
    public static double getMinimum(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = min < a[i] ? min : a[i];
        }
        return min;
    }
    
    public static int getMinimumIndex(double[] a) {
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            min = a[min] < a[i] ? min : i;
        }
        return min;
    }

    public static void task8_2() {
        System.out.println("########## Aufgabe 8.2: Minimum und Minimum-Index");
        
        double[] a = new double[10];
        for (int i = 0; i < 10; i++) {
            a[i] = Math.random() * 100;
            System.out.printf("a[%d] := %f\n", i, a[i]);
        }
            
        System.out.printf("Minimum: a[%d] = %f\n", getMinimumIndex(a), getMinimum(a));
    }

    public static boolean isSquare(int[][] test) {
        for (int i = 0; i < test.length; i++) {
            if (test[i].length != test.length)
                return false;
        }
        return true;
    }

    public static boolean isSquare(double[][] test) {
        for (int i = 0; i < test.length; i++) {
            if (test[i].length != test.length)
                return false;
        }
        return true;
    }
    
    public static void task8_3() {
        System.out.println("########## Aufgabe 8.3: Test auf quadratische Form");
        
        int x = (int) (Math.random() * 10) + 1;
        int y = (int) (Math.random() * 10) + 1;
        int[][] test = new int[x][y];
        
        System.out.printf("Ist %dx%d quadratisch? %b\n", x, y, isSquare(test));
    }
    
    public static String[] months = {
        "Januar",
        "Februar",
        "März",
        "April",
        "Mai",
        "Juni",
        "Juli",
        "August",
        "September",
        "Oktober",
        "November",
        "Oktober",
        "November",
        "Dezember"
    };

    public static String getNameOfMonth(int no) {
        if (no < 1 || no > 12)
            throw new ArithmeticException();
        return months[--no];
    }

    public static void task8_4() {
        System.out.println("########## Aufgabe 8.4: Monatsname 2");
        
        int no = (int) (Math.random() * 12) + 1;
        System.out.printf("Monat Nr. #%d ist %s.\n", no, getNameOfMonth(no));
    }
    
    public static int[] concat(int[] x1, int[] x2) {
        int[] res = new int[x1.length + x2.length];

        System.arraycopy(x1, 0, res, 0, x1.length);
        System.arraycopy(x2, 0, res, x1.length, x2.length);
        return res;
    }

    public static void task8_5() {
        System.out.println("########## Aufgabe 8.5: Verkettung von Arrays");
        
        int[] x1 = new int[10];
        for (int i = 0; i < 10; i++) {
            x1[i] = (int) (Math.random() * 100);
            System.out.printf("x1[%d] := %d\n", i, x1[i]);
        }
        System.out.print("\n");

        int[] x2 = new int[10];
        for (int i = 0; i < 10; i++) {
            x2[i] = (int) (Math.random() * 100);
            System.out.printf("x2[%d] := %d\n", i, x2[i]);
        }
        System.out.print("\n");

        int[] res = concat(x1, x2);
        for (int i = 0; i < res.length; i++) {
            System.out.printf("res[%d] = %d\n", i, res[i]);
        }
        System.out.print("\n");
    }
    
    public static double[][] getIndexSumArray(int a, int b) {
        double[][] res = new double[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                res[i][j] = i + j + 1;
        }
        return res;
    }

    public static double[][] array_8_6;

    public static void task8_6() {
        System.out.println("########## Aufgabe 8.6: Indexsumme");
        
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;

        array_8_6 = getIndexSumArray(a, b);
        for (int i = 0; i < array_8_6.length; i++) {
            for (int j = 0; j < array_8_6[i].length; j++)
                System.out.printf("%f ", array_8_6[i][j]);
            System.out.print("\n");
        }
    }
    
    public static double getTrace(double[][] matrix) {
        double res = 0;
        for (int i = 0; i < matrix.length; i++) {
            res += matrix[i][i];
        }
        return res;
    }

    public static void task8_7() {
        System.out.println("########## Aufgabe 8.7: Spur");
        
        if (!isSquare(array_8_6)) {
            System.out.printf("Die Spur ist nicht definiert für eine %dx%d Matrix!", array_8_6[0].length, array_8_6.length);
            return;
        }

        System.out.printf("Die Spur der Matrix ist: %f", getTrace(array_8_6));
    }
    
    public static void main(String[] args) {
        task8_1();
        task8_2();
        task8_3();
        task8_4();
        task8_5();
        task8_6();
        task8_7();
    }
}
