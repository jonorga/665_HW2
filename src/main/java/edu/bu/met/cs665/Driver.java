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
    DeliveryRequest currentDeliveryRequest;

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
}