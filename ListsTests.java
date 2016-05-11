package alist;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListsTests
{
	//EList lst = new AList0();
	//EList lst = new AList1();
	EList lst = new AList2();
	
	@Before
	public void SetUp()
	{
		lst.clear();
	}
	
	//==========================================
	// init
	//==========================================
	@Test
	public void testinit_null() 
	{
		int[] ar = null;
		lst.init(ar);
		int[] exp = {};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testinit_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar);
		int[] exp = {4,89,5,12,75,96};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testinit_two()
	{
		int[] ar = {4, 89};
		lst.init(ar);
		int [] exp = {4, 89};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testinit_one()
	{
		int[] ar = {4};
		lst.init(ar);
		int [] exp = {4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testinit_zero()
	{
		int[] ar = { };
		lst.init(ar);
		int[] exp = {};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	//==========================================
	// size
	//==========================================
	@Test
	public void testSize_null() 
	{
		int[] ar = null;
		lst.init(ar);
		assertEquals(0, lst.size());
	}
	@Test
	public void testSize_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar); 
		assertEquals(6, lst.size());
	}
	@Test
	public void testSize_two() 
	{
		int[] ar = {4,89};		
		lst.init(ar); 
		assertEquals(2, lst.size());
	}
	@Test
	public void testSize_one() 
	{
		int[] ar = {4};
		lst.init(ar); 
		assertEquals(1, lst.size());
	}
	@Test
	public void testSize_zero() 
	{
		int[] ar = {};
		lst.init(ar); 
		assertEquals(0, lst.size());
	}

	//==========================================
	// clear
	//==========================================
	@Test
	public void testClear_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar); 
		lst.clear();
		assertEquals(0, lst.size());
		int [] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	@Test
	public void testClear_two() 
	{
		int[] ar = {4,89};
		lst.init(ar); 
		lst.clear();
		assertEquals(0, lst.size());
		int [] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	@Test
	public void testClear_one() 
	{
		int[] ar = {4};
		lst.init(ar); 
		lst.clear();
		assertEquals(0, lst.size());
		int [] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	@Test
	public void testClear_zero() 
	{
		int[] ar = {};		
		lst.init(ar); 
		lst.clear();
		assertEquals(0, lst.size());
		int [] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	@Test
	public void testClear_null() 
	{
		int[] ar = null;
		lst.init(ar); 
		lst.clear();
		assertEquals(0, lst.size());
		int [] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	
	//==========================================
	// toArray
	//==========================================
	@Test
	public void testtoArray_many()
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar); 
		int[] exp = {4,89,5,12,75,96};
		int[] act = lst.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testtoArray_two()
	{
		int[] ar = {4,89};
		lst.init(ar); 
		int[] exp = {4,89};
		int[] act = lst.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testtoArray_one()
	{
		int[] ar = {4};
		lst.init(ar); 
		int[] exp = {4};
		int[] act = lst.toArray();
		assertArrayEquals(exp,act);
	}
	@Test
	public void testtoArray_zero()
	{
		int[] ar = {};		
		lst.init(ar); 
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp,act);

	}
	@Test
	public void testtoArray_null()
	{
		int[] ar = null;
		lst.init(ar); 
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp,act);
	}
	//==========================================
	// addStart
	//==========================================
	@Test
	public void testAddStart_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar);
		lst.addStart(13);
		assertEquals(7, lst.size());
		int[] exp = {13,4,89,5,12,75,96};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	@Test
	public void testAddStart_Two() 
	{
		int[] ar = {4,89};
		lst.init(ar);
		lst.addStart(13);
		assertEquals(3, lst.size());
		int[] exp = {13,4,89};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	@Test
	public void testAddStart_One() 
	{
		int[] ar = {4};
		lst.init(ar);
		lst.addStart(13);
		assertEquals(2, lst.size());
		int[] exp = {13,4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	@Test
	public void testAddStart_zero() 
	{
		int[] ar = {};
		lst.init(ar);
		lst.addStart(13);
		assertEquals(0, lst.size());
		int[] exp = {13};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);			

	}
	@Test
	public void testAddStart_null() 
	{
		int[] ar = null;
		lst.init(ar);
		lst.addStart(13);
		assertEquals(0, lst.size());
		int[] exp = {13};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);			

	}
	
	//==========================================
	// addEnd
	//==========================================
	@Test 
	public void testAddEnd_many() 
	{
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		lst.addEnd(13);
		int[] exp = {4,89,5,12,75,96,77,23,65,45,18, 13};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test 
	public void testAddEnd_two() 
	{
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.addEnd(13);
		int[] exp = {4,89, 13};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddEnd_one() 
	{
		int[] ar = {4};
		
		lst.init(ar);
		lst.addEnd(13);
		int[] exp = {4, 13};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddEnd_zero() 
	{
		int[] ar = {};
		
		lst.init(ar);
		lst.addEnd(13);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddEnd_null() 
	{
		int[] ar = null;
		
		lst.init(ar);
	}
	@Test 
	public void testAddPos_many() 
	{
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		lst.addPos(3, 31);
		int[] exp = {4,89,31,5,12,75,96,77,23,65,45,18};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test 
	public void testAddPos_Two() 
	{
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.addPos(1, 31);
		int[] exp = {4,31,89};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddPos_One() 
	{
		int[] ar = {4};
		
		lst.init(ar);
		lst.addPos(1, 31);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddPos_Zero() 
	{
		int[] ar = {};
		
		lst.init(ar);
		lst.addPos(1, 31);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testAddPos_Null() 
	{
		int[] ar = null;
		
		lst.init(ar);
	}
	@Test 
	public void testDellEnd_many() 
	{
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		lst.delEnd();
		int[] exp = {4,89,5,12,75,96,77,23,65,45};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	@Test 
	public void testDellEnd_Two() 
	{
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.delEnd();
		int[] exp = {4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test //(expected = arayIndexOutOfBoundsException.class)
	public void testDellEnd_One() 
	{
		int[] ar = {4};
		
		lst.init(ar);
		lst.delEnd();
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testDellEnd_Zero() 
	{
		int[] ar = {};
		
		lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testDellEnd_Null() 
	{
		int[] ar = null;
		
		lst.init(ar);
	}
	@Test 
	public void testDellStart_many() 
	{
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		lst.delEnd();
		int[] exp = {89,5,12,75,96,77,23,65,45};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	} 
	@Test 
	public void testDellStart_Two() 
	{
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.delEnd();
		int[] exp = {89};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test //(expected = arayIndexOutOfBoundsException.class)
	public void testDellStart_One() 
	{
		int[] ar = {4};
		
		lst.init(ar);
		lst.delEnd();
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testDellStart_Zero() 
	{
		int[] ar = {};
		
		lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testDellStart_Null() 
	{
		int[] ar = null;
		
		lst.init(ar);
	}
	@Test 
	public void testDelPos_many() 
	{
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		lst.delPos(3);
		int[] exp = {4,89,12,75,96,77,23,65,45,18};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_Two() 
	{
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.delPos(3);
		int[] exp = {0}; //??????
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_One() 
	{
		int[] ar = {4};
		
		lst.init(ar);
		lst.delPos(3);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_Zero() 
	{
		int[] ar = {};
		
		lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testDelPos_Null() 
	{
		int[] ar = null;
		
		lst.init(ar);
	}
	//==========================================
	// max
	//==========================================	
	@Test 
	public void testMax_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar);
		assertEquals(96, lst.max());
	}
	@Test 
	public void testMax_Two() 
	{
		int[] ar = {4,89};
		lst.init(ar);
		assertEquals(89, lst.max());
	}
	@Test 
	public void testMax_One() 
	{
		int[] ar = {4};
		lst.init(ar);
		assertEquals(4, lst.max());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMax_Zero() 
	{
		int[] ar = {};
		lst.init(ar);
		lst.max();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMax_Null() 
	{
		int[] ar = null;
		lst.init(ar);
		lst.max();
	}
	
	//==========================================
	// min
	//==========================================	
	@Test 
	public void testMin_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar);
		assertEquals(4, lst.min());
	}
	@Test 
	public void testMin_Two() 
	{
		int[] ar = {4,89};
		lst.init(ar);
		assertEquals(4, lst.min());
	}
	@Test 
	public void testMin_One() 
	{
		int[] ar = {96};
		lst.init(ar);
		assertEquals(96, lst.min());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMin_Zero() 
	{
		int[] ar = {};
		lst.init(ar);
		lst.min();
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMin_Null() 
	{
		int[] ar = null;
		lst.init(ar);
		lst.min();
	}
	//==========================================
	// minInd
	//==========================================	
	@Test
	public void testMinIndxElar_many()
	{ 
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		int act = lst.minIndex();
		assertEquals(0, act);
	}
	@Test
	public void testMinIndxElar_Two()
	{ 
		int[] ar = {4,89};
		
		lst.init(ar);
		int act = lst.minIndex();
		assertEquals(0, act);
	}
	@Test
	public void testMinIndxElar_one()
	{ 
		int[] ar = {4};
		
		lst.init(ar);
		int act = lst.minIndex();
		assertEquals(0, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinIndxElar_Zero()
	{ 
		int[] ar = {};
		
		lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMinIndxElar_Null()
	{ 
		int[] ar = null;
		
		lst.init(ar);
	}
	@Test
	public void testMaxIndxElar_many()
	{ 
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		int act = lst.minIndex();
		assertEquals(5, act);
	}
	@Test
	public void testMaxIndxElar_Two()
	{ 
		int[] ar = {4,89};
		
		lst.init(ar);
		int act = lst.minIndex();
		assertEquals(1, act);
	}
	@Test
	public void testMaxIndxElar_one()
	{ 
		int[] ar = {4};
		
		lst.init(ar);
		int act = lst.minIndex();
		assertEquals(0, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxIndxElar_Zero()
	{ 
		int[] ar = {};
		
		lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testMaxIndxElar_Null()
	{ 
		int[] ar = null;
		
		lst.init(ar);
	}
	@Test 
	public void testSet_many() 
	{
		int[] ar = {4,89,5,12,75,96,77,23,65,45,18};
		
		lst.init(ar);
		lst.set(3, 100);
		int[] exp = {4,89,100,12,75,96,77,23,65,45,18};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test 
	public void testSet_Two() 
	{
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.set(1, 100);
		int[] exp = {4,100};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test 
	public void testSet_One() 
	{
		int[] ar = {4};
		
		lst.init(ar);
		lst.set(0, 100);
		int[] exp = {100};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSet_Zero() 
	{
		int[] ar = {};
		
		lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testSet_Null() 
	{
		int[] ar = null;
		
		lst.init(ar);
	}
	//==========================================
	// get
	//==========================================	
	@Test 
	public void testGet_many() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar);
		assertEquals(12, lst.get(3));
	}
	@Test 
	public void testGet_ZeroPoisk() 
	{
		int[] ar = {4,89,5,12,75,96};
		lst.init(ar);
		assertEquals(4, lst.get(0));
	}
	@Test 
	public void testGet_Two() 
	{
		int[] ar = {4,89};
		lst.init(ar);
		assertEquals(89, lst.get(1));
	}
	@Test 
	public void testGet_one() 
	{
		int[] ar = {4};
		lst.init(ar);
		assertEquals(4, lst.get(0));
	}
	@Test (expected = IllegalArgumentException.class)
	public void testGet_Zeroar() 
	{
		int[] ar = {};
		lst.init(ar);
		lst.get(0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testGet_Null() 
	{
		int[] ar = null;
		lst.init(ar);
		lst.get(0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testGet_mimo() 
	{
		int[] ar = {4,89,5};
		lst.init(ar);
		lst.get(3);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testGet_mimo_minus() 
	{
		int[] ar = {4,89,5};	
		lst.init(ar);
		lst.get(-3); 
	}
	@Test
	public void testReverse_many()
	{ 
		int[] ar = {4,89,5,12,75,96,77};
		lst.init(ar);
		lst.reverse();
		int [] exp = {77, 96, 75, 12, 5, 89, 4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);

	}
	@Test
	public void testReverse_Two()
	{ 
		int[] ar = {4,89};
		
		lst.init(ar);
		lst.reverse();
		int [] exp = {89, 4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testReverse_One()
	{ 
		int[] ar = {4};
		
		lst.init(ar);
		lst.reverse();
		int [] exp = {4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testReverse_Zero()
	{ 
		int[] ar = {};
		
		lst.init(ar);
	} 
	@Test (expected = IllegalArgumentException.class)
	public void testReverse_Null()
	{ 
		int[] ar = null;
		
		lst.init(ar);
	}


	@Test
	public void testRevHalf_many()
	{ 
		int[] ar = {4, 9, 5, 12, 15, 16};
		
		lst.init(ar);
		//AList0.revHalf(ar);
		int [] exp = {12, 15, 16, 4, 9, 5};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevHalf_Two()
	{ 
		int[] ar = {4, 16};
		
		lst.init(ar);
		//AList0.halfReverse(ar);
		int [] exp = {16, 4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevHalf_One()
	{ 
		int[] ar = {4, 16};
		
		lst.init(ar);
		//AList0.halfReverse(ar);
		int [] exp = {16, 4};
		int [] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testRevHalf_Zero()
	{ 
		int[] ar = {};
		
		//lst.init(ar);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testRevHalf_Null()
	{ 
		int[] ar = null;
		
		//lst.init(ar);
	}
}
