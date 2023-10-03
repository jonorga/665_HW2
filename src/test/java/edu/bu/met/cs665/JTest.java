package test;

/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vending_machine.Customer;
*/
import hw2.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JTest {
	@Test
	public void TestShop() {
		Shop testShop = new Shop("Chipotle");
		Driver testDriver1 = new Driver();
		Driver testDriver2 = new Driver();
		Driver testDriver3 = new Driver();
		Driver testDriver4 = new Driver();
		Driver testDriver5 = new Driver();

		testShop.registerObserver(testDriver1);
		testShop.registerObserver(testDriver2);
		testShop.registerObserver(testDriver3);
		testShop.registerObserver(testDriver4);
		testShop.registerObserver(testDriver5);

		DeliveryRequest testDR = testShop.generateDeliveryRequest("Wayne", 24.754f, 12.531f, 2.14f);

		assertEquals(true, testShop.notifyObservers(testDR));
	}

	@Test
	public void TestRemoveObserver() {
		Shop testShop = new Shop("Dominos");

		Driver testDriver1 = new Driver();
		Driver testDriver2 = new Driver();

		testShop.registerObserver(testDriver1);
		testShop.registerObserver(testDriver2);
		testShop.removeObserver(testDriver1);

		DeliveryRequest testDR = testShop.generateDeliveryRequest("Dan", 14.649f, 22.749f, 11.43f);

		assertEquals(true, testShop.notifyObservers(testDR));
	}

	@Test
	public void TestDriverData() {
		Shop testShop = new Shop("Lou Malnatis");

		Driver testDriver1 = new Driver();

		testShop.registerObserver(testDriver1);

		DeliveryRequest testDR = testShop.generateDeliveryRequest("Darrell", 37.117f, 2.955f, 7.06f);

		testShop.notifyObservers(testDR);

		assertEquals(testDriver1.getDeliverByTime(), 7.06f, 0);
	}
	/*
	@Test
	public void TestCoffee() {
		Customer testCase = new Customer("Americano", 2, 2);
		assertEquals(4.0, testCase.PlaceOrder(), 0);
	}

	@Test
	public void TestTea() {
		Customer testCase = new Customer("Green Tea", 2, 0);
		assertEquals(3.0, testCase.PlaceOrder(), 0);
	}
	
	@Test
	public void TestTooManyAddons() {
		Customer testCase = new Customer("Green Tea", 5, 2);
		assertEquals(4.5, testCase.PlaceOrder(), 0);
	}

	@Test
	public void TestBadExtrasInput() {
		Customer testCase = new Customer("Yellow Tea", -1, 2);
		assertEquals(3.0, testCase.PlaceOrder(), 0);
	}

	@Test
	public void TestBadDrinkInput() {
		Customer testCase = new Customer("Gatorade", 0, 0);
		assertEquals(0, testCase.PlaceOrder(), 0);
	}
	*/
}
