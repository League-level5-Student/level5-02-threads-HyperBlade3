package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		Robot robot1 = new Robot();
		Robot robot2 = new Robot();
		Robot robot3 = new Robot();
		Robot robot4 = new Robot();
		Robot robot5 = new Robot();
		
		
		
		robot1.setX(100);
		robot1.setY(200);
		
		
		robot2.setX(250);
		robot2.setY(200);
		robot3.setX(400);
		robot3.setY(200);
		robot4.setX(175);
		robot4.setY(250);
		robot5.setX(325);
		robot5.setY(250);

		Thread r1 = new Thread(() -> {

			for (int i = 0; i < 360; i++) {
				robot1.turn(1);
				robot1.move(1);
			}

		});
		Thread r2 = new Thread(() -> {

			for (int i = 0; i < 360; i++) {
				robot2.turn(1);
				robot2.move(1);
			}

		});
		Thread r3 = new Thread(() -> {

			for (int i = 0; i < 360; i++) {
				robot3.turn(1);
				robot3.move(1);
			}

		});
		Thread r4 = new Thread(() -> {

			for (int i = 0; i < 360; i++) {
				robot4.turn(1);
				robot4.move(1);
			}

		});
		Thread r5 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				robot5.turn(1);
				robot5.move(1);

			}
		});
		robot1.hide();
		robot2.hide();
		robot3.hide();
		robot4.hide();
		robot5.hide();
		robot1.setRandomPenColor();
		robot1.penDown();
		robot2.setRandomPenColor();
		robot2.penDown();
		robot3.setRandomPenColor();
		robot3.penDown();
		robot4.setRandomPenColor();
		robot4.penDown();
		robot5.setRandomPenColor();
		robot5.penDown();
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	
	}

	


}

