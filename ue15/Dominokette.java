public class Dominokette {
    private Dominostein head;
    private Dominokette tail;

    public Dominokette(Dominostein start) {
        this.head = start;
    }

    public String toString() {
        if (this.head == null)
            return "";
        return "[" + this.head.getTop() + "," + this.head.getBottom() + "]" + (tail == null ? "" : tail.toString());
    }

    public void fuegeRechtsAn(Dominostein d) {
        if (this.head != null && this.tail == null) {
            if (this.head.getBottom() == d.getTop()) {
                this.tail = new Dominokette(d);
                return;
            }
            if (this.head.getBottom() == d.getBottom()) {
                d.dreheUm();
                this.tail = new Dominokette(d);
                return;
            }
            throw new NumberFormatException("Stein kann nicht angelegt werden!");
        }
        this.tail.fuegeRechtsAn(d);
    }
}
