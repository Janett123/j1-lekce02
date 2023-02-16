package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class Prasatko {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

// kresleni ctverce
        nakresliCtverec();

        nakresliStrechu();

        zofka.turnRight(105); // kreslení nohy přední levá část
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(90); //kreslení nohy přední pravá část
        zofka.penDown();
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(135);
        zofka.move(100); // je na konci čtverce
        zofka.turnRight(135); // kreslení nohy zadní levá část
        zofka.penDown();
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(30);
        zofka.turnRight(90); //kreslení nohy zadní pravá část
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

