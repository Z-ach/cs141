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
 * The witch is an enemy, and thus must inherit all traits and behaviors that are shared between enemies. The witch
 * has her own set amount of experience that is given out when she is slain, which is unique to the witch. Also unique
 * to the witch is her ability to cast a spell, which is a method found within this class.
 * 
 * @author Zach Kaufman
 */
public class Witch extends GeneralEnemy {

	/**
	 * This field represents how much experience the {@link GeneralEnemy} contains. This value will be given to a
	 * {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter} when this {@link GeneralEnemy} is killed.
	 * 
	 * @see #getExperience()
	 */
	private final static int EXPERIENCE = 5;
	
	/**
	 * This is the constructor for the {@link Witch} enemy. {@link Witch} is a subclass of {@link GeneralEnemy}, so it
	 * inherits everything within it. The {@link Witch} enemy is designed to have more avoid than other enemies,
	 * so this constructor adds additional avoid.
	 * 
	 * @see edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy#GeneralEnemy(String, int)
	 */
	public Witch() {
		super("Witch", EXPERIENCE);
		addAvoid(4);
	}


	/**
	 * This method is the main attack for the {@link Witch}. Every time this method is called, it will deal some sort of
	 * damage to its target.
	 * 
	 * @param target the recipient of the {@link Witch}'s attack.
	 * @return the amount of damage to deal to the target
	 */
	public int castSpell(GeneralCharacter target) {
		return 0;
	}

}
