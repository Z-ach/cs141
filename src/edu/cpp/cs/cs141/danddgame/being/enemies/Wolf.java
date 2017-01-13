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
