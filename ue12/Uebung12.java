public class Uebung12 {
    public static void task12_1() {
        System.out.println("########## Aufgabe 12.1: Punkt");
        
        Punkt p = new Punkt();
        System.out.printf("Neues Objekt: %s\n", p.toString());

        p.setX(1.);
        p.setY(1.);
        p.setZ(1.);
        
        System.out.printf("Objekt nach Settern: %s\n", p.toString());
        System.out.printf("Objekt mithilfe von Gettern: (%f, %f, %f)\n", p.getX(), p.getY(), p.getZ());
    }
    
    public static void task12_2() {
        System.out.println("########## Aufgabe 12.2: Komplexe Zahl");
        
        Komplex c = new Komplex();
        System.out.printf("Neues Objekt: %s\n", c.toString());

        c.setReal(1.);
        c.setImaginary(1.);
        
        System.out.printf("Objekt nach Settern: %s\n", c.toString());
        System.out.printf("Objekt mithilfe von Gettern: %f + %fi\n", c.getReal(), c.getImaginary());
    }
    
    public static void task12_3() {
        System.out.println("########## Aufgabe 12.3: Gerade Zahl");
        
        GeradeZahl n = new GeradeZahl();
        System.out.printf("Neues Objekt: %s\n", n.toString());

        n.setValue(4);
        System.out.printf("Objekt nach Setter (4): %s\n", n.toString());
        n.setValue(7);
        System.out.printf("Objekt nach Setter (7): %s\n", n.toString());
        System.out.printf("Objekt mithilfe von Gettern: %d\n", n.getValue());
    }
    
    public static void task12_4() throws Exception {
        System.out.println("########## Aufgabe 12.4: Notenverwaltung");
        
        Note n = new Note();
        System.out.printf("Neues Objekt: %s\n", n.toString());

        n.setValue("3,0");
        System.out.printf("Objekt nach Setter: %s\n", n.toString());
        System.out.printf("Objekt mithilfe von Getter: Note: %s\n", n.getValue());
    }
    
    public static void task12_5() throws Exception {
        System.out.println("########## Aufgabe 12.5: Geburtstag");
        
        Geburtstag g = new Geburtstag();
        System.out.printf("Neues Objekt: %s\n", g.toString());

        g.setMonth(12);
        g.setDay(2);
        
        System.out.printf("Objekt nach Settern: %s\n", g.toString());
        System.out.printf("Objekt mithilfe von Gettern: %d.%d.\n", g.getDay(), g.getMonth());
    }
    
    public static void task12_6() {
        System.out.println("########## Aufgabe 12.6: Dominostein");
        
        Dominostein d = new Dominostein(1,1);
        System.out.printf("Neues Objekt: %s\n", d.toString());

        d.setTop(2);
        d.setBottom(5);
        
        System.out.printf("Objekt nach Settern: %s\n", d.toString());
        System.out.printf("Objekt mithilfe von Gettern: %d|%d.\n", d.getTop(), d.getBottom());
    }
    public static void main(String[] args) throws Exception {
        task12_1();
        task12_2();
        task12_3();
        task12_4();
        task12_5();
        task12_6();
    }
}
