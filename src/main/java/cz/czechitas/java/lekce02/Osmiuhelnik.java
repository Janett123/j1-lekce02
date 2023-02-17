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
        zofka.turnRight(130);
        zofka.move(156.2);
        zofka.turnLeft(130);
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
        zofka.move(120);
        zofka.turnLeft(90);


        //kreslení A
        zofka.turnLeft(67);
        zofka.penDown();
        zofka.move(130);
        zofka.turnRight(134);
        zofka.move(130);
        zofka.turnRight(113);
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

        //posun dolů ke kreslení N
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(26);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.penDown();

        //kreslení N
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnRight(140);
        zofka.move(156.2);
        zofka.turnLeft(140);
        zofka.move(120);

        //posun ke kreslení E

        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.penDown();

        //kresleni E
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(180);

        for (int i = 0; i < 2; i++) {
            zofka.penUp();
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(60);
            zofka.penDown();
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(180);

        }


        // přesun na kreslení T
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();

        //kreslení T
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.penDown();
        zofka.move(100);

        //přesun na kreslení A
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(50);

        //kreslení A
        zofka.turnLeft(67);
        zofka.penDown();
        zofka.move(130);
        zofka.turnRight(134);
        zofka.move(130);
        zofka.turnRight(113);
        zofka.penUp();

        //kreslení čárky u A
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(26);
        zofka.turnLeft(180);
        zofka.penDown();
        zofka.move(52);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);






        /* zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(100);


         */

















}

    public static void main(String[] args) {
        new Osmiuhelnik().start();
    }

}
