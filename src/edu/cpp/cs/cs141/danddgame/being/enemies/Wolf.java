/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #1
 *
 * create and design architecture for dnd video game
 *
 * Zachary Kaufman
 */
package edu.cpp.cs.cs141.danddgame.being.enemies;

import edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter;

public class Wolf extends GeneralEnemy {
	
	/**
	 * This field represents how much experience the {@link GeneralEnemy} contains. This value will be given to a
	 * {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter} when this {@link GeneralEnemy} is killed.
	 * 
	 * @see #getExperience()
	 */
	private final static int EXPERIENCE = 5;
	
	/**
	 * This is the constructor for the {@link Wolf} enemy. {@link Wolf} is a subclass of {@link GeneralEnemy}, so it
	 * inherits everything within it. The {@link Wolf} enemy is designed to have more accuracy than other enemies,
	 * so this constructor adds additional accuracy.
	 * 
	 * @see edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy#GeneralEnemy(String, int)
	 */
	public Wolf() {
		super("Wolf", EXPERIENCE);
		addAccuracy(4);
	}
	
	
	/**
	 * This method is the main attack for the {@link Wolf}. Every time this method is called, it will deal some sort of
	 * damage to its target.
	 * 
	 * @param target the recipient of the {@link Wolf}'s attack.
	 * @return the amount of damage to deal to the target
	 */
	public int bite(GeneralCharacter target){
		return 0;
	}
	
	

}
