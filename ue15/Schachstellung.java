public class Schachstellung {
    char[][] field;
    public Schachstellung() {
        this.field = new char[8][8];
    }

    public void setzeSchachstellung(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'K' || s.charAt(i) == 'D' || s.charAt(i) == 'T' || s.charAt(i) == 'S' || s.charAt(i) == 'L' || s.charAt(i) == 'B') 
                continue;
            if (s.charAt(i) == 'k' || s.charAt(i) == 'd' || s.charAt(i) == 't' || s.charAt(i) == 's' || s.charAt(i) == 'l' || s.charAt(i) == 'b') 
                continue;
            if (Integer.parseInt("" + s.charAt(i)) >= 1 || Integer.parseInt("" + s.charAt(i)) <= 8) 
                continue;
            throw new IllegalArgumentException("Invalid character or not in range!");
        }

        while (s.length() >= 3) {
            System.out.println(s);
            int x = Integer.parseInt("" + s.charAt(1)) - 1;
            int y = Integer.parseInt("" + s.charAt(2)) - 1;
            if (this.field[x][y] != '\u0000')
                throw new IllegalArgumentException("Double usage of a field!");
            this.field[x][y] = s.charAt(0);
            s = s.substring(3);
        }
    }

    public String toString() {
        String horizontal = "+---+---+---+---+---+---+---+---+\n";
        String res = "" + horizontal;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                res += "| " + (field[i][j] == '\u0000' ? " " : field[i][j]) + " ";
            res += "|\n";
            res += horizontal;
            
        }
        return res;
    }
}
