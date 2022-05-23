package Cars_UML;

import Cars_UML.Masserati;

public class Startclass{
    public static void main(String[] args)
	{
        Engine motor1 = new Engine(false);

        // Creating an object of Maserati class
        Masserati quattroporte = new Masserati("red", 200, motor1,  2010, "manolo");
  
        // Calling MaseratiStartDemo() over
        // object of Maserati class
        quattroporte.MaseratiStartDemo();

        Engine motor2 = new Engine(false);

        // Creating an object of Seat class
        Seat leon = new Seat("blue", 180, motor2, "MundiAuto: Zona Franca, BCN");
  
        // Calling SeatStoppemo() over
        // object of Seat class
        leon.SeatStopDemo();

    }
}


