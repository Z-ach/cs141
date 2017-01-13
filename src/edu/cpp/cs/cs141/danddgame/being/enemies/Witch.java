/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being.enemies;

/**
 * @author Zach Kaufman
 *
 */
public class Witch extends GeneralEnemy {

	/**
	 * How much experience a player gets from killing this enemy.
	 */
	private final static int EXPERIENCE = 5;
	
	/**
	 * Witch constructor. Makes a call to GeneralEnemy which calls Being, and assigns it a name.
	 * 
	 */
	public Witch() {
		super("Witch", EXPERIENCE);
		addAvoid(4);
	}

	/**
	 * Casts a spell on the character, deals a set amount of damage
	 */
	public void castSpell() {

	}

}
