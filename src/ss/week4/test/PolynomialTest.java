package ss.week4.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ss.week4.math.LinearProduct;
import ss.week4.math.Polynomial;

public class PolynomialTest {

	private static final double DELTA = 1e-15;
	//private static final double[] CONSTANT_VALUE = new double[] {0,1,2,3};
	private static final double[] CONSTANT_VALUE = new double[] {7,9,3,6};
	private Polynomial polynomial;

	@Before
	public void setUp() throws Exception {
		polynomial = new Polynomial(CONSTANT_VALUE);
	}


	@Test
	public void testApply() {
		/*
		assertEquals(0, polynomial.apply(0), DELTA);
		assertEquals(-2, polynomial.apply(-1), DELTA);
		assertEquals(6, polynomial.apply(1), DELTA);
		*/
		assertEquals(877, polynomial.apply(5), DELTA);
		assertEquals(25, polynomial.apply(1), DELTA);
		
	}

	@Test
	public void testDerivative() {
		/*
		//assertTrue(polynomial.derivative() instanceof Polynomial);
		assertEquals(0.0, polynomial.derivative().apply(0), DELTA);
		//assertEquals(, polynomial.derivative().apply(1), DELTA);
		 */
		assertEquals(489, polynomial.derivative().apply(5), DELTA);
		assertEquals(33, polynomial.derivative().apply(1), DELTA);
	}

	@Test
	public void testIntegrand(){

	}

}
