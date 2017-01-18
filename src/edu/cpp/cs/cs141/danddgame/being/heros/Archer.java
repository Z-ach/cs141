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
 * The Archer is a hero character that the player can play. Since it is a character, it inherits methods and fields from 
 * the GeneralCharacter class. Unique to archer are the attributes associated with quivers and arrows. The archer also has
 * unique behaviors such as reload and shoot arrows.
 * 
 * @author Zach Kaufman
 */
public class Archer extends GeneralCharacter {

	
	/**
	 * This field represents the total number of arrows the quiver is capable of holding. Initially {@code 0}, this field
	 * can only increase by equipping a new quiver, which has yet to be implemented.
	 * 
	 * @see #equip(int)
	 */
	private int quiverCapacity;
	
	/**
	 * This field represents the amount of arrows the quiver currently is holding. Initially {@code 0}. When this number reaches 
	 * {@code 0}, the quiver will need to be reloaded.
	 * 
	 * @see #reloadQuiver()
	 */
	private int quiverCount;
	
	/**
	 * This field represents the current number of arrows the character has. Initially {@code 0}. This number does not include the 
	 * arrows in the quiver.
	 */
	private int arrowCount;
	
	/**
	 * The constructor for the {@link Archer} hero. This constructor initializes a {@link GeneralCharacter} with heroType 
	 * {@code Archer}. Archers use dexterity to fight enemies, and thus the class initializes the {@link GeneralCharacter} 
	 * with additional dexterity.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Archer(String name, String gender) {
		super(name, gender, "Archer");
		addDexterity(10);
		
	}
	
	/**
	 * This method is the main attack for the {@link Archer}. Every time this method is called, it will deal some sort of
	 * damage to its target.
	 * 
	 * @param target the recipient of the {@link Archer}'s attack.
	 * @return the amount of damage to deal to the target
	 */
	public int shootArrow(GeneralEnemy target){
		return 0;
	}
	

	/**
	 * This method reloads the {@link Archer}'s quiver. It will refill the quiver to the full quiver capacity. If there aren't 
	 * enough arrows in the {@link Archer}'s inventory, it will refill as many arrows as it can.
	 */
	public void reloadQuiver(){
		
	}
	
	/**
	 * This method gets the current amount of arrows in the quiver.
	 * 
	 * @return the amount of arrows in the quiver.
	 */
	public int getQuiverCount(){
		return quiverCount;
	}
	
	/**
	 * This method gets the total number of arrows in the {@link Archer}'s inventory. This does not include arrows in the quiver.
	 * 
	 * @return number of arrows in the {@link Archer}'s inventory.
	 */
	public int getArrowCount(){
		return arrowCount;
	}

}
