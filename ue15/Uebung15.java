public class Uebung15 {
    public static void task15_2() {
        Dominostein head = new Dominostein(4,2);
        Dominostein two = new Dominostein(2,5);
        Dominostein three = new Dominostein(5,0);
        Dominostein four = new Dominostein(6,0);
        Dominostein five = new Dominostein(3,6);
        Dominostein six = new Dominostein(3,3);
        Dominostein fail = new Dominostein(4,4);

        Dominokette kette = new Dominokette(head);
        System.out.println(kette.toString());

        kette.fuegeRechtsAn(two);
        System.out.println(kette.toString());
        
        kette.fuegeRechtsAn(three);
        System.out.println(kette.toString());
        
        kette.fuegeRechtsAn(four);
        System.out.println(kette.toString());
        
        kette.fuegeRechtsAn(five);
        System.out.println(kette.toString());
        
        kette.fuegeRechtsAn(six);
        System.out.println(kette.toString());
        
        //kette.fuegeRechtsAn(fail);
        //System.out.println(kette.toString());
    }

    public static void task15_3() {
        Schachstellung schach = new Schachstellung();
        System.out.print(schach.toString());

        schach.setzeSchachstellung("b22K24l28B23k66");
        System.out.print(schach.toString());
    }

    public static void main(String[] args) {
        task15_2();
        task15_3();
    }
}
