public class Punkt {
    private double x;
    private double y;
    private double z;

    public Punkt(Punkt p) {
        x = p.x;
        y = p.y;
        z = p.z;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")"; 
    }

    public void setX(double val) {
        x = val;
    }
    public void setY(double val) {
        y = val;
    }
    public void setZ(double val) {
        z = val;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public Punkt() {
        this.x = 0.;
        this.y = 0.;
        this.z = 0.;
    }

    public void schiebe(double dx, double dy) {
        x += dx;
        y += dy;
    }
}
