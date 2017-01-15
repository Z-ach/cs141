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

import edu.cpp.cs.cs141.danddgame.being.Being;

public abstract class GeneralEnemy extends Being{

	
	/**
	 * How much experience the enemy yields when killed.
	 */
	private int experience;
	
	
	public GeneralEnemy(String name, int experience) {
		super(name);
		
		//starting health for all enemies
		addHealthTotal(50);
		addHealthCurrent(50);
		
		//starting mana for all enemies
		addManaTotal(10);
		addManaCurrent(10);
		
		//starting values for basic stats
		addDefense(1);
		addAvoid(1);
		addAccuracy(1);
		
		this.experience = experience;
	}
	
	
	/**
	 * Gets the experience earned when killed
	 * 
	 * @return experience earned when killed
	 */
	public int getExperience(){
		return experience;
	}
	

}
