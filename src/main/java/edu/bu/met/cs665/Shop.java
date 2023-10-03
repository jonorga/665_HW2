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
    ArrayList<Driver> DriverList;
    String restaurantName;

    public Shop(String restaurantName)
    {
        DriverList = new ArrayList<Driver>();
        this.restaurantName = restaurantName;
    }

    public void registerObserver(Driver driverToAdd)
    {
        DriverList.add(driverToAdd);
    }

    public void removeObserver(Driver driverToRemove)
    {
        DriverList.remove(driverToRemove);
    }

    public boolean notifyObservers(DeliveryRequest _dr)
    {
        boolean result = true;
        for (Driver _driver : DriverList) {
            if (!_driver.update(_dr))
                result = false;
        }
        return result;
    }

    public DeliveryRequest generateDeliveryRequest(String orderName, float lat_coordinate, 
        float long_coordinate, float deliverByTime)
    {
        return new DeliveryRequest(restaurantName, orderName, lat_coordinate, long_coordinate, deliverByTime);
    }
}