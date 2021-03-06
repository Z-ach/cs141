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

/**
 * This class represents the general items within the game. Any item is bound to have similar traits between them, and as such 
 * they are here in a centralized form. The items don't have behaviors because they're inanimate objects, but they have fields
 * that can be shared between them.
 * 
 * @author Zach Kaufman
 */
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
	 * Cannot be changed once set.
	 */
	private String name;
	
	/**
	 * Constructor for the {@link GeneralItem} object. This is the superclass to all items, so all items will inherit all methods and
	 * fields created here.
	 * 
	 * @param consumable whether or not the item is consumable. {@code true} for yes, {@code false} for no
	 * @param equippable whether or not the item can be equipped. {@code true} for yes, {@code false} for no
	 * @param name the name of the item, used to identify it in the game
	 */
	public GeneralItem(boolean consumable, boolean equippable, String name){
		this.consumable = consumable;
		this.equippable = equippable;
		this.name = name;
	}
	
	
	
}