package ss.week2;

/**
 * A simple three-way lamp
 * @author Sean
 *
 */
public class ThreeWayLamp {
	private State state;
	public enum State { OFF,LOW,MEDIUM,HIGH };
		
	/**
	 * Constructor:
	 * Create a new ThreeWayLamp, which holds the state off.
	 */
	public ThreeWayLamp(State state) {
		this.state = state;
	}
	/**c
	 * Default constructor
	 */
	public ThreeWayLamp() {
		this(State.OFF); // default turned off
	}

	/**
	 * Method:
	 * Switches to the next state of the lamp in the order of: off,low, medium or high.
	 * If the state is high, the cycle will start again at off.
	 */
	//@ ensures \old(getState()) == State.OFF.toString() ==> getState() == State.LOW.toString();
	//@ ensures \old(getState()) == State.LOW.toString() ==> getState() == State.MEDIUM.toString();
	//@ ensures \old(getState()) == State.MEDIUM.toString() ==> getState() == State.HIGH.toString();
	//@ ensures \old(getState()) == State.HIGH.toString() ==> getState() == State.OFF.toString();
	public void switchSetting () {
		switch (state){
		case OFF:	state = State.LOW;		break;
		case LOW:	state = State.MEDIUM;	break;
		case MEDIUM:state = State.HIGH;		break;
		case HIGH:	state = State.LOW;		break;
		}
	}
	/**
	 * Method:
	 * Output current state.
	 */
	/*@ pure */ public String getState (){
		State statusString = null;
		switch (state){
		case OFF:	statusString = State.LOW;		break;
		case LOW:	statusString = State.MEDIUM;	break;
		case MEDIUM:statusString = State.HIGH;		break;
		case HIGH:	statusString = State.LOW;		break;
		}
	return statusString.toString();
	}


}
