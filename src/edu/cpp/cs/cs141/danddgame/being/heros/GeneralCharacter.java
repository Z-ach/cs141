/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being.heros;

import edu.cpp.cs.cs141.danddgame.being.Being;

/**
 * @author Zach Kaufman
 *
 */
public abstract class GeneralCharacter extends Being{
	

	/**
	 * Current exp of character. Resets to 0 when it equals the experience needed to level up, which triggers <code>levelUp()</code>.
	 */
	private int expCurrent;
	
	
	/**
	 * Current level of being. Level is required to equip certain items and use certain skills.
	 */
	
	private int level;
	
	
	/**
	 * Total exp required to next <code>level</code>.
	 */
	private final static int[] EXP_TOTAL = {150, 250, 350, 450, 600, 800, 1050, 1350, 1700, 2100};
	
	
	/**
	 * How much <code>strength</code> the character has. This effects <code>carryCap</code> and <code>healthTotal</code> for all characters,
	 *  and <code>attackPower</code> for warriors.
	 */
	private int strength;
	
	
	/**
	 * How much <code>luck</code> the character has. This effects <code>avoid</code> for all characters, and <code>attackPower</code> for assassins.
	 */
	private int luck;
	
	
	/**
	 * How much <code>dexterity</code> the character has. This effects <code>accuracy</code> for all characters, and <code>attackPower</code> for archers.
	 */
	private int dexterity;
	
	
	/**
	 * How much <code>intelligence</code> the character has. This effects <code>manaTotal</code> for all characters, and <code>attackPower</code> for mages.
	 */
	private int intelligence;
	
	
	/**
	 * How much <code>reputation</code> the character has. This effects availability of certain quests.
	 */
	private int reputation;
	
	
	/**
	 * How much the character has can hold. This is effected by <code>strength</code> and character <code>level</code>.
	 */
	private int carryCap;
	
	
	/**
	 * How much currency the character has.
	 */
	private int gold;
	
	
	/**
	 * The gender of the character.
	 */
	private String gender;


	/**
	 * Constructor for <code>GeneralCharacter()</code>. Assigns a <code>name</code> and a <code>gender</code> to the character, and initializes
	 * all basic starting stats and attributes to their respective starting values.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	protected GeneralCharacter(String name, String gender) {
		super(name);
		this.gender = gender;
		
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
	 * Makes the character move in a specified direction, faster than walking.
	 * 
	 * @param speed the speed at which the character travels. 1 is walking, 2 is running, 3 is sprinting
	 * @param direction 0 for reverse, 1 for forward, 2 for left, 3 for right
	 * @see walk
	 */
	public void sprint(int speed, int direction){
		
	}
	

	
	/**
	 * Consumes an item.
	 * 
	 * @param itemID the ID of the item being consumed
	 */
	public void consume(int itemID){
		
	}
	
	
	/**
	 * Increases the character's <code>level</code> and resets the <code>expCurrent</code> back to 0.
	 */
	public void levelUp(){
		level++;
		expCurrent = 0;
		System.out.printf("You are now level %d\n", level);
	}
	
	/**
	 * Recovers a percentage of <code>healthTotal</code> per hour sleeping.
	 * 
	 * @param duration How long the character will sleep for.
	 */
	public void sleep(int duration){
		
	}
	
	/**
	 * Buys an item from a vendor and subtracts the amount of gold the item costs.
	 * 
	 * @param itemID the ID of the item being purchased
	 * @param cost the price in gold of the item being purchased
	 * @param quantity the number of items being purchased
	 */
	public void buy(int itemID, int cost, int quantity){
		
	}
	
	/**
	 * Sells an item to a buyer and adds the amount of gold the item costs.
	 * 
	 * @param itemID the ID of the item being sold
	 * @param cost the price in gold of the item being sold
	 * @param quantity the number of items being sold
	 */
	public void sell(int itemID, int cost, int quantity){
		
	}
	
	/**
	 * Buys an item from a vendor and subtracts the amount of gold the item costs.
	 * 
	 * @param itemID the ID of the item being dropped
	 * @param quantity the number of items being dropped
	 */
	public void drop(int itemID, int quantity){
		
	}
	
	
	/**
	 * Equips an item from the character's inventory.
	 * 
	 * @param equipID the ID of the item being equipped.
	 */
	public void equip(int equipID){
		
	}
	
	/**
	 * Changes the character's <code>reputation</code> by a set amount
	 * 
	 * @param amount how much <code>reputation</code> the character loses or gains
	 */
	public void changeReputation(int amount){
		reputation += amount;
	}
	
	/**
	 * Gets the character's current <code>reputation</code>
	 * 
	 * @return the character's <code>reputation</code>
	 */
	public int getReputation(){
		return reputation;
	}
	
	/**
	 * Adds a specified amount of stat points to the character's <code>strength</code> stat
	 * 
	 * @param add The number of stat points to add to <code>strength</code>
	 */
	public void addStrength(int add){
		strength += add;
	}
	
	/**
	 * Gets the current <code>strength</code> of the character.
	 * 
	 * @return the <code>strength</code> of the character.
	 */
	public int getStrength(){
		return strength;
	}
	
	/**
	 * Adds a specified amount of stat points to the character's <code>dexterity</code> stat
	 * 
	 * @param add The number of stat points to add to <code>dexterity</code>
	 */
	public void addDexterity(int add){
		dexterity += add;
	}
	
	/**
	 * Gets the current <code>dexterity</code> of the character.
	 * 
	 * @return the <code>dexterity</code> of the character.
	 */
	public int getDexterity(){
		return dexterity;
	}
	
	/**
	 * Adds a specified amount of stat points to the character's <code>luck</code> stat
	 * 
	 * @param add The number of stat points to add to <code>luck</code>
	 */
	public void addLuck(int add){
		luck += add;
	}
	
	/**
	 * Gets the current <code>luck</code> of the character.
	 * 
	 * @return the <code>luck</code> of the character.
	 */
	public int getLuck(){
		return luck;
	}
	
	/**
	 * Adds a specified amount of stat points to the character's <code>intelligence</code> stat
	 * 
	 * @param add The number of stat points to add to <code>intelligence</code>
	 */
	public void addIntelligence(int add){
		intelligence += add;
	}
	
	/**
	 * Gets the current <code>intelligence</code> of the character.
	 * 
	 * @return the <code>intelligence</code> of the character.
	 */
	public int getIntelligence(){
		return intelligence;
	}
	
	
	/**
	 * Gets the current gold amount the character has.
	 * 
	 * @return the amount of gold the character has.
	 */
	public int getGold(){
		return gold;
	}
	
	/**
	 * Adds or removes gold to/from the character
	 * 
	 * @param amount of gold to add/remove from the character
	 */
	public void changeGold(int amount){
		gold += amount;
	}

}
