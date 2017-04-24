package org.jfree.data.test;

import org.junit.*;
import org.jfree.data.Range;

import static org.junit.Assert.*;




public class RangeTest {
Range e=new Range(1.0,10.0);
	
	
	@Test
	public void TestLowerBoundEqual()
	{
		assertEquals(1.0,e.getLowerBound(),0);
		
	}
	@Test
	public void TestLowerBoundmore1()
	{
		assertEquals(2.0,e.getLowerBound(),0);
	}
	@Test
	public void TestLowerBondmore2()
	{
		
		assertEquals(1.001,e.getLowerBound(),0);
	}
	@Test
	public void TestLowerBondless1()
	{
		assertEquals(-1.0,e.getLowerBound(),0);
	}
	@Test
	public void TestLowerBondless2()
	{
		assertEquals(0,e.getLowerBound(),0);
	}
	@Test
	public void TestUpperBoundEqual()
	{
		assertEquals(10,e.getUpperBound(),0);
		
	}
	@Test
	public void TestUpperBoundmore1()
	{
		assertEquals(12,e.getUpperBound(),0);
	}
	@Test
	public void TestUpperBondmore2()
	{
		assertEquals(10.255,e.getUpperBound(),0);
		
	}
	@Test
	public void TestUpperBondless1()
	{
		assertEquals(-10.0,e.getUpperBound(),0);
	}
	@Test
	public void TestUpperBondless2()
	{
		assertEquals(9.75,e.getUpperBound(),0);
	}

	@Test
	public void TestLengthEqulal()
	{
		assertEquals(10,e.getLength(),0);
	}
	@Test
	public void TestLengtNegative()
	{
		assertEquals(-10,e.getLength(),0);
	}
	@Test
	public void TestLengthMore()
	{
		assertEquals(10.025,e.getLength(),0);
	}
	@Test
	public void TestLengthLess()
	{
		assertEquals(9.75,e.getLength(),0);
	}
	
	@Test 
	public void TestCentralEqual()
	{
		
		assertEquals(5,e.getCentralValue(),0);
	}
	@Test 
	public void TestCentralNegative()
	{
		
		assertEquals(-5,e.getCentralValue(),0);
	}
	@Test 
	public void TestCentralLess()
	{
		
		assertEquals(4.099,e.getCentralValue(),0);
	}
	@Test 
	public void TestCentralMore()
	{
		
		assertEquals(5.0052,e.getCentralValue(),0);
	}
@Test
public void TestContainEquialantValid()
{
	assertEquals(true,e.contains(5));
}
@Test
public void TestContainEquialantinValid()
{
	assertEquals(true,e.contains(11));
}
@Test
public void TestContainBoundry1()
{
	assertEquals(true,e.contains(1));
}
@Test
public void TestContainBoundry2()
{
	assertEquals(true,e.contains(10));
}
@Test
public void TestContainBoundry3()
{
	assertEquals(false ,e.contains(0));
}
@Test
public void TestContainBoundry4()
{
	assertEquals(false,e.contains(10.5));
}
@Test
public void TestContainBoundry5()
{
	assertEquals(false,e.contains(0.5));
}
}
