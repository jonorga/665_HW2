/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/3/2023
 * File Name: DeliveryRequest.java
 * Description: This file contains the Delivery Request class which handles the details of a delivery request. It 
 * contains instance variables for the details about the order, a constructor method to set the order details, and
 * methods getRestaurantName, getOrderName, getLatCoordinate, getLongCoordinate, and getDeliverByTime.
 */

package hw2;

public class DeliveryRequest {
    String restaurantName;
    String orderName;
    float lat_coordinate;
    float long_coordinate;
    float deliverByTime;

    /**
     * Constructor method for DeliveryRequest object
     */
    public DeliveryRequest(String restaurantName, String orderName, float lat_coordinate, 
        float long_coordinate, float deliverByTime)
    {
        this.restaurantName = restaurantName;
        this.orderName = orderName;
        this.lat_coordinate = lat_coordinate;
        this.long_coordinate = long_coordinate;
        this.deliverByTime = deliverByTime;
    }

    /**
     * Get restaurant name from instance variable
     * @return String
     */
    public String getRestaurantName() { return restaurantName; }

    /**
     * Get order name from instance variable
     * @return String
     */
    public String getOrderName() { return orderName; }

    /**
     * Get latitude coordinate from instance variable
     * @return float
     */
    public float getLatCoordinate() { return lat_coordinate; }

    /**
     * Get longitude from instance variable
     * @return float
     */
    public float getLongCoordinate() { return long_coordinate; }

    /**
     * Get "deliver by" time from instance variable
     * @return float
     */
    public float getDeliverByTime() { return deliverByTime; }
}