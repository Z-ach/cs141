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
package edu.cpp.cs.cs141.danddgame.items.weapons;

/**
 * The sword is a weapon, and inherits from GeneralWeapon because of that. Unique to the sword are the 
 * amount of weapon attack, and weight of the sword.
 * 
 * @author Zach Kaufman
 */
public class Sword extends GeneralWeapon {

	
	private final static int WEAPON_ATTACK = 10;
	private final static int WEIGHT = 5;
	
	/**
	 * All aspects are explained in {@link edu.cpp.cs.cs141.danddgame.items.weapons.GeneralWeapon}.
	 */
	public Sword() {
		super("Sword", WEAPON_ATTACK, WEIGHT);		
	}

}