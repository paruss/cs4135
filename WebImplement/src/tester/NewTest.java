package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import controller.*;
import factory.*;
public class NewTest {

	TransactionManager transManager;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testTransactionManager() {
		transManager = new TransactionManager();
		assertNotNull(transManager);
		
	}

	@Test
	public void testGetRegion() {
		transManager = new TransactionManager();

		assertNotNull(transManager.getRegion());
		transManager.setRegion(RegionEnum.IRELAND);
		assertEquals(RegionEnum.IRELAND, transManager.getRegion());
		
	}
	
	@Test
	public void testGetNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddProductToList() {
		
		transManager.addProductToList(ProductTypeEnum.DESKTOP, 1);
		//ProductFactory factory = new ComputerFactory();
		assertNotNull(transManager.productList.indexOf(0));
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateTotal() {
		
		/*
		RegionEnum region = RegionEnum.IRELAND;
		transManager.updateTotal(region);
		assertNotNull(transManager.Total);
		*/
	}

	@Test
	public void testSetRegion() {
		transManager.setRegion(RegionEnum.IRELAND);
		assertNotNull(transManager.getRegion());
		
	}

	@Test
	public void testUpgradeProduct() {
		fail("Not yet implemented");
	}

}
