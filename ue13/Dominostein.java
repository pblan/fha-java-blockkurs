public class Dominostein {
    private int top;
    private int bottom;

    public Dominostein(Dominostein d) {
        top = d.top;
        bottom = d.bottom;
    }

    public String toString() {
        return "" + top + "|" + bottom;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int val) {
        if (val > 0 && val < 7)
            top = val; 
    }
    
    public void setBottom(int val) {
        if (val > 0 && val < 7)
            bottom = val; 
    }

    public Dominostein(int a, int b) {
        this.setTop(a);
        this.setBottom(b);
    }

    public void dreheUm() {
        int help = this.top;
        this.top = this.bottom;
        this.bottom = help;
    }

    public int[] getValues() {
        return new int[] {this.top, this.bottom};
    }
}
