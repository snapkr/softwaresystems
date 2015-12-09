package ss.week4.math;

public class LinearProduct extends Product implements Integrandable {


	public LinearProduct(Constant f1, Function f2) {
		
		super(f1, f2);
		
	}

	@Override
	public Function derivative() {
		
		return new LinearProduct((Constant)f1, f2.derivative());
	}

	@Override
	public Function integrand() {
// TODO change Product ot Integradnable -> see joeps code
		if (f2 instanceof Integrandable) {
			return null;
		} else {

			return new LinearProduct((Constant)f1, ((Integrandable) f2).integrand());
		}

	}

}
