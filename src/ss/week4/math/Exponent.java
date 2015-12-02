package ss.week4.math;

public class Exponent implements Function{
	private int exponent;
	
	public Exponent(Integer exponent){
		this.exponent = exponent;
	}

	@Override
	public double apply(double arg) {
		return Math.pow(arg, exponent);	
	}

	@Override
	public Function derivative() {
		return new LinearProduct(new Constant(exponent),new Exponent(exponent-1));
	}
	
	// This confuses me?!
	@Override
	public String toString() {
		return "/^(" + exponent + ")";

	}

}
