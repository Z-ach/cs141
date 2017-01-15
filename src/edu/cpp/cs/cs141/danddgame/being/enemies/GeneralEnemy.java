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
	 * This field represents how much experience the {@link GeneralEnemy} contains. This value will be given to a
	 * {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter} when this {@link GeneralEnemy} is killed.
	 */
	private int experience;
	
	
	/**
	 * This method is the constructor for the {@link GeneralEnemy}. This is a subclass of {@link Being}, and inherits
	 * many methods and fields from it. The constructor initializes fields for a specific enemy. It also assigns a value
	 * to the {@link GeneralEnemy}'s experience.
	 * 
	 * @param name the name of the enemy
	 * @param experience how much exp the {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter} will gain 
	 * when this {@link GeneralEnemy} is killed.
	 */
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
	 * This method gets the experience earned when killed for a {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter}
	 * 
	 * @return experience earned when killed
	 */
	public int getExperience(){
		return experience;
	}
	
	
	/**
	 * This method checks to see whether or not the {@link GeneralEnemy} is still alive.
	 * 
	 * @return whether or not the {@link GeneralEnemy} is alive
	 */
	public boolean isDead(){
		return false;
	}
	

}
