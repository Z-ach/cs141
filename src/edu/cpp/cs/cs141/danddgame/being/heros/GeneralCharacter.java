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

import edu.cpp.cs.cs141.danddgame.being.Being;

public abstract class GeneralCharacter extends Being{
	

	/**
	 * This field represents the current exp of the {@link GeneralCharacter}. Initially set to {@code 0}, will increase by calling
	 * {@link #addExp(int)} as enemies are killed by the {@link GeneralCharacter}. Resets to {@code 0} when it equals the experience 
	 * needed to level up, which will trigger {@link #levelUp()}.
	 * 
	 * @see #levelUp()
	 * @see #addExp(int)
	 */
	private int expCurrent;
	
	
	/**
	 * This field represents the current level of the {@link GeneralCharacter}. Initially set to {@code 1}. Will increase by {@code 1} 
	 * every time the {@link #levelUp()} method is called. Level is required to equip certain items and use certain skills.
	 */
	private int level;
	
	
	/**
	 * This field is an array that stores the total exp needed to level up. Once the {@code expCurrent} is equal to the specific array value
	 * that corresponds to the {@link GeneralCharacter}'s level, {@link #levelUp()} will be called.
	 */
	private final static int[] EXP_TOTAL = {150, 250, 350, 450, 600, 800, 1050, 1350, 1700, 2100};
	
	
	/**
	 * This field represents the {@code strength} of the {@link GeneralCharacter}. Initially will be set to {@code 5}, can be increased by
	 * {@link #addStrength(int)}. Will be used as the primary stat for the {@link edu.cpp.cs.cs141.danddgame.being.heros.Warrior} hero.
	 */
	private int strength;
	
	
	/**
	 * This field represents the {@code luck} of the {@link GeneralCharacter}. Initially will be set to {@code 5}, can be increased by
	 * {@link #addLuck(int)}.
	 */
	private int luck;
	
	
	/**
	 * This field represents the {@code dexterity} of the {@link GeneralCharacter}. Initially will be set to {@code 5}, can be increased by
	 * {@link #addDexterity(int)}. Will be used as the primary stat for the {@link edu.cpp.cs.cs141.danddgame.being.heros.Archer} hero.
	 */
	private int dexterity;
	
	
	/**
	 * This field represents the {@code intelligence} of the {@link GeneralCharacter}. Initially will be set to {@code 5}, can be increased by
	 * {@link #addIntelligence(int)}. Will be used as the primary stat for the {@link edu.cpp.cs.cs141.danddgame.being.heros.Mage} hero.
	 */
	private int intelligence;
	
	
	/**
	 * This field represents the {@code reputation} of the {@link GeneralCharacter}. Initially will be set to {@code 10}, can be changed by
	 * {@link #changeReputation(int)}. Will be used in the future to decide what quests will be available.
	 */
	private int reputation;
	
	
	/**
	 * This field represents the total weight of items the {@link GeneralCharacter} can hold.
	 */
	private int carryCap;
	
	
	/**
	 * This field represents the {@link GeneralCharacter}'s amount of gold. Can be changed by {@link #changeGold(int)}. Used to
	 * {@link #buy(int, int, int)} and {@link #sell(int, int, int)}.
	 */
	private int gold;
	
	
	/**
	 * The gender of the {@link GeneralCharacter}. Will be used later on to decide what items the {@link GeneralCharacter} can
	 * {@link #equip(int)}. This value is set in the constructor by the required arguments of 
	 * {@link #GeneralCharacter(String, String, String)}. Once it is set, it cannot be changed.
	 */
	private String gender;
	
	
	/**
	 * The hero type of the {@link GeneralCharacter}. This value is initially set to the character's hero type by the constructor
	 * of that specific hero. The current values this can hold are {@code Archer}, {@code Mage}, or {@code Warrior}. Once it is set,
	 * it cannot be changed. It can be accessed using the {@link #getHeroType()} method. 
	 */
	private String heroType;


	/**
	 * Constructor for {@link GeneralCharacter}. Assigns a {@code name} and a {@code gender} to the {@link GeneralCharacter} and initializes
	 * all basic starting stats and attributes to their respective starting values. {@link GeneralCharacter} is a subclass of {@link Being},
	 * and inherets methods from that superclass.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 * @param heroType The type of hero. Currently limited to {@code Mage}, {@code Warrior}, or {@code Archer}.
	 */
	protected GeneralCharacter(String name, String gender, String heroType) {
		super(name);
		this.gender = gender;
		this.heroType = heroType;
		
		//all characters start at level 1 with 0 current exp
		level = 1;
		expCurrent = 0;
		
		//reputation starts at 10, will go up/down based on actions
		reputation = 10;
		
		//basic stat points - every character starts with these
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		luck = 5;
		
		//starting health for all characters
		addHealthTotal(300);
		addHealthCurrent(300);
		
		//starting mana for all characters
		addManaTotal(100);
		addManaCurrent(100);
		
		//sets gold to 0
		gold = 0;
		
		//starting values for basic stats
		addDefense(5);
		addAvoid(5);
		addAccuracy(5);
		
		//Starting carry capacity for all characters
		carryCap = 10;
	}
	
	
	
