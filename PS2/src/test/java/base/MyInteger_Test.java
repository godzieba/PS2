package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testisEven() {
		MyInteger a = new MyInteger(18);
		MyInteger b = new MyInteger(17);
		MyInteger c = new MyInteger(19);
		assertTrue(a.isEven());
		assertTrue(!b.isEven());
		assertFalse(c.isEven());
	}
	
	@Test
	public void testisOdd() {
		MyInteger d = new MyInteger(13);
		MyInteger e = new MyInteger(24);
		MyInteger f = new MyInteger(52);
		assertTrue(d.isOdd());
		assertTrue(!e.isOdd());
		assertFalse(f.isOdd());
	}
	
	@Test
	public void testisPrime() {
		MyInteger g = new MyInteger(3);
		MyInteger h = new MyInteger(16);
		MyInteger i = new MyInteger(6461);
		assertTrue(g.isPrime());
		assertTrue(!h.isPrime());
		assertFalse(i.isPrime());
	}
	
	@Test
	public void testStaticisEven() {
		assertTrue(MyInteger.isEven(34));
		assertTrue(!MyInteger.isEven(5));
		assertFalse(MyInteger.isEven(27));
	}
	
	@Test
	public void testStaticisOdd() {
		assertTrue(MyInteger.isOdd(13));
		assertTrue(!MyInteger.isOdd(42));
		assertFalse(MyInteger.isOdd(12));
	}
	
	@Test
	public void testStaticisPrime() {
		assertTrue(MyInteger.isPrime(2));
		assertTrue(!MyInteger.isPrime(12));
		assertFalse(MyInteger.isPrime(15));
	}
	
	@Test
	public void testObjectisEven() {
		MyInteger x = new MyInteger(42);
		MyInteger y = new MyInteger(13);
		MyInteger z = new MyInteger(6461);
		assertTrue(MyInteger.isEven(x));
		assertTrue(!MyInteger.isEven(y));
		assertFalse(MyInteger.isEven(z));
	}
	
	@Test
	public void testObjectisOdd() {
		MyInteger u = new MyInteger(13);
		MyInteger v = new MyInteger(24);
		MyInteger w = new MyInteger(742);
		assertTrue(MyInteger.isOdd(u));
		assertTrue(!MyInteger.isOdd(v));
		assertFalse(MyInteger.isOdd(w));
	}
	
	@Test
	public void testObjectisPrime() {
		MyInteger a = new MyInteger(101);
		MyInteger b = new MyInteger(102);
		MyInteger c = new MyInteger(104);
		assertTrue(MyInteger.isPrime(a));
		assertTrue(!MyInteger.isPrime(b));
		assertFalse(MyInteger.isPrime(c));
	}
	
	@Test
	public void testintequals() {
		MyInteger j = new MyInteger(216);
		MyInteger k = new MyInteger(1729);
		MyInteger l = new MyInteger(10);
		assertTrue(j.equals(216));
		assertTrue(!k.equals(1728));
		assertFalse(l.equals(11));
	}
	
	@Test
	public void testobjectequals() {
		MyInteger m = new MyInteger(18);
		MyInteger n = new MyInteger(17);
		MyInteger o = new MyInteger(19);
		MyInteger p = new MyInteger(18);
		MyInteger q = new MyInteger(12);
		MyInteger r = new MyInteger(13);
		assertTrue(m.equals(p));
		assertTrue(!n.equals(q));
		assertFalse(o.equals(r));
	}

}
