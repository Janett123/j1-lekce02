package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class Osmiuhelnik {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        /*
        for (int i = 0; i < 8; i++) {
            zofka.turnLeft(45);
            zofka.move(50);
        }
         */

        /*
        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(20);
            zofka.move(20);
        }
         */

        for (int i = 0; i < 12; i++) {
            zofka.turnLeft(30);         //kruh
            zofka.move(20);
            zofka.turnRight(90);        //paprsek
            zofka.move(20);
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(20);
            zofka.penDown();
            zofka.turnRight(90);        //zpět do původní polohy
        }

}

    public static void main(String[] args) {
        new Osmiuhelnik().start();
    }

}
