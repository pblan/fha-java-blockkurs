public class Kreis {
    private double radius;
    private Punkt mittelpunkt;

    public Kreis(double radius, Punkt mittelpunkt) {
        this.radius = radius;
        this.mittelpunkt = new Punkt(mittelpunkt);
    }

    public Kreis(Kreis k2) {
        this.radius = k2.radius;
        this.mittelpunkt = new Punkt(k2.mittelpunkt);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Punkt getMittelpunkt() {
        return mittelpunkt;
    }

    public void setMittelpunkt(Punkt mittelpunkt) {
        this.mittelpunkt = mittelpunkt;
    }

    public double getFlaeche() {
       return Math.PI * radius * radius;
    }

    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    public double getAbstand(Punkt p) {
        return Math.sqrt((p.getX() - mittelpunkt.getX()) * (p.getX() - mittelpunkt.getX()) + (p.getY() - mittelpunkt.getY()) * (p.getY() - mittelpunkt.getY())) - radius;
    }
}
