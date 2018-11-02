package com.test.unit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dao.VendorDaoImpl;
import com.model.Vendor;

public class vendorTest {

	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("after class");
	}

*/

	@Test
	public void testgetVendor1() 
	{
		
			 VendorDaoImpl vendordaoimpl=new VendorDaoImpl();
			 Vendor actual = vendordaoimpl.getVendor(201);
			 Vendor expected = vendordaoimpl.getVendor(201);
			 assertEquals(expected,actual);
			 
			 System.out.println("First vendor");
			 
			 
		 }
	
	@Test
	public void testgetVendor() 
	{
		
			 VendorDaoImpl vendordaoimpl=new VendorDaoImpl();
			 Vendor actual = vendordaoimpl.getVendor(202);
			 Vendor expected = vendordaoimpl.getVendor(202);
			 assertEquals(expected,actual);
			 
			 System.out.println("First vendor");
			 
			 
		 }
	
	@Test
	public void getallVendor()
	{
		VendorDaoImpl vendordaoimpl=new VendorDaoImpl();
		
		List<Vendor> actual=vendordaoimpl.getAllVendors();
		List<Vendor> expected=vendordaoimpl.getAllVendors();
		System.out.println("all vendors done");
		assertEquals(expected,actual);
		
		
	}
	
	/*							
	
	@Test
	public void deleteVendor() 
	{
		
			 VendorDaoImpl vendordaoimpl=new VendorDaoImpl();
			 Vendor actual = vendordaoimpl.deleteVendor(actual);
			 System.out.println("vendor deleted");
			 Vendor expected = vendordaoimpl.deleteVendor(expected);
			 assertEquals(expected,actual);
			 
			 //System.out.println("First vendor");
			 
			 
		 }
		 */
		
	}