	/**
	 * This method gets the hero type of the player. As of the current version, it can only return three values: {@code Archer},
	 * {@code Mage}, or {@code Warrior}, as they are the only hero types currently available.
	 * 
	 * @return the hero type
	 */
	public String getHeroType(){
		return heroType;
	}
	
	
	/**
	 * This method returns the gender of the {@link GeneralCharacter}. 
	 * 
	 * @return gender of {@link GeneralCharacter}.
	 */
	public String getGender(){
		return gender;
	}
	
	
	/**
	 * Makes the character move in a specified direction, at a faster pace than walking.
	 * 
	 * @param speed the speed at which the character travels. {@code 1} for walking, {@code 2} for running, {@code 3} for sprinting
	 * @param direction {@code 0} for reverse, {@code 1} for forward, {@code 2} for left, {@code 3} for right
	 * @see #walk(int)
	 */
	public void sprint(int speed, int direction){
		
	}
	
	
	/**
	 * This method adds a set amount of experience to a {@link GeneralCharacter}. This will happen when an 
	 * {@link edu.cpp.cs.cs141.danddgame.being.enemies.GeneralEnemy} is killed.
	 * 
	 * @param add the amount of experience to add to the {@link GeneralCharacter}.
	 * @see #levelUp()
	 */
	public void addExp(int add){
		expCurrent += add;
	}
	
	/**
	 * This method consumes an item in the {@link GeneralCharacter}'s inventory. The item will then be removed from the
	 * inventory.
	 * 
	 * @param itemID the ID of the item being consumed
	 */
	public void consume(int itemID){
		
	}
	
	
	/**
	 * This method increases the {@link GeneralCharacter}'s {@code level} and resets the {@code expCurrent} back to {@code 0}.
	 */
	public void levelUp(){
		level++;
		expCurrent = 0;
		System.out.printf("You are now level %d\n", level);
	}
	
	/**
	 * This method will recover a percentage of the {@link GeneralCharacter}'s health per hour sleeping.
	 * 
	 * @param duration How long the character will sleep for.
	 */
	public void sleep(int duration){
		
	}
	
	/**
	 * This method buys an item from a vendor and subtracts the amount of gold the item costs.
	 * 
	 * @param itemID the ID of the item being purchased
	 * @param cost the price in gold of the item being purchased
	 * @param quantity the number of items being purchased
	 */
	public void buy(int itemID, int cost, int quantity){
		
	}
	
	/**
	 * This method sells an item to a buyer and adds the amount of gold the item costs.
	 * 
	 * @param itemID the ID of the item being sold
	 * @param cost the price in gold of the item being sold
	 * @param quantity the number of items being sold
	 */
	public void sell(int itemID, int cost, int quantity){
		
	}
	
	/**
	 * This method removes an item from the {@link GeneralCharacter}'s inventory.
	 * 
	 * @param itemID the ID of the item being dropped
	 * @param quantity the number of items being dropped
	 */
	public void drop(int itemID, int quantity){
		
	}
	
	
	/**
	 * This method equips an item from the {@link GeneralCharacter}'s inventory.
	 * 
	 * @param equipID the ID of the item being equipped.
	 */
	public void equip(int equipID){
		
	}
	
	/**
	 * Changes the {@link GeneralCharacter}'s {@code reputation} by a set amount.
	 * 
	 * @param amount how much {@code reputation} the {@link GeneralCharacter} loses or gains.
	 */
	public void changeReputation(int amount){
		reputation += amount;
	}
	
	/**
	 * Gets the {@link GeneralCharacter}'s current {@code reputation}
	 * 
	 * @return the {@link GeneralCharacter}'s {@code reputation}
	 */
	public int getReputation(){
		return reputation;
	}
	
	/**
	 * Adds a specified amount of stat points to the {@link GeneralCharacter}'s {@code strength} stat
	 * 
	 * @param add The number of stat points to add to {@code strength}
	 */
	public void addStrength(int add){
		strength += add;
	}
	
	/**
	 * Gets the current {@code strength} of the {@link GeneralCharacter}.
	 * 
	 * @return the {@code strength} of the {@link GeneralCharacter}.
	 */
	public int getStrength(){
		return strength;
	}
	
	/**
	 * Adds a specified amount of stat points to the {@link GeneralCharacter}'s {@code dexterity} stat
	 * 
	 * @param add The number of stat points to add to {@code dexterity}
	 */
	public void addDexterity(int add){
		dexterity += add;
	}
	
	/**
	 * Gets the current {@code dexterity} of the {@link GeneralCharacter}.
	 * 
	 * @return the {@code dexterity} of the {@link GeneralCharacter}.
	 */
	public int getDexterity(){
		return dexterity;
	}
	
	/**
	 * Adds a specified amount of stat points to the {@link GeneralCharacter}'s {@code luck} stat
	 * 
	 * @param add The number of stat points to add to {@code luck}
	 */
	public void addLuck(int add){
		luck += add;
	}
	
	/**
	 * Gets the current {@code luck} of the {@link GeneralCharacter}.
	 * 
	 * @return the {@code luck} of the {@link GeneralCharacter}.
	 */
	public int getLuck(){
		return luck;
	}
	
	/**
	 * Adds a specified amount of stat points to the {@link GeneralCharacter}'s {@code intelligence} stat
	 * 
	 * @param add The number of stat points to add to {@code intelligence}
	 */
	public void addIntelligence(int add){
		intelligence += add;
	}
	
	/**
	 * Gets the current {@code intelligence} of the {@link GeneralCharacter}.
	 * 
	 * @return the {@code intelligence} of the {@link GeneralCharacter}.
	 */
	public int getIntelligence(){
		return intelligence;
	}
	
	
	/**
	 * Gets the current {@code gold} amount the {@link GeneralCharacter} has.
	 * 
	 * @return the amount of {@code gold} the {@link GeneralCharacter} has.
	 */
	public int getGold(){
		return gold;
	}
	
	/**
	 * Adds or removes {@code gold} to/from the {@link GeneralCharacter}
	 * 
	 * @param amount of {@code gold} to add/remove from the {@link GeneralCharacter}
	 */
	public void changeGold(int amount){
		gold += amount;
	}

}
