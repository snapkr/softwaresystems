package ss.week4.math;

public class Sum implements Function, Integrandable {

	private Function f1;
	private Function f2;

	public Sum(Function f1, Function f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public double apply(double arg) {
		return f1.apply(arg) + f2.apply(arg);

	}

	@Override
	public Function derivative() {
		return new Sum(f1.derivative(), f2.derivative());
	}

	@Override
	public String toString() {
		return f1.toString() + " + " + f2.toString();
	}

	@Override
	public Function integrand() {

		if (f1 instanceof Product || f2 instanceof Product) {
			return null;
		} else {

			return new Sum(((Integrandable) f1).integrand(), ((Integrandable) f2).integrand());
		}
	}

}
