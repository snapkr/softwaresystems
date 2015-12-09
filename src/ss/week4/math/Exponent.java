package ss.week4.math;

public class Exponent implements Function,Integrandable{
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
	

	@Override
	public String toString() {
		return "(x^" + exponent + ")";

	}

	@Override
	public Function integrand() {
		return new LinearProduct(new Constant(exponent),new LinearProduct(new Constant(1.0/(exponent+1)),new Exponent(exponent+1)));
	}

}
