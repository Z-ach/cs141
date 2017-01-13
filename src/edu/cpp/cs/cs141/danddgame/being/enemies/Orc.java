/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being.enemies;

/**
 * @author Zach Kaufman
 *
 */
public class Orc extends GeneralEnemy {

	/**
	 * How much experience a player gets from killing this enemy.
	 */
	private final static int EXPERIENCE = 5;
	
	/**
	 * Witch constructor. Makes a call to GeneralEnemy which calls Being, and assigns it a name.
	 * 
	 */
	public Orc() {
		super("Orc", EXPERIENCE);
		addDefense(4);
	}
	
	/**
	 * Smashes the character, deals a set amount of damage
	 */
	public void smash() {

	}

}
