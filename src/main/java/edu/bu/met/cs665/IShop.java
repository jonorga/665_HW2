/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/3/2023
 * File Name: IShop.java
 * Description: This file contains the IShop interface to be implemented by the shop class. It contains
 * the methods registerObserver, removeObserver, and notifyObservers.
 */

package hw2;

interface IShop {
	public void registerObserver(Driver _driver);
	public void removeObserver(Driver _driver);
	public boolean notifyObservers(DeliveryRequest _dr);
}