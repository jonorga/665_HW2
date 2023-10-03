/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/3/2023
 * File Name: Shop.java
 * Description: This file contains the Shop concrete class which implements the IShop interface. It contains
 * the methods registerObserver, removeObserver, and notifyObservers.
 */

package hw2;

import java.util.ArrayList;

public class Shop implements IShop {
    ArrayList<Driver> DriverList = new ArrayList<Driver>();

    public void registerObserver(Driver driverToAdd)
    {

    }

    public void removeObserver(Driver driverToRemove)
    {

    }

    public void notifyObservers()
    {

    }

    public DeliveryRequest generateDeliveryRequest(String restaurantName, String orderName, float lat_coordinate, 
        float long_coordinate, float deliverByTime)
    {
        return new DeliveryRequest(restaurantName, orderName, lat_coordinate, long_coordinate, deliverByTime);
    }
}