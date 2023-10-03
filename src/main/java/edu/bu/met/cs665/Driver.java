/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/3/2023
 * File Name: Driver.java
 * Description: This file contains the Driver concrete class which implements the IDriver interface. It contains
 * a constructor method and methods update, getRestaurantName, getOrderName, getLatCoordinate, getLongCoordinate,
 * and getDeliverByTime.
 */

package hw2;

public class Driver implements IDriver {
    public DeliveryRequest currentDeliveryRequest;

    /**
     * Constructor method for driver object
     */
    public Driver()
    {
        currentDeliveryRequest = null;
    }

    /**
     * Update driver app with Delivery Request
     * @return boolean
     */
    public boolean update(DeliveryRequest _dr)
    {
        currentDeliveryRequest = _dr;
        return true;
    }

    /**
     * Get restaurant name from delivery request
     * @return String
     */
    public String getRestaurantName() { return currentDeliveryRequest.getRestaurantName(); }

    /**
     * Get order name from delivery request
     * @return String
     */
    public String getOrderName() { return currentDeliveryRequest.getOrderName(); }

    /**
     * Get latitude coordinate from delivery request
     * @return float
     */
    public float getLatCoordinate() { return currentDeliveryRequest.getLatCoordinate(); }

    /**
     * Get longitude coordinate from delivery request
     * @return float
     */
    public float getLongCoordinate() { return currentDeliveryRequest.getLongCoordinate(); }

    /**
     * Get "deliver by" time from delivery request
     * @return float
     */
    public float getDeliverByTime() { return currentDeliveryRequest.getDeliverByTime(); }
}