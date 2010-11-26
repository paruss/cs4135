package tester;

import static org.junit.Assert.*;

import java.util.Observer;

import org.junit.Before;
import org.junit.Test;

import composite.Product;

import controller.*;
import factory.ComputerFactory;
import factory.ProductFactory;
public class ThreadTester {

	TransactionManager transManager;
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testAddProductToList() {
		ComputerFactory computer = new ComputerFactory(transManager);
		Product comp = computer.createDesktopComputer();
		//ProductFactory factory = new ComputerFactory();
		assertNotNull(comp);
		//fail("Not yet implemented");
	}
}