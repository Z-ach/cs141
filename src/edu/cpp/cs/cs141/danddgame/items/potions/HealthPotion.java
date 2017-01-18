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

public class HealthPotion extends Potion {

	private static final int RESTORE = 100;
	
	/**
	 * Creates a health potion, and assigns values for the superclass's constructor
	 */
	public HealthPotion() {
		super("Health Potion", false, true, RESTORE);
	}

}
