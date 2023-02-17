package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class Prasatko {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        nakresliPrasatko();

        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(400);
    }


    private void nakresliPrasatko() {
        nakresliCtverec();

        nakresliStrechu();

        zofka.turnRight(105);

        naklesliNohu();

        // pohyb dozadu k dokreslení nohy
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(135);
        zofka.move(100);            // je na konci čtverce
        zofka.turnRight(135);     // kreslení nohy zadní levá část
        zofka.penDown();

        naklesliNohu();
    }





    private void naklesliNohu() {
        zofka.move(30); // kreslení nohy levá část
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(90); //kreslení nohy pravá část
        zofka.penDown();
        zofka.move(30);
    }

    private void nakresliStrechu() {
        for (int i = 0; i < 2; i++) {
             zofka.turnLeft(120);
             zofka.move(100);
         }
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {

           zofka.turnRight(90);
           zofka.move(100);
       }
    }

    public static void main(String[] args) {
        new Prasatko().start();
    }
}

