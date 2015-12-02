package ss.week1.test;

import ss.week1.ThreeWayLamp;

/**
 * A simple class to test the ThreeWayLamp class.
 * @author Sean
 *
 */
class ThreeWayLampTest {
	private ThreeWayLamp lampOne; //The tested object.
	
	/**
	 * Create a TweeWayLampTest
	 */
	public ThreeWayLampTest () {
		lampOne = new ThreeWayLamp();
	}
	
	/**
	 * Run the test
	 */
	public void runTest(){
		this.testInitialState();
		this.testChange();
		this.testChange();
		this.testChange();
		this.testChange();
		
	}
	
	/**
	 * Test the initial state.
	 */
	private void testInitialState(){
		System.out.println("#### testInitialState:");
		System.out.println("Initial state of lamp is: 	" + lampOne.getState());
	}
	
	/**
	 * Test the change in state before and after.
	 */
	private void testChange () {
		System.out.println("#### testChange:");
		System.out.println("Value before change is:		" + lampOne.getState());
		lampOne.switchSetting();
		System.out.println("Value after change is:		" + lampOne.getState());
	}

}
