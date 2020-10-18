public class Uebung09 {
    public static int getCharCount(String s, char c) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            res = s.charAt(i) == c ? res + 1 : res;
        return res;
    }

    public static void task9_1() {
        System.out.println("########## Aufgabe 9.1: Zeichen zählen");

        String s = "ABHDBVJKSDBVKHDSVJNVLKSFNBLJSBJAD";
        char c = s.charAt((int) (Math.random() * s.length()));

        System.out.printf("%c kommt in %s %dx vor.\n", c, s, getCharCount(s, c));
    }

    public static String getCapitalString() {
        String s = System.console().readLine();
        String res = "";

        for (int i = 0; i < s.length(); i++)
            res += ((int) s.charAt(i) >= 97) && ((int) s.charAt(i) <= 122) ? (char) (s.charAt(i) - 32) : s.charAt(i);
        return res;
    }

    public static void task9_2() {
        System.out.println("########## Aufgabe 9.2: Großbuchstaben einlesen");

        System.out.printf("%s\n", getCapitalString());
    }

    public static void task9_3() {
        System.out.println("########## Aufgabe 9.3: ASCII-Tabelle");

        for (int i = 0; i < 128; i++)
            System.out.printf("%d | %c \n", i, (char) i);
        System.out.print("\n");
    }

    public static String reverse(String a) {
        String res = "";
        for (int i = 0; i < a.length(); i++)
            res += a.charAt(a.length() - i - 1);
        return res;
    }

    public static void task9_4() {
        System.out.println("########## Aufgabe 9.4: Umkehrung");

        String a = "Donaudampfschiffahrtsgesellschaftskapitän";
        System.out.printf("%s\n<=>\n%s\n", a, reverse(a));
    }

    public static String clozeText(String a) {
        // i * 4 - 1
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            res += (i + 1) % 4 == 0 ? " " : a.charAt(i);
        }
        return res;
    }

    public static void task9_5() {
        System.out.println("########## Aufgabe 9.5: Lückentext");

        String a = "Donaudampfschiffahrtsgesellschaftskapitän";
        System.out.printf("%s\n=>\n%s\n", a, clozeText(a));
    }

    public static int[] getParameters() {
        String input = System.console().readLine();
        int[] res = new int[getCharCount(input, ',') + 1];
        for (int i = 0, j = 0, k = 0; i < input.length(); i++) {
            if (i == input.length() - 1 || input.charAt(i + 1) == ',') {
                res[k] = Integer.parseInt(input.substring(j, i + 1));
                k++;
                j = i + 2;
            }
        }
        return res;
    }

    public static void task9_6() {
        System.out.println("########## Aufgabe 9.6: Trennung von Parametern");

        int[] res = getParameters();
        for (int i = 0; i < res.length; i++)
            System.out.printf("res[%d] = %d\n", i, res[i]);
    }

    public static String newGermanOrthography(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 's' || s.charAt(i) == 'S') && (s.charAt(i + 1) == 'c' || s.charAt(i + 1) == 'C') && (s.charAt(i + 2) == 'h' || s.charAt(i + 2) == 'H')) {
                res += "sh";
                i += 2;
                continue;
            }
            res += s.charAt(i);
        }
        return res;
    }

    public static void task9_7() {
        System.out.println("########## Aufgabe 9.7: Neue deutsche Rechtschreibung");

        String s = "Neue deutsche Rechtschreibung";
        System.out.printf("%s\n=>\n%s\n", s, newGermanOrthography(s));
    }

    public static int[] getDigitCount(int n) {
        int[] res = new int[10];
        while (n != 0) {
            res[n % 10]++;
            n /= 10;
        }
        return res;
    }

    public static void task9_8() {
        System.out.println("########## Aufgabe 9.Häufigkeit der Ziffern");

        int n = (int) (Math.random() * Integer.MAX_VALUE);
        int[] res = getDigitCount(n);

        System.out.println(n);
        for (int i = 0; i < res.length; i++)
            System.out.printf("res[%d] = %d\n", i, res[i]);
    }

    public static void main(String[] args) {
        task9_1();
        task9_2();
        task9_3();
        task9_4();
        task9_5();
        task9_6();
        task9_7();
        task9_8();
    }
}
