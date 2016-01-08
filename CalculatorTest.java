/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoVerao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author java.04
 */
public class CalculatorTest {
    
//    public CalculatorTest() {
 //   }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
//    @Before
//    public void setUp() {
//    }
//    
//   @After
//    public void tearDown() {
//    }

    /**
     * Test of add method, of class Calculator.
     */
    //@Test
 //   public void testAdd() {
 /**      System.out.println("add");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div mpublic int add(int num1, int num2){
		return num1 +num2;
	}
	
	public double div (double num1 , double num2){
		return num1 / num2;
	}ethod, of class Calculator.
    
    @Test
        public void testDiv() {
        System.out.println("div");
        double num1 = 4;
        double num2 =3;
        Calculator instance = new Calculator();
        double expResult = 1.33332;
        double result = instance.div(num1, num2);
        assertEquals(expResult, result, 0.0);
    } */
    
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int result = c.add(10,50);
        assertEquals(60,result,0);
    }
    
    @Test
    public void testDiv(){
        Calculator c = new Calculator();
        double result = c.div(4, 3);
        assertEquals(1.33332, result , 0.0001);
    }
    
    @Test
    public void testSub(){
        Calculator c = new Calculator();
        int result = c.sub(5, 4);
        assertEquals(1,result,0);
    }
    
    @Test
    public void testEqualsStr(){
        Calculator c = new Calculator();
        boolean result = c.equalStr("oi", "oi");
        assertEquals("ok",true,result);
    }
    
    //@Test(timeout=1000) tempo de teste
    
    
}
