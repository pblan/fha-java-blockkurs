public class Geburtstag {
    private int day;
    private int month;

    public Geburtstag(Geburtstag g) {
        day = g.day;
        month = g.month;
    }

    public String toString() {
        return "" + day + "." + month + ".";
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int val) {
        if (val > 0 && val < 13)
            month = val;
    }

    public void setDay(int val) throws Exception {
        if (month == 0)
            throw new Exception("Monat noch nicht gesetzt!");
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (val > 0 && val <= 31)
                    day = val;
                else
                    throw new Exception("Falscher Tag!");
            }
            case 4, 6, 9, 11 -> {
                if (val > 0 && val <= 30)
                    day = val;
                else
                    throw new Exception("Falscher Tag!");
            }
            case 2 -> {
                if (val > 0 && val <= 29)
                    day = val;
                else
                    throw new Exception("Falscher Tag!");
            }
        }
    }

    public Geburtstag() {
        this.month = 1;
        this.day = 1;
    }

    public Geburtstag(int d, int m) throws Exception {
        this.setMonth(m);
        this.setDay(d);
    }

    public boolean equals(Geburtstag g2) {
        return this.day == g2.day && this.month == g2.month;
    }
}
