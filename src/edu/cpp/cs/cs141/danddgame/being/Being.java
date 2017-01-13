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

package edu.cpp.cs.cs141.danddgame.being;

import edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy;

public abstract class Being {

	/**
	 * This field represents the current health of a {@link Being}. Initially {@code 0},
	 * can only be changed by the methods {@link #addHealthCurrent(int)} or {@link #takeDamage(int)}.
	 * If this value reaches 0, the {@link Being} will die.
	 */
	private int healthCurrent;
	
	
	/**
	 * This field represents the total health of a {@link Being}. Initially {@code 0},
	 * can only be changed by the method {@link #addHealthCurrent(int)}.
	 */
	private int healthTotal;
	
	
	/**
	 * This field represents the current mana of a {@link Being}. Initially {@code 0},
	 * can only be changed by the methods {@link #addManaCurrent(int)}.
	 * If this value reaches 0, the {@link Being} will no longer be able to use skills.
	 */
	private int manaCurrent;
	
	
	/**
	 * This field represents the total mana of a {@link Being}. Initially {@code 0},
	 * can only be changed by the method {@link #addManaTotal(int)}.
	 */
	private int manaTotal;
	
	
	/**
	 * The level of the {@link Being}. Initially {@code 1}, can only be changed by methods that inherit this class.
	 * 
	 * @see edu.cpp.cs.cs141.danddgame.being.heros.GeneralCharacter#levelUp()
	 */
	private int level;
	
	/**
	 * This field represents the avoidability of the {@link Being}. Initially {@code 0}, can only be changed by
	 * the method {@link #addAvoid(int)}. This effects how often the being is hit by another {@link Being}.
	 */
	private int avoid;
	
	
	/**
	 * This field represents the accuracy of the {@link Being}. Initially {@code 0}, can only be changed by
	 * the method {@link #addAccuracy(int)}. This effects how often the {@link Being} can hit another {@link Being}.
	 * 
	 * @see #attack()
	 */
	private int accuracy;
	
	
	/**
	 * This field represents the defense of the {@link Being}. Initially {@code 0}, can only be changed by
	 * the method {@link #addDefense(int)}. This effects how much damage the {@link Being} will take.
	 * 
	 * @see #takeDamage(int)
	 */
	private int defense;
	
	/**
	 * This field represents the attack power of the {@link Being}. Initially {@code 0}, can only be changed by
	 * the method {@link #addAttackPower(int)}. This effects how much damage the {@link Being} will deal.
	 */
	private int attackPower;

	
	/**
	 * This field represents the name of a {@link Being}. Initially set to the {@code String} value required by
	 * the constructor {@link #Being(String)}. The name cannot be changed once set.
	 */
	private String name;
	
	
	
	public Being(String name) {
		this.name = name;
		
		//initializes all variables
		healthCurrent = 0;
		healthTotal = 0;
		manaCurrent = 0;
		manaTotal = 0;
		level = 1;
		defense = 0;
		avoid = 0;
		accuracy = 0;
		attackPower = 0;
	}
	
	
	
	/**
	 * This method moves the {@link Being} in a specified {@code direction}.
	 * 
	 * @param direction 0 for reverse, 1 for forward, 2 for left, 3 for right
	 */
	public void walk(int direction){
		
	}
	
	/**
	 * This method will attack whatever is directly in front of the {@link Being}.
	 * 
	 * @return The amount of damage to inflict
	 */
	public int attack(GeneralEnemy target){
		return 0;
	}
	
	/**
	 * Reduces the <code>healthCurrent</code> of the being by a certain amount.
	 * 
	 * @param damage How much damage to subtract from being's current health.
	 */
	public void takeDamage(int damage){
		
	}
	
	/**
	 * Adds a set amount of health to the {@link Being} total, and increases the starting amount too. Useful so two calls
	 * aren't required to increase both total health and current health.
	 * 
	 * @param add the amount of health to add to the {@link Being} base health
	 * @see #addHealthCurrent(int)
	 * @see #addHealthTotal(int)
	 */
	public void addBaseHealth(int add){
		addHealthTotal(add);
		addHealthCurrent(add);
	}
	
	/**
	 * adds a set amount of health to the being's total health
	 * 
	 * @param add the amount of health to add
	 */
	public void addHealthTotal(int add){
		healthTotal += add;
	}
	
	
	/**
	 * Gets the being's total health
	 * 
	 * @return being's total health
	 */
	public int getHealthTotal(){
		return healthTotal;
	}
	
	/**
	 * heals the being
	 * 
	 * @param add the amount of health to recover
	 */
	public void addHealthCurrent(int add){
		healthCurrent += add;
	}
	
	/**
	 * Gets the being's current health
	 * 
	 * @return being's current health
	 */
	public int getHealthCurrent(){
		return healthCurrent;
	}
	
	/**
	 * Adds a set amount of mana to the being's total, and increases the starting amount too. Useful so two calls
	 * aren't required to increase both total mana and current mana.
	 * 
	 * @param add the amount of mana to add to the being's base mana
	 */
	public void addBaseMana(int add){
		addManaTotal(add);
		addManaCurrent(add);
	}
	
	/**
	 * adds a set amount of mana to the being's total mana
	 * 
	 * @param add the amount of mana to add
	 */
	public void addManaTotal(int add){
		manaTotal += add;
	}
	
	/**
	 * Gets the being's total mana
	 * 
	 * @return being's total mana
	 */
	public int getManaTotal(){
		return manaTotal;
	}
	
	/**
	 * recovers mana
	 * 
	 * @param add the amount of mana to recover
	 */
	public void addManaCurrent(int add){
		manaCurrent += add;
	}
	
	/**
	 * Gets the being's current mana
	 * 
	 * @return being's current mana
	 */
	public int getManaCurrent(){
		return manaCurrent;
	}
	
	
	/**
	 * Gets the being's current level
	 * 
	 * @return the being's current level
	 */
	public int getLevel(){
		return level;
	}
	
	/**
	 * Adds to the being's <code>avoid</code> stat
	 * 
	 * @param add the amount of <code>avoid</code> to add
	 */
	public void addAvoid(int add){
		avoid += add;
	}
	
	/**
	 * Gets the being's current <code>avoid</code>.
	 * 
	 * @return being's <code>avoid</code>
	 */
	public int getAvoid(){
		return avoid;
	}
	
	/**
	 * Adds to the being's <code>accuracy</code> stat
	 * 
	 * @param add the amount of <code>accuracy</code> to add
	 */
	public void addAccuracy(int add){
		accuracy += add;
	}
	
	/**
	 * Gets the being's current <code>accuracy</code>.
	 * 
	 * @return being's <code>accuracy</code>
	 */
	public int getAccuracy(){
		return accuracy;
	}
	
	/**
	 * Adds to the being's <code>defense</code> stat
	 * 
	 * @param add the amount of <code>defense</code> to add
	 */
	public void addDefense(int add){
		defense += add;
	}
	
	/**
	 * Gets the being's current <code>defense</code>.
	 * 
	 * @return being's <code>defense</code>
	 */
	public int getDefense(){
		return defense;
	}
	
	/**
	 * Adds to the being's current attack power
	 * 
	 * @param add the amount of attack power to add
	 */
	public void addAttackPower(int add){
		attackPower += add;
	}
	
	/**
	 * Gets the being's current attack power.
	 * 
	 * @return the being's current attack power.
	 */
	public int getAttackPower(){
		return attackPower;
	}

}
