public class Uebung13 {
    public static void task13_1() {
        System.out.println("########## Aufgabe 13.1: Copy-Konstruktor");
        
        System.out.println("done");
    }
    public static void task13_2() {
        System.out.println("########## Aufgabe 13.2: Punkt");
        
        Punkt p = new Punkt();
        System.out.printf("Neues Objekt: %s\n", p.toString());

        p.setX(1.);
        p.setY(1.);
        p.setZ(1.);
        
        System.out.printf("Objekt nach Settern: %s\n", p.toString());
        System.out.printf("Objekt mithilfe von Gettern: (%f, %f, %f)\n", p.getX(), p.getY(), p.getZ());
    }
    
    public static void task13_3() {
        System.out.println("########## Aufgabe 13.3: Komplexe Zahl");
        
        Komplex c = new Komplex();
        System.out.printf("Neues Objekt: %s\n", c.toString());

        c.setReal(1.);
        c.setImaginary(1.);
        
        System.out.printf("Objekt nach Settern: %s\n", c.toString());
        System.out.printf("Objekt mithilfe von Gettern: %f + %fi\n", c.getReal(), c.getImaginary());
    }
    
    public static void task13_4() {
        System.out.println("########## Aufgabe 13.4: Gerade Zahl");
        
        GeradeZahl n = new GeradeZahl();
        System.out.printf("Neues Objekt: %s\n", n.toString());

        n.setValue(4);
        System.out.printf("Objekt nach Setter (4): %s\n", n.toString());
        n.setValue(7);
        System.out.printf("Objekt nach Setter (7): %s\n", n.toString());
        System.out.printf("Objekt mithilfe von Gettern: %d\n", n.getValue());
    }
    
    public static void task13_5() throws Exception {
        System.out.println("########## Aufgabe 13.5: Notenverwaltung");
        
        Note n = new Note();
        System.out.printf("Neues Objekt: %s\n", n.toString());

        n.setValue("3,0");
        System.out.printf("Objekt nach Setter: %s\n", n.toString());
        System.out.printf("Objekt mithilfe von Getter: Note: %s\n", n.getValue());
    }
    
    public static void task13_6() throws Exception {
        System.out.println("########## Aufgabe 13.6: Geburtstag");
        
        Geburtstag g = new Geburtstag();
        System.out.printf("Neues Objekt: %s\n", g.toString());

        g.setMonth(13);
        g.setDay(2);
        
        System.out.printf("Objekt nach Settern: %s\n", g.toString());
        System.out.printf("Objekt mithilfe von Gettern: %d.%d.\n", g.getDay(), g.getMonth());
    }
    
    public static void task13_7() {
        System.out.println("########## Aufgabe 13.7: Dominostein");
        
        Dominostein d = new Dominostein(1,1);
        System.out.printf("Neues Objekt: %s\n", d.toString());

        d.setTop(2);
        d.setBottom(5);
        
        System.out.printf("Objekt nach Settern: %s\n", d.toString());
        System.out.printf("Objekt mithilfe von Gettern: %d|%d.\n", d.getTop(), d.getBottom());
    }
    public static void main(String[] args) throws Exception {
        task13_1();
        task13_2();
        task13_3();
        task13_4();
        task13_5();
        task13_6();
        task13_7();
    }
}
