public class GeradeZahl {
    private int value;

    public GeradeZahl(GeradeZahl n) {
        value = n.value;
    }

    public String toString() {
        return "" + value;
    }

    public void setValue(int n) {
        value = n % 2 == 0 ? n : n - 1;
    }

    public int getValue() {
        return value;
    }

    public GeradeZahl() {
        this.value = 0;
    }

    public GeradeZahl(int n) {
        this.setValue(n);
    }

    public GeradeZahl getNachfolger() {
        return new GeradeZahl(this.value + 2);
    }

    public GeradeZahl getSum(GeradeZahl g2) {
        return new GeradeZahl(this.value + g2.value);
    }

    public GeradeZahl getProd(GeradeZahl g2) {
        return new GeradeZahl(this.value * g2.value);
    }
}
