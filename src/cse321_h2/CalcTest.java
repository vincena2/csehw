package cse321_h2;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {

	@Test
	public void  testadd() {
		Calc testadd = new Calc();
		testadd.add(5, 2);
		assertEquals(7, 7);
	}
	@Test
	public void  testadd1() {
		Calc testadd1 = new Calc();
		testadd1.add(-5, 2);
		assertEquals(-3, -3);
	}
	@Test
	public void  add3() {
		Calc add3 = new Calc();
		add3.add(0, 0);
		assertEquals(0, 0);
	}

	@Test
	public void  test2() {
		Calc test2 = new Calc();
		test2.mulitply(5, 2);
		assertEquals(10, 10);
	}
	
	@Test
	public void  tes21() {
		Calc test3 = new Calc();
		test3.divide(5, 2);
		assertEquals(2.50,2.50,2);
	}
	
}
