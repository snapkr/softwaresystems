package ss.week4.math;

public class LinearProduct extends Product implements Integrandable {

	private Constant f1;
	private Function f2;

	public LinearProduct(Constant f1, Function f2) {
		
		super(f1, f2);
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public Function derivative() {
		
		return new LinearProduct(f1, f2.derivative());
	}

	@Override
	public Function integrand() {

		if (f2 instanceof Product) {
			return null;
		} else {

			return new LinearProduct(f1, ((Integrandable) f2).integrand());
		}

	}

}
