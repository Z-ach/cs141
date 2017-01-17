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
	 * Constructor for the Warrior hero. It assigns a name and gender to the character, and adds additional strength.
	 * Warriors are very strong and have high health points. They have the lowest mana of any class though.
	 * 
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Warrior(String name, String gender) {
		super(name, gender, "Warrior");
		addStrength(10);
	}
	
	/**
	 * Swings weapon at an enemy. Damage depends on character's strength and the weapon's attack.
	 */
	public void powerAttack(){
		
	}
	
	/**
	 * Blocks an incoming attack. 
	 */
	public void block(){
		
	}

}
