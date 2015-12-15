package org.firebears.util;

/**
 * Java interface similar to the Arduino's <tt>LiquidCrystal</tt> library.
 *
 * @see https://www.arduino.cc/en/Reference/LiquidCrystal
 */
public interface LiquidCrystal {
	public void begin(int numColumns, int numLines);
	public void clear();
	public void home();
	public void setCursor(int col, int row);
	public void write(int character);
	public void print(String message);
}
