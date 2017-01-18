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
package edu.cpp.cs.cs141.danddgame.items.potions;

import edu.cpp.cs.cs141.danddgame.items.GeneralItem;

public abstract class Potion extends GeneralItem {

	/**
	 * This field indicates what is restored when consumed. If it is {@code true}, then it restores mana. If it is {@code false},
	 * then it does not restore mana. This will be set by the subclass, and cannot be changed once set.
	 */
	private boolean mana;
	
	
	/**
	 * This field indicates whether or not it is a health potion. If it is {@code true}, then it is. If it is {@code false}, then 
	 * it is not. This is set by the subclass, and cannot be changed once set.
	 */
	private boolean health;
	
	/**
	 * The amount the {@link Potion} will restore. It will restore this quantity of whatever boolean is {@code true}. If both mana
	 * and health are {@code true}, it will restore both. It is set by the subclass, and cannot be changed later.
	 */
	private int restore;
	

	/**
	 * @param name the name of the potion, used to identify it once in game
	 * @param mana whether or not it restores mana. {@code true} if yes, {@code false} if no.
	 * @param health whether or not it restores health. {@code true} if yes, {@code false} if no.
	 * @param restore the amount of points to restore
	 */
	public Potion(String name, boolean mana, boolean health, int restore) {
		super(true, false, name);
		this.mana = mana;
		this.health = health;
		this.restore = restore;
	}

}
