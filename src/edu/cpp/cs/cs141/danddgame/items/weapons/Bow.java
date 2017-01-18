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

public class Bow extends GeneralWeapon {

	
	private final static int WEAPON_ATTACK = 6;
	private final static int WEIGHT = 2;
	
	/**
	 * All aspects are explained in {@link edu.cpp.cs.cs141.danddgame.items.weapons.GeneralWeapon}.
	 */
	public Bow() {
		super("Bow", WEAPON_ATTACK, WEIGHT);		
	}

}