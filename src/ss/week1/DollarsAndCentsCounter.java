package ss.week1;


/**
 * 
 * @author Sean
 * @ensure this.dollars() <= 0
 */
public class DollarsAndCentsCounter {
	int dollars = 0;
	int cents = 0;
	
	public DollarsAndCentsCounter () {
		
	}
	public DollarsAndCentsCounter (int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	
	/**
	 * The dollar count.
	 * @ensure this.dollars() <= 0
	 */
	public int dollars () {
		return dollars;
	}
	
	/**
	 * The cents count.
	 * @ensure 0 <= this.cents() && this.cents() <= 99
	 */
	public int cents () {
		return cents;
	}
	
	/**
	 * Add the specified dollars and cents to this Counter.
	 */
	public void add (int dollars, int cents){
		this.dollars = this.dollars + dollars;
		this.cents = this.cents + cents;
		if (this.cents > 99){
			this.dollars = this.dollars + (this.cents/100);
			this.cents = (this.cents%100);
		}
	}
	
	/**
	 * Subtract the specified dollars and cents of this Counter.
	 * TODO Will cause an error because the counter can render negative.
	 */
	public void subtract (int dollars, int cents){
		this.dollars = this.dollars - dollars;
		this.cents = this.cents - cents;
	}
	
	/**
	 * Reset this Counter to 0.
	 * @ensure this.dollar() == 0 && this.cents() == 0
	 */
	public void reset () {
		cents = 0; 
		dollars = 0;
		
	}

}
