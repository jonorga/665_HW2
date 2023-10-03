/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/3/2023
 * File Name: Driver.java
 * Description: This file contains the Driver concrete class which implements the IDriver interface. It contains
 * the method update.
 */

package hw2;

public class Driver implements IDriver {
    public DeliveryRequest currentDeliveryRequest;

    public Driver()
    {
        currentDeliveryRequest = null;
    }

    /**
     * Update driver app with Delivery Request
     * @return void
     */
    public boolean update(DeliveryRequest _dr)
    {
        currentDeliveryRequest = _dr;
        return true;
    }

    public String getRestaurantName() { return currentDeliveryRequest.getRestaurantName(); }
    public String getOrderName() { return currentDeliveryRequest.getOrderName(); }
    public float getLatCoordinate() { return currentDeliveryRequest.getLatCoordinate(); }
    public float getLongCoordinate() { return currentDeliveryRequest.getLongCoordinate(); }
    public float getDeliverByTime() { return currentDeliveryRequest.getDeliverByTime(); }
}