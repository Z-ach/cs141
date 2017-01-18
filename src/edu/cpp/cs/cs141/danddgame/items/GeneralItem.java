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
package edu.cpp.cs.cs141.danddgame.items;

public abstract class GeneralItem {
	
	/**
	 * This field represents whether or not the {@link GeneralItem} can be consumed. Initially {@code true} or {@code false}. 
	 * This field is set by the constructor, and cannot be changed once set.
	 */
	private boolean consumable;
	
	/**
	 * This field represents whether or not the {@link GeneralItem} can be equipped. Initially {@code true} or {@code false}. 
	 * This field is set by the constructor, and cannot be changed once set.
	 */
	private boolean equippable;
	
	/**
	 * This field represents the name of the {@link GeneralItem}. Will be set by the constructor, which is called by the subclass.
	 */
	private String name;
	
	/**
	 * Constructor for the {@link GeneralItem} object. This is the superclass to all items, so all items will inherit all methods and
	 * fields created here.
	 */
	public GeneralItem(boolean consumable, boolean equippable, String name){
		this.consumable = consumable;
		this.equippable = equippable;
		this.name = name;
	}
	
	
	
}