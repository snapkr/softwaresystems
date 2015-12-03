package ss.week4.math;

public class Polynomial implements Function {

	private LinearProduct[] nomials;

	public Polynomial(double[] args) {

		nomials = new LinearProduct[args.length];
		for (int i = 0; i < args.length; i++) {
			nomials[i] = new LinearProduct(new Constant(args[i]), new Exponent((int) args[i]));
		}

	}

	@Override
	public double apply(double arg) {
		double memory = 0;
		for (int i = 0; i < nomials.length; i++) {
			memory = memory + nomials[i].apply(arg);
		}
		return memory;
	}

	@Override
	public Function derivative() {
		
		Function returnSum = nomials[0].derivative();
		for (int i = 1; i < nomials.length; i++) {
			returnSum = new Sum(returnSum,nomials[i].derivative());
		}
		return returnSum;
		
	}

}
