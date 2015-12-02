package ss.week4.math;

public interface Function {
	
	/**
	 * <code>apply</code> executes the function to an <code>argument</code> of type double.
	 * @param arg - A double value which is needed to execute the function.
	 */
	public double apply(double arg);
	
	/**
	 * <code>derivative</code> returns the <code>Function</code> object that is the derivative of the current object.
	 * @return  The derivative function of this function.
	 */
	public Function derivative();
	
	/**
	 * <code>toString</code> returns a nice string representation of the function.
	 * @return A string representation of the Function.
	 */
	public String toString();


}
