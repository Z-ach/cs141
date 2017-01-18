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

public class Warrior extends GeneralCharacter {

	/**
	 * The constructor for the {@link Warrior} hero. This constructor initializes a {@link GeneralCharacter} with heroType 
	 * {@code Warrior}. Warriors use strength to fight enemies, and thus the class initializes the {@link GeneralCharacter} 
	 * with additional strength.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Warrior(String name, String gender) {
		super(name, gender, "Warrior");
		addStrength(10);
	}
	
	/**
	 * This method is the main attack for the {@link Warrior}. Every time this method is called, it will deal some sort of
	 * damage to its target.
	 * 
	 * @param target the recipient of the {@link Warrior}'s attack.
	 * @return the amount of damage to deal to the target
	 */
	public int powerAttack(){
		return 0;
	}
	
	/**
	 * This method is the support skill for the {@link Warrior}. Every time this method is called, it will block a certain amount of
	 * damage from an incoming attack.
	 * 
	 * @param amount the amount of damage the shield has absorbed
	 */
	public int block(){
		return 0;
	}

}
