/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 9/23/2023
 * File Name: Coffee.java
 * Description: This file contains the Coffee class, a class that extends the Drink class for Coffee drinks
 */

package vending_machine;

public class Coffee extends Drink {
	/** 
	 * Constructor method for creating coffee drink
	 */
	public Coffee(String DrinkType, int sugar, int milk)
	{
		this.DrinkType = DrinkType;
		this.sugar = sugar;
		this.milk = milk;
	}
}
