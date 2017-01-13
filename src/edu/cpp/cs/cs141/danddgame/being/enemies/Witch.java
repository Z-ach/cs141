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
