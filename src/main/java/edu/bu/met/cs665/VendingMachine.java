/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 9/23/2023
 * File Name: VendingMachine.java
 * Description: This file contains the VendingMachine class, this class handles the actual operation of the vending
 * machine and creates the order
 */

package vending_machine;

public class VendingMachine {
	/**
	 * This method creates the order for the customer
	 * @return float
	 */
	float CreateOrder(Drink _drink)
	{
		if (_drink.DrinkType.equals("None"))
			return 0;
		// Calculate price of beverage, store as float for later use
		float basePrice = (float)2.0;
		float additionPrice = (float)((0.5 * _drink.sugar) + (0.5 * _drink.milk));
		float totalPrice = basePrice + additionPrice;
		
		/*
		 * Run process of creating order here using Drink object
		 */
		
		return totalPrice;
	}
}
