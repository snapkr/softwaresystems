package ss.week4.math;

public class Polynomial implements Function {
	
	private LinearProduct[] nomials;
	
	public Polynomial(double[] args){
		int i = 0;
		nomials = new LinearProduct[args.length];
		for(double n : args){
			nomials[i] = new LinearProduct(new Constant(args.length-i),new Exponent(args.length-i));
			i++;
		}
		
	}

	@Override
	public double apply(double arg) {
		return 0;
	}

	@Override
	public Function derivative() {
		return null;
	}

}
