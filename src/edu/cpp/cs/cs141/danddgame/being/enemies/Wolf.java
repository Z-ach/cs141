/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being.enemies;

/**
 * @author Zach Kaufman
 *
 */
public class Wolf extends GeneralEnemy {
	
	/**
	 * How much experience a player gets from killing this enemy.
	 */
	private final static int EXPERIENCE = 5;
	
	/**
	 * Wolf constructor. Makes a call to GeneralEnemy which calls Being, and assigns it a name.
	 * 
	 */
	public Wolf() {
		super("Wolf", EXPERIENCE);
		addAccuracy(4);
	}
	
	/**
	 * Attacks the character for a set amount of damage.
	 */
	public void bite(){
		
	}
	
	

}
