package Cobertura;

import junit.framework.TestCase;


public class TestMain extends TestCase {
	

	public void test(){
		Main ma = new Main();
		int res = ma.add(10, 10);
		assertEquals(20,res);
	}
}
