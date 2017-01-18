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

import edu.cpp.cs.cs141.danddgame.items.GeneralItem;

/**
 * This class represents the generalized form of a weapon. All weapons have similar attributes and behaviors, which are represented within 
 * this class. All weapons have a set amount of weapon attack they provide, a certain amount of weight, a durability, and either work or don't
 * work. Additionally, all weapons can be repaired, and all weapons can take wear. All weapons can also break, at which point they will need
 * to be repaired.
 * 
 * @author Zach Kaufman
 */
public abstract class GeneralWeapon extends GeneralItem {
	
	/**
	 * The amount of attack the {@link GeneralWeapon} adds to the {@link edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter}'s attack.
	 * Will be set by the individual weapon objects that inherit this class.
	 */
	private int weaponAttack;
	
	/**
	 * This field represents how heavy this {@link GeneralWeapon} is. Will be set by the subclass.
	 */
	private int weight;
	
	/**
	 * This field represents how much wear and tear the {@link GeneralWeapon} has endured. Initially set to {@code 100}.Will be incremented down
	 * by {@link #use(int amount)}, which will deduct the amount passed in by the parameter. Can be brought back to full value by {@link #repair()}.
	 */
	private int durability;
	
	/**
	 * This field represents whether or not the {@link GeneralWeapon} is broken. If it is broken, it will be unusable until {@link #repair()} is
	 * called. This value initially is set to {@code false}, and will be set to {@code true} if durability reaches {@code 0}.
	 */
	private boolean broken;
	
	/**
	 * Constructor for {@link GeneralWeapon}. This class is abstract and will serve as a superclass to actual weapons that can be initialized
	 * and therefore used in the game.
	 * 
	 * @param name the name of the {@link GeneralWeapon}.
	 * @param weaponAttack the amount of attack the weapon adds
	 * @param weight how heavy the weapon is
	 */
	public GeneralWeapon(String name, int weaponAttack, int weight) {
		super(false, true, name);
		this.weaponAttack = weaponAttack;
		this.weight = weight;
		durability = 100;
	}
	
	/**
	 * This method uses the {@link GeneralWeapon} and removes {@link #durability} from the {@link GeneralWeapon}. If {@link #broken} is {@code false},
	 * it will work as normal. If {@link #broken} is {@code true}, this will not work.
	 * 
	 * @param amount how much durability will be deducted from the {@link GeneralWeapon}.
	 */
	public void use(int amount){
		
	}
	
	/**
	 * This method restores the {@link GeneralWeapon} to its original full {@link #durability}. Additionally, {@link #broken} will be set back to 
	 * {@code false}.
	 */
	public void repair(){
		
	}

}
