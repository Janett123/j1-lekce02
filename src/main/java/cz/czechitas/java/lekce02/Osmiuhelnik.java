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
/*
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
*/
            //písmeno Ž
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(141.4);
        zofka.turnLeft(135);
        zofka.move(100);

        zofka.turnRight(180); //háček
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(135);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(30);

        //posun pro kreslení A
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);


        //kreslení A
        zofka.turnLeft(64);
        zofka.penDown();
        zofka.move(111.8);
        zofka.turnRight(128);
        zofka.move(111.8);
        zofka.turnRight(116);
        zofka.penUp();

        //kreslení háčku nad A
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(26);
        zofka.turnLeft(180);
        zofka.penDown();
        zofka.move(52);













}

    public static void main(String[] args) {
        new Osmiuhelnik().start();
    }

}
