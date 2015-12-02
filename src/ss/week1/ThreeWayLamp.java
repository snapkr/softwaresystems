package ss.week1;

/**
 * A simple three-way lamp
 * @author Sean
 *
 */
public class ThreeWayLamp {
	private int state;
	
	/**
	 * Constructor:
	 * Create a new ThreeWayLamp, which holds the state off.
	 */
	public ThreeWayLamp(int state) {
		this.state = state;
	}
	/**
	 * Default constructor
	 */
	public ThreeWayLamp() {
		this(0); // default turned off
	}

	/**
	 * Method:
	 * Switches to the next state of the lamp in the order of: off,low, medium or high.
	 * If the state is high, the cycle will start again at off.
	 */
	public void switchSetting () {
		if ((state+1)%4 != 0){
			state++;
		}else {
			state=0;
		}		
	}
	/**
	 * Method:
	 * Output current state.
	 */
	public String getState (){
		String statusString;
		switch(state){
		case 0:	statusString = "off";
		break;
		case 1:	statusString = "low";
		break;
		case 2:	statusString = "medium";
		break;
		case 3:	statusString = "high";
		break;
		default:statusString = "error";
		break;
		}
	return statusString;
	}


}
