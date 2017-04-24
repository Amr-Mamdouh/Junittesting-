package org.jfree.data.test;
import org.jfree.data.DataUtilities;
import static org.junit.Assert.*;
import org.jfree.data.DefaultKeyedValues2D;
import org.junit.Test;
import org.jfree.data.DefaultKeyedValues;
public class DataUtilitiesTest {

	DefaultKeyedValues2D v =new DefaultKeyedValues2D();
Number arrnum[]=new Number[4];
Number arrnum2[]=new Number[4];
Number arrnum3[]=new Number[4];
Number arrnum4[]=new Number[4];
double arrdata[]=new double[4];
double arrdata2[]=null;

public void prepararr1D()	
{
for (double i=0;i<4;i++)
	arrdata[(int) i]=i;
for (double i=0;i<4;i++)
	arrnum[(int) i]=i;
for (double i=0;i<4;i++)
	arrnum2[(int) i]=-i;
for (double i=0;i<4;i++)
	arrnum3[(int) i]=i+1;
for (double i=0;i<4;i++)
	arrnum4[(int) i]=i-1;
}

Number arrnum2d[][]=new Number[4][2];
Number arrnum2d2[][]=new Number[4][2];
Number arrnum2d3[][]=new Number[4][2];
Number arrnum2d4[][]=new Number[4][2];
double arrdata2d[][]=new double[4][2];
double arrdata2d2[][]=null;
public void prepare2DArray()
	{
		for(double i =0;i<4;i++)
		{
			for (double j=0;j<2;j++)
				arrdata2d[(int) i][(int) j]=i+j;
		}
		for(double i =0;i<4;i++)
		{
			for (double j=0;j<2;j++)
				arrnum2d[(int) i][(int) j]=i+j;
		}
		for(double i =0;i<4;i++)
		{
			for (double j=0;j<2;j++)
				arrnum2d2[(int) i][(int) j]=-i+j;
		}
		for(double i =0;i<4;i++)
		{
			for (double j=0;j<2;j++)
				arrnum2d3[(int) i][(int) j]=i+j+1;
		}
		for(double i =0;i<4;i++)
		{
			for (double j=0;j<2;j++)
				arrnum2d4[(int) i][(int) j]=i+j-1;
		}
	}

	DefaultKeyedValues2D da=null;
	 DefaultKeyedValues key=new  DefaultKeyedValues();
	 DefaultKeyedValues key2=new  DefaultKeyedValues();
	 DefaultKeyedValues key3=new  DefaultKeyedValues();
	 DefaultKeyedValues key4=null;
	 DefaultKeyedValues key5=new  DefaultKeyedValues();
	 public void preparekry()
	 {
		 key.addValue("0",5);
		 key.addValue("1",9);
		 key.addValue("2",2);
	 }
	 public void preparekry2()
	 {
		 key.addValue("0",0.3125);
		 key.addValue("1",0.875);
		 key.addValue("2",  1.0);
	 }
	 public void preparekry3()
	 {
		 key.addValue("0",-0.3125);
		 key.addValue("1",0.875);
		 key.addValue("2", - 1.0);
	 }
	 public void preparekry5()
	 {
		 key.addValue("0",3.3125);
		 key.addValue("1",1.875);
		 key.addValue("2",  2.0);
	 }
	public void prepare2D(){
	v.addValue(5,"1","1");
	v.addValue(9,"1","2");
	v.addValue(14,"1","3");

	v.addValue(10,"2","1");
	v.addValue(15,"2","2");
	v.addValue(14,"2","3");

	v.addValue(9,"3","1");
	v.addValue(12,"3","2");
	v.addValue(25,"3","3");
	//assertEquals(24,DataUtilities.calculateColumnTotal(v,0),0);
	}
	@Test
	public void coulmtotal()
	{
		prepare2D();
		assertEquals(24,DataUtilities.calculateColumnTotal(v,0),0);

	} 
	@Test
	public void coulmtotalNegative()
	{
		prepare2D();
		assertEquals(-24,DataUtilities.calculateColumnTotal(v,0),0);

	}
	@Test
	public void coulmtotalless()
	{
		prepare2D();
		assertEquals(20,DataUtilities.calculateColumnTotal(v,0),0);

	}
	@Test
	public void coulmtotalNull()
	{
		prepare2D();
		assertEquals(0,DataUtilities.calculateColumnTotal(da,0),0);

	}

	@Test
	public void rowTotal()
	{prepare2D();
		assertEquals(28,DataUtilities.calculateRowTotal(v,0),0);

	}
	@Test
	public void rowTotalNegative()
	{prepare2D();
		assertEquals(-28,DataUtilities.calculateRowTotal(v,0),0);

	}
	@Test
	public void rowTotalless()
	{prepare2D();
		assertEquals(26,DataUtilities.calculateRowTotal(v,0),0);

	}
	@Test
	public void rowTotalmore()
	{prepare2D();
		assertEquals(30,DataUtilities.calculateRowTotal(v,0),0);

	}
	@Test
	public void rowTotalNULL()
	{prepare2D();
		assertEquals(0,DataUtilities.calculateRowTotal(da,0),0);
    }
	
	
	@Test
	public void TestcreateNumberArrayEqual()
	{prepararr1D();
		assertEquals(arrnum,DataUtilities.createNumberArray(arrdata));
	}
	@Test
	public void TestcreateNumberArrayNegative()
	{prepararr1D();
		assertEquals(arrnum2,DataUtilities.createNumberArray(arrdata));
	}
	@Test
	public void TestcreateNumberArraymore()
	{prepararr1D();
		assertEquals(arrnum3,DataUtilities.createNumberArray(arrdata));
	}
	@Test
	public void TestcreateNumberArrayless()
	{prepararr1D();
		assertEquals(arrnum4,DataUtilities.createNumberArray(arrdata));
	}
	@Test
	public void TestcreateNumberArrayNULL()
	{prepararr1D();
		assertEquals(null,DataUtilities.createNumberArray(arrdata2));
	}
	
	
	@Test 
	public void TestcreateNumberArray2D()
	{prepare2DArray();
		assertEquals(arrnum2d,DataUtilities.createNumberArray2D(arrdata2d));
	}
	@Test 
	public void TestcreateNumberArray2DNegative()
	{prepare2DArray();
		assertEquals(arrnum2d2,DataUtilities.createNumberArray2D(arrdata2d));
	}
	@Test 
	public void TestcreateNumberArray2DMore()
	{prepare2DArray();
		assertEquals(arrnum2d3,DataUtilities.createNumberArray2D(arrdata2d));
	}
	@Test 
	public void TestcreateNumberArray2Dless()
	{prepare2DArray();
		assertEquals(arrnum2d4,DataUtilities.createNumberArray2D(arrdata2d));
	}
	@Test 
	public void TestcreateNumberArray2DNULL()
	{prepare2DArray();
		assertEquals(null,DataUtilities.createNumberArray2D(arrdata2d2));
	}
@Test
public void TestCumulativePercentagesEquals()
{preparekry();
preparekry2();
	assertEquals(key2,DataUtilities.getCumulativePercentages(key));
}




@Test
public void TestCumulativePercentagesNegative()
{preparekry();
preparekry3();
	assertEquals(key3,DataUtilities.getCumulativePercentages(key));
}
@Test
public void TestCumulativePercentagesNULL()
{
	assertEquals(0,DataUtilities.getCumulativePercentages(key4));
	assertNotNull(key4);
}
@Test
public void TestCumulativePercentagesMoreragne()
{preparekry();
preparekry5();
	assertEquals(key5,DataUtilities.getCumulativePercentages(key));
}

}
