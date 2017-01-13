/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being.heros;

/**
 * @author Zach Kaufman
 *
 */
public class Archer extends GeneralCharacter {

	
	/**
	 * The total number of arrows the quiver is capable of holding.
	 */
	private int quiverCapacity;
	
	/**
	 * The amount of arrows the quiver currently is holding. When this number reaches 0, the quiver will need to be reloaded.
	 */
	private int quiverCount;
	
	/**
	 * The current number of arrows the character has. This number does not include the arrows in the quiver.
	 */
	private int arrowCount;
	
	/**
	 * The constructor for the Archer hero.
	 * Archers are skilled marksmen who use a bow and arrow to hunt enemies from a ranged distance. 
	 * Archers primarily use dexterity, and have an average amount of mana and health.
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Archer(String name, String gender) {
		super(name, gender);
		addDexterity(10);
		
	}
	
	/**
	 * Shoots an arrow at an enemy. Damage is dependent on the equipped bow's attack and the character's dexterity.
	 */
	public void shootArrow(){
		
	}
	
	/**
	 * Refills the quiver to maximum capacity.
	 */
	public void reloadQuiver(){
		
	}
	
	/**
	 * Gets the current amount of arrows in the quiver.
	 * 
	 * @return the amount of arrows in the quiver.
	 */
	public int getQuiverCount(){
		return quiverCount;
	}
	
	/**
	 * Gets the total number of arrows in the character's inventory. This does not include arrows in the quiver.
	 * 
	 * @return number of arrows in the character's inventory. This does not include arrows in the quiver.
	 */
	public int getArrowCount(){
		return arrowCount;
	}

}
