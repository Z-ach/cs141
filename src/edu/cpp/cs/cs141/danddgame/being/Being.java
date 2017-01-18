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
	 * @see Being#attack(GeneralEnemy)
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
	 * This method gets the name of the {@link Being}. The name is created through the constructor of a subclass,
	 * which then makes a call to {@link Being}, where it is permanently set.
	 * 
	 * @return the name of the {@link Being}.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * This method moves the {@link Being} in a specified {@code direction}.
	 * 
	 * @param direction {@code 0} for reverse, {@code 1} for forward, {@code 2} for left, {@code 3} for right
	 */
	public void walk(int direction){
		
	}
	
	/**
	 * This method will attack the {@code target} for an amount which will be returned
	 * by this method. 
	 * 
	 * @param target The enemy that will be attacked
	 * @return The amount of damage to inflict on the target
	 * @see edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy
	 */
	public int attack(GeneralEnemy target){
		return 0;
	}
	
	/**
	 * This method will reduce the amount of health of the {@link Being}. Will be used when
	 * {@link Being} is attacked.
	 * 
	 * @param damage How much damage to subtract from being's current health.
	 * @see #attack(GeneralEnemy)
	 */
	public void takeDamage(int damage){
		
	}
	
	/**
	 * This method adds a set amount of health to the {@link Being}'s total, and increases the starting amount too.
	 * Useful so two calls aren't required to increase both total health and current health.
	 * 
	 * @param add the amount of health to add to the {@link Being} base health.
	 * @see #addHealthCurrent(int)
	 * @see #addHealthTotal(int)
	 */
	public void addBaseHealth(int add){
		addHealthTotal(add);
		addHealthCurrent(add);
	}
	
	/**
	 * This method adds a set amount of health to the {@link Being}'s total health.
	 * 
	 * @param add the amount of health to add the {@link Being}'s total health.
	 */
	public void addHealthTotal(int add){
		healthTotal += add;
	}
	
	
	/**
	 * This method will return the {@link Being}'s total health.
	 * 
	 * @return the {@link Being}'s total health.
	 */
	public int getHealthTotal(){
		return healthTotal;
	}
	
	/**
	 * This method will heal the {@link Being} for a set amount.
	 * 
	 * @param add the amount of health the {@link Being} will recover.
	 */
	public void addHealthCurrent(int add){
		healthCurrent += add;
	}
	
	/**
	 * This method will return the current health of the {@link Being}.
	 * 
	 * @return the current amount of health of the {@link Being}
	 */
	public int getHealthCurrent(){
		return healthCurrent;
	}
	
	/**
	 * Adds a set amount of mana to the {@link Being}'s total, and increases the starting amount too. Useful so two calls
	 * aren't required to increase both total mana and current mana.
	 * 
	 * @param add the amount of mana to add to the {@link Being}'s base mana
	 * @see #addManaCurrent(int)
	 * @see #addManaTotal(int)
	 */
	public void addBaseMana(int add){
		addManaTotal(add);
		addManaCurrent(add);
	}
	
	/**
	 * This method adds a set amount of mana to the {@link Being}'s total mana.
	 * 
	 * @param add the amount of mana to add the {@link Being}'s total mana.
	 */
	public void addManaTotal(int add){
		manaTotal += add;
	}
	
	/**
	 * This method will return the {@link Being}'s total mana.
	 * 
	 * @return the {@link Being}'s total mana.
	 */
	public int getManaTotal(){
		return manaTotal;
	}
	
	/**
	 * This method will increase the current mana amount of the {@link Being}.
	 * 
	 * @param add the amount of mana the {@link Being} will recover.
	 */
	public void addManaCurrent(int add){
		manaCurrent += add;
	}
	
	/**
	 * This method will return the current mana of the {@link Being}.
	 * 
	 * @return the current amount of mana of the {@link Being}
	 */
	public int getManaCurrent(){
		return manaCurrent;
	}
	
	
	/**
	 * This method will get the {@link Being}'s current level
	 * 
	 * @return the {@link Being}'s current level
	 */
	public int getLevel(){
		return level;
	}
	
	/**
	 * This method adds to the {@link Being}'s current {@code avoid} stat
	 * 
	 * @param add the amount of {@code avoid} to add
	 */
	public void addAvoid(int add){
		avoid += add;
	}
	
	/**
	 * This method gets the {@link Being}'s current {@code avoid}.
	 * 
	 * @return the {@link Being}'s current {@code avoid}.
	 */
	public int getAvoid(){
		return avoid;
	}
	
	/**
	 * This method adds to the {@link Being}'s current {@code accuracy} stat
	 * 
	 * @param add the amount of {@code accuracy} to add
	 */
	public void addAccuracy(int add){
		accuracy += add;
	}
	
	/**
	 * This method gets the {@link Being}'s current {@code accuracy}.
	 * 
	 * @return the {@link Being}'s current {@code accuracy}.
	 */
	public int getAccuracy(){
		return accuracy;
	}
	
	/**
	 * This method adds to the {@link Being}'s current {@code defense} stat
	 * 
	 * @param add the amount of {@code defense} to add
	 */
	public void addDefense(int add){
		defense += add;
	}
	
	/**
	 * This method gets the {@link Being}'s current {@code defense}.
	 * 
	 * @return the {@link Being}'s current {@code defense}.
	 */
	public int getDefense(){
		return defense;
	}
	
	/**
	 * This method adds to the {@link Being}'s current {@code attackPower} stat
	 * 
	 * @param add the amount of {@code attackPower} to add
	 */
	public void addAttackPower(int add){
		attackPower += add;
	}
	
	/**
	 * This method gets the {@link Being}'s current {@code attackPower}.
	 * 
	 * @return the {@link Being}'s current {@code attackPower}.
	 */
	public int getAttackPower(){
		return attackPower;
	}

}
