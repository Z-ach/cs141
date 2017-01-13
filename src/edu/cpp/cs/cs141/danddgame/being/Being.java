/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being;

/**
 * @author Zach Kaufman
 *
 */
public abstract class Being {

	/**
	 * Current health of being. Health goes down when attacked.
	 */
	private int healthCurrent;
	
	
	/**
	 * Total health of being.
	 * 
	 * Based on <code>strength</code> and <code>level</code> of being.
	 */
	private int healthTotal;
	
	
	/**
	 * Current mana of being. Mana will go down with use of skills and attacks.
	 */
	private int manaCurrent;
	
	
	/**
	 * Total mana of being. Mana is based on <code>intelligence</code> and <code>level</code> of being.
	 */
	private int manaTotal;
	
	
	/**
	 * Current level of being. Level is required to equip certain items and use certain skills.
	 */
	
	private int level;
	
	/**
	 * How much <code>avoid</code> the being has. This effects how often the being is hit by other beings.
	 */
	private int avoid;
	
	
	/**
	 * How much <code>accuracy</code> the being has. This effects how often the being hits other beings.
	 */
	private int accuracy;
	
	
	/**
	 * How much <code>defense</code> the being has. This effects how much damage the being takes.
	 */
	private int defense;
	
	/**
	 * The being's base attack power. Other stats will effect this.
	 */
	private int attackPower;

	
	/**
	 * The name of the being.
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
	}
	
	
	
	/**
	 * Makes the being move via walking in a specified direction.
	 * 
	 * @param direction 0 for reverse, 1 for forward, 2 for left, 3 for right
	 */
	public void walk(int direction){
		
	}
	
	/**
	 * Attacks whatever is directly in front of the being. Only a basic attack, will not do much damage.
	 * 
	 */
	public void attack(){
		
	}
	
	/**
	 * Reduces the <code>healthCurrent</code> of the being by a certain amount.
	 * 
	 * @param damage How much damage to subtract from being's current health.
	 */
	public void takeDamage(int damage){
		
	}
	
	/**
	 * Adds a set amount of health to the being's total, and increases the starting amount too. Useful so two calls
	 * aren't required to increase both total health and current health.
	 * 
	 * @param add the amount of health to add to the being's base health
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
