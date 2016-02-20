package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	/**
	 * Tests constructor
	 * 
	 */
	@Test
	public void testCalculator() {
		Calculator test = new Calculator();
		assertNotNull(test);
	}
	
	
	/**
	 * Tests getTotal as well as basic addition functionality
	 * 
	 */
	@Test
	public void testGetTotal () {
		Calculator test = new Calculator();
		int total = test.getTotal();
		assertEquals(total, 0);
		
		test.add(3);
		total = test.getTotal();
		assertEquals(total,3);
	}
	
	
	/**
	 * tests add method functionality by adding 0, positive, and negative numbers.
	 * 
	 */
	@Test
	public void testAdd () {
		Calculator test = new Calculator();
		int total = test.getTotal();
		assertEquals(total, 0);
		
		test.add(4);
		total = test.getTotal();
		assertEquals(total,4);
		
		test.add(0);
		total = test.getTotal();
		assertEquals(total, 4);
		
		test.add(-6);
		total = test.getTotal();
		assertEquals(total,-2);
		}
	
	
	/**
	 * tests subtract method functionality by subtracting 0, positive, and negative numbers.
	 * 
	 */
	@Test
	public void testSubtract () {
		Calculator test = new Calculator();
		int total = test.getTotal();
		assertEquals(total, 0);
		
		test.subtract(4);
		total = test.getTotal();
		assertEquals(total,-4);
		
		test.subtract(0);
		total = test.getTotal();
		assertEquals(total, -4);
		
		test.subtract(-5);
		total = test.getTotal();
		assertEquals(total,1);
	}
	
	
	/**
	 * tests multiply method functionality by multiplying by positive values, negative values, and zero.
	 * 
	 */
	@Test
	public void testMultiply () {
		Calculator test = new Calculator();
		int total = test.getTotal();
		assertEquals(total, 0);
		
		test.multiply(4);
		total = test.getTotal();
		assertEquals(total,0);
		
		//for multiply to reach non-zero number
		test.add(1);
		total = test.getTotal();
		assertEquals(total, 1);
		
		test.multiply(4);
		total = test.getTotal();
		assertEquals(total,4);
		
		test.multiply(-3);
		total = test.getTotal();
		assertEquals(total,-12);
		
		test.multiply(0);
		total = test.getTotal();
		assertEquals(total,0);
	}
	
	
	/**
	 * tests divide method functionality by dividing by positive values, negative values, and zero.
	 * 
	 */
	@Test
	public void testDivide () {
		Calculator test = new Calculator();
		int total = test.getTotal();
		assertEquals(total, 0);
		
		test.divide(4);
		total = test.getTotal();
		assertEquals(total,0);
		
		//for divide to reach non-zero number
		test.add(24);
		total = test.getTotal();
		assertEquals(total, 24);
		
		test.divide(-4);
		total = test.getTotal();
		assertEquals(total,-6);
		
		test.divide(3);
		total = test.getTotal();
		assertEquals(total,-2);
		
		test.divide(0);
		total = test.getTotal();
		assertEquals(total,-2);
	}
	
	
	/**
	 * Tests history functionality by printing and verifying strings. Verifies that string isn't change if a divide
	 * 	by 0 operation is attempted
	 * 
	 */
	@Test
	public void testGetHistory () {
		Calculator test = new Calculator();
		assertEquals(0, test.getTotal());
		String history = test.getHistory();
		assertSame(history, "0");
		
		test.add(4);
		history = test.getHistory();
		assertEquals(4, test.getTotal());
		assertEquals(history, "0 + 4");
		System.out.println(history);
		
		test.multiply(3);
		history = test.getHistory();
		assertEquals(12, test.getTotal());
		assertEquals(history, "0 + 4 * 3");
		System.out.println(history);
		
		test.divide(6);
		history = test.getHistory();
		assertEquals(2, test.getTotal());
		assertEquals(history, "0 + 4 * 3 / 6");
		System.out.println(history);
		
		test.subtract(4);
		history = test.getHistory();
		assertEquals(-2, test.getTotal());
		assertEquals(history, "0 + 4 * 3 / 6 - 4");
		System.out.println(history);

		test.divide(0);
		history = test.getHistory();
		assertEquals(-2, test.getTotal());
		assertEquals(history, "0 + 4 * 3 / 6 - 4");
		System.out.println(history);
		
		test.add(-1);
		history = test.getHistory();
		assertEquals(-3, test.getTotal());
		assertEquals(history, "0 + 4 * 3 / 6 - 4 + -1");
		System.out.println(history);
	}
}
