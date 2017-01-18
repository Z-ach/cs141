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

public class Staff extends GeneralWeapon {

	
	private final static int WEAPON_ATTACK = 4;
	private final static int WEIGHT = 3;
	
	/**
	 * All aspects are explained in {@link edu.cpp.cs.cs141.danddgame.items.weapons.GeneralWeapon}.
	 */
	public Staff() {
		super("Staff", WEAPON_ATTACK, WEIGHT);		
	}

}