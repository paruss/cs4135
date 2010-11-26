package cs4135;

import java.io.IOException;

import composite.Product;
import controller.TransactionManager;

import factory.ComputerFactoryThread;
import factory.ComputerFactoryNoThread;

public class ThreadTester {
	  public static void main(String[] args) throws IOException {
	    
		TransactionManager transManager = new TransactionManager();
		int i = 20;
		
		while (i != 0){
			
		long starttimeThread = System.nanoTime();
		ComputerFactoryThread computer = new ComputerFactoryThread(transManager);
		Product comp = computer.createDesktopComputer();
		long endtimeThread = System.nanoTime();
		
		long starttimeNoThread = System.nanoTime();
		ComputerFactoryNoThread noThread = new ComputerFactoryNoThread(transManager);
		Product comp2 = noThread.createDesktopComputer();
		long endtimeNoThread = System.nanoTime();
		
		System.out.println("The Threading time was :" + (endtimeThread - starttimeThread) + "\nThe Non Threading Time was " + (endtimeNoThread - starttimeNoThread) );
		//fail("Not yet implemented");
		i--;
		}
	
}
}
