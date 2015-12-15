package org.firebears;

import edu.wpi.first.wpilibj.IterativeRobot;
import org.firebears.util.*;

/**
 * Test program for connecting the roboRIO to a 20 x 4 character LCD panel
 * through I2C.
 */
public class Robot extends IterativeRobot {

	LiquidCrystal lcd;
	long timeout;
	long n = 0;

	public void robotInit() {
		lcd = new LiquidCrystal_roboRio(0x27);
		lcd.begin(20, 4);
		lcd.clear();
		timeout = System.currentTimeMillis() + 1000;
	}

	public void autonomousPeriodic() {
	}

	public void teleopPeriodic() {
		if (System.currentTimeMillis() > timeout) {
			lcd.home();
			lcd.print("Hello world");
			lcd.setCursor(0, 1);
			lcd.print("Your lucky number is ");
			lcd.setCursor(0, 2);
			lcd.print("" + (n++));
			timeout = System.currentTimeMillis() + 1000;
		}
	}

	public void testPeriodic() {
	}

}
