package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

     /*
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
      */

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(500);
        zofka.penDown();
        zofka.turnRight(90);

        nakresliDomecek();
    }

    private void nakresliDomecek() {

        nakresliCtverec();

        zofka.turnLeft(90);

        nakresliStrechu();
    }

    private void nakresliStrechu() {
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
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
        new HlavniProgram().start();
    }

}
