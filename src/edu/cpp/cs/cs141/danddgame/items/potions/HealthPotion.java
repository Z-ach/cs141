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
package edu.cpp.cs.cs141.danddgame.items.potions;

/**
 * This class represents health potions, which as the name suggests, are a type of potion. As such, it inherits the attributes
 * from the potion class, so as to not repeat code over again. The only unique field to this class is the amount of health it
 * restores.
 * 
 * @author Zach Kaufman
 */
public class HealthPotion extends Potion {

	private static final int RESTORE = 100;
	
	/**
	 * Creates a health potion, and assigns values for the superclass's constructor
	 */
	public HealthPotion() {
		super("Health Potion", false, true, RESTORE);
	}

}
