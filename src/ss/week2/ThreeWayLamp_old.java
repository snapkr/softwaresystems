package ss.week2;

/**
 * A simple three-way lamp
 * 
 * @author Sean
 *
 */
public class ThreeWayLamp_old {
	private int state;
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;



	/**
	 * Constructor: Create a new ThreeWayLamp, which holds the state off.
	 */

	public ThreeWayLamp_old(int state) {
		this.state = state;
	}

	/**
	 * c Default constructor
	 */
	public ThreeWayLamp_old() {
		this(0); // default turned off
	}

	/**
	 * Method: Switches to the next state of the lamp in the order of: off,low,
	 * medium or high. If the state is high, the cycle will start again at off.
	 */
	
	//@ ensures \old(getState()) == OFF ==> getState() == LOW;
	//@ ensures \old(getState()) == LOW ==> getState() == MEDIUM;
	//@ ensures \old(getState()) == MEDIUM ==> getState() == HIGH;
	//@ ensures \old(getState()) == HIGH ==> getState() == OFF;
	public void switchSetting() {
		assert (getState() >= 0 || getState() <= 3);
		if ((state + 1) % 4 != 0) {
			state++;
		} else {
			state = 0;
		}

	}

	/**
	 * Method: Output current state.
	 */
	/*@ pure */ public int getState() {
		int statusString;
		switch (state) {
		case 0:
			statusString = OFF;
			break;
		case 1:
			statusString = LOW;
			break;
		case 2:
			statusString = MEDIUM;
			break;
		case 3:
			statusString = HIGH;
			break;
		default:
			statusString = -1;
			break;
		}
		return statusString;
	}

}
