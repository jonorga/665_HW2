package test;

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
	public void TestDriverDataTime() {
		Shop testShop = new Shop("Lou Malnatis");
		Driver testDriver1 = new Driver();

		testShop.registerObserver(testDriver1);
		DeliveryRequest testDR = testShop.generateDeliveryRequest("Darrell", 37.117f, 2.955f, 7.06f);
		testShop.notifyObservers(testDR);

		assertEquals(testDriver1.getDeliverByTime(), 7.06f, 0);
	}

	@Test
	public void TestDriverDataRestaurantName() {
		Shop testShop = new Shop("Sarkis");
		Driver testDriver1 = new Driver();

		testShop.registerObserver(testDriver1);
		DeliveryRequest testDR = testShop.generateDeliveryRequest("Gail", 67.111f, 34.002f, 9.15f);
		testShop.notifyObservers(testDR);

		assertEquals(testDriver1.getRestaurantName(), "Sarkis");
	}

	@Test
	public void TestDriverDataOrderName() {
		Shop testShop = new Shop("Captain Nemos");
		Driver testDriver1 = new Driver();

		testShop.registerObserver(testDriver1);
		DeliveryRequest testDR = testShop.generateDeliveryRequest("Bonnie", 14.160f, 55.345f, 12.55f);
		testShop.notifyObservers(testDR);

		assertEquals(testDriver1.getOrderName(), "Bonnie");
	}

	@Test
	public void TestDriverDataLat() {
		Shop testShop = new Shop("Santarpios");
		Driver testDriver1 = new Driver();

		testShop.registerObserver(testDriver1);
		DeliveryRequest testDR = testShop.generateDeliveryRequest("Jones", 56.682f, 12.374f, 8.45f);
		testShop.notifyObservers(testDR);

		assertEquals(testDriver1.getLatCoordinate(), 56.682f, 0);
	}

	@Test
	public void TestDriverDataLong() {
		Shop testShop = new Shop("McDonalds");
		Driver testDriver1 = new Driver();

		testShop.registerObserver(testDriver1);
		DeliveryRequest testDR = testShop.generateDeliveryRequest("Stewart", 34.180f, 25.842f, 6.02f);
		testShop.notifyObservers(testDR);

		assertEquals(testDriver1.getLongCoordinate(), 25.842f, 0);
	}
}
