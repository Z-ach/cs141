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

package edu.cpp.cs.cs141.danddgame;

import edu.cpp.cs.cs141.danddgame.being.heros.Mage;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mage m = new Mage("Zach", "Male");
		m.levelUp();
	}

}
