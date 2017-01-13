/**
 * 
 */
package edu.cpp.cs.cs141.danddgame.being.heros;

/**
 * @author Zach Kaufman
 *
 */
public class Warrior extends GeneralCharacter {

	/**
	 * Constructor for the Warrior hero. It assigns a name and gender to the character, and adds additional strength.
	 * Warriors are very strong and have high health points. They have the lowest mana of any class though.
	 * 
	 * 
	 * @param name Name of the character.
	 * @param gender Gender of the character.
	 */
	public Warrior(String name, String gender) {
		super(name, gender);
		addStrength(10);
	}
	
	/**
	 * Swings weapon at an enemy. Damage depends on character's strength and the weapon's attack.
	 */
	public void powerAttack(){
		
	}
	
	/**
	 * Blocks an incoming attack. 
	 */
	public void block(){
		
	}

}
