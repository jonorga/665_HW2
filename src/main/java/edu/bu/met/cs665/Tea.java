/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 9/23/2023
 * File Name: Tea.java
 * Description: This file contains the Tea class, a class that extends the Drink class for Tea drinks
 */

package vending_machine;

public class Tea extends Drink {
	/**
	 * Constructor method for creating tea drink
	 */
	public Tea(String DrinkType, int sugar, int milk)
	{
		this.DrinkType = DrinkType;
		this.sugar = sugar;
		this.milk = milk;
	}
}
