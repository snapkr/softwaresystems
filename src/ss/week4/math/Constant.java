package ss.week4.math;

public class Constant implements Function {

	private double constant;

	public Constant(double constant) {
		this.constant = constant;
	}

	@Override
	public double apply(double arg) {
		return constant;

	}

	@Override
	public Function derivative() {
		return new Constant(0);
	}

	@Override
	public String toString() {
		return String.valueOf(constant);

	}

}
