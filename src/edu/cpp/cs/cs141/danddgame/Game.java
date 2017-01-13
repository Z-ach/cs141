/**
 * 
 */
package edu.cpp.cs.cs141.danddgame;

import edu.cpp.cs.cs141.danddgame.being.heros.Mage;

/**
 * @author Zach Kaufman
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mage m = new Mage("Zach", "Male");
		m.levelUp();
	}

}
