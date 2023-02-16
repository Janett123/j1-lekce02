package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class Prasatko {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();


         for (int i = 0; i < 4; i++) {

            zofka.turnRight(90);
            zofka.move(100);
        }

        zofka.turnLeft(150);
        zofka.move(60);
        zofka.turnLeft(60);
        zofka.move(60);
        zofka.turnRight(60);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(120);
        zofka.penDown();
        zofka.move(30);
    }

    public static void main(String[] args) {
        new Prasatko().start();
    }
}

