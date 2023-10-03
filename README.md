# Fully Automatic Vending Machine Homework Submission, Jon Organ


### Implementation details
I've decided to add "Drink" as an abstract class to allow new drink type (in addition to Coffee and Tea) to be added. I chose not to use an interface since the drink only had properties, not methods to be inherited. Separating these out makes the each class much more readable and easy to understand. This also allows for any future drinks to be implemented without having to duplicate the basic features of the drink.

###	 Assumptions
1. I assume the actual communication with whatever control panel operates the beverage machine will be implemented later which is why I left a commented out area in the `Vending Machine` class for that.
2. I assume the handling of the payment will also be implemented later, which is why for now the program just returns the price to the customer.