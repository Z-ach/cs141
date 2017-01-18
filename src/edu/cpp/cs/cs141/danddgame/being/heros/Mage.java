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
package edu.cpp.cs.cs141.danddgame.being.heros;

import edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy;

/**
 * The Mage is a character that can be played, and as such inherits other traits and behaviors from the GeneralCharacter class.
 * Mages have two unique behaviors to them, which are casting fireballs and healing themselves with magic.
 * 
 * @author Zach Kaufman
 */
public class Mage extends GeneralCharacter {

	/**
	 * The constructor for the {@link Mage} hero. This constructor initializes a {@link GeneralCharacter} with heroType {@code Mage}.
	 * Mages use intelligence to fight enemies, and thus the class initializes the {@link GeneralCharacter} with additional
	 * intelligence.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Mage(String name, String gender) {
		super(name, gender, "Mage");
		addIntelligence(10);
	}
	

	/**
	 * This method is the main attack for the {@link Mage}. Every time this method is called, it will deal some sort of
	 * damage to its target.
	 * 
	 * @param target the recipient of the {@link Mage}'s attack.
	 * @return the amount of damage to deal to the target
	 */
	public int castFireball(GeneralEnemy target){
		return 0;
	}
	
	/**
	 * This method is the support skill for the {@link Mage}. Every time this method is called, it will heal a certain amount of
	 * health to the player.
	 * 
	 * @param amount the amount of health to restore to the player
	 */
	public void heal(int amount){
		
	}
	

}
