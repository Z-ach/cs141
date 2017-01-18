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

/**
 * The orc is an enemy, so it must have certain attributes and behaviors similar to other enemies. For that reason,
 * it inherits the GeneralEnemy class, which provide it with attributes and behaviors that all enemies share. The orc
 * has a set amount of experience, so it must be declared here. Also, orcs have the ability to smash, which is a behavior
 * unique to them.
 * 
 * @author Zach Kaufman
 */
public class Orc extends GeneralEnemy {

	/**
	 * This field represents how much experience the {@link GeneralEnemy} contains. This value will be given to a
	 * {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter} when this {@link GeneralEnemy} is killed.
	 * 
	 * @see #getExperience()
	 */
	private final static int EXPERIENCE = 5;
	
	/**
	 * This is the constructor for the {@link Orc} enemy. {@link Orc} is a subclass of {@link GeneralEnemy}, so it
	 * inherits everything within it. The {@link Orc} enemy is designed to have more defense than other enemies,
	 * so this constructor adds additional defense.
	 * 
	 * @see edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy#GeneralEnemy(String, int)
	 */
	public Orc() {
		super("Orc", EXPERIENCE);
		addDefense(4);
	}
	

	/**
	 * This method is the main attack for the {@link Orc}. Every time this method is called, it will deal some sort of
	 * damage to its target.
	 * 
	 * @param target the recipient of the {@link Orc}'s attack.
	 * @return the amount of damage to deal to the target
	 */
	public int smash(GeneralCharacter target) {
		return 0;
	}

}
