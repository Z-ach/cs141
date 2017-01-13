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

public class Mage extends GeneralCharacter {

	/**
	 * The constructor for the Mage hero.
	 * Mages use intelligence to fight enemies, and have lower health than other heros.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Mage(String name, String gender) {
		super(name, gender);
		addIntelligence(10);
	}
	
	/**
	 * Casts a fireball at an enemy. Damage is dependent on the equipped weapon's attack and the character's intelligence.
	 */
	public void castFireball(){
		
	}
	
	/**
	 * Heals the character by a certain amount, depending on the character's intelligence
	 */
	public void heal(){
		
	}
	

}
