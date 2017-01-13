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
	 * 
	 */
	public Wolf() {
		super("Wolf", EXPERIENCE);
		
	}
	
	

}
