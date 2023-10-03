/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/3/2023
 * File Name: DeliveryRequest.java
 * Description: This file contains the Delivery Request class
 */

package hw2;

public class DeliveryRequest {
    String restaurantName;
    String orderName;
    float lat_coordinate;
    float long_coordinate;
    float deliverByTime;

    public DeliveryRequest(String restaurantName, String orderName, float lat_coordinate, 
        float long_coordinate, float deliverByTime)
    {
        this.restaurantName = restaurantName;
        this.orderName = orderName;
        this.lat_coordinate = lat_coordinate;
        this.long_coordinate = long_coordinate;
        this.deliverByTime = deliverByTime;
    }

    public String getRestaurantName() { return restaurantName; }
    public String getOrderName() { return orderName; }
    public float getLatCoordinate() { return lat_coordinate; }
    public float getLongCoordinate() { return long_coordinate; }
    public float getDeliverByTime() { return deliverByTime; }
}