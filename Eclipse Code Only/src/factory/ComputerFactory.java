package factory;

import java.util.Observable;
import java.util.Observer;
import composite.*;
import controller.*;
import factory.Xthread.componentBank;

class Xthread extends Thread {

	private final componentBank bank;
	private boolean compo;
	
	Xthread(componentBank bank1, boolean composite){
		bank = bank1; compo = composite;
	}

	
	 class componentBank {
		  
		  volatile Product ram;
		  volatile Product cpu;
		  volatile Product soundcard;
		  volatile Product screen;
		  volatile Product grapics;
		  volatile Product motherboard;
		  volatile Product chassis;
		  volatile Product computer;
		  volatile Product harddrive;
		  
	 }
		public void run(){
			if (compo = true){
				System.out.println("Components being created");
				bank.ram = new RAM();
				bank.cpu = new CPU();
				bank.soundcard = new SoundCard();
				bank.grapics = new GraphicsCard();
				}
				else if (compo == false){
				System.out.println("composite thread");
				bank.computer = new ComponentComposite();
				bank.chassis = new ComponentComposite();
				bank.motherboard = new ComponentComposite();
				}
		

	}
}
		

public class ComputerFactory extends Observable implements ProductFactory  {

  public ProductTypeEnum newProduct;
  private Observer transactionManagerRef;

  public ComputerFactory(Observer observerRef){
	  
	  transactionManagerRef = observerRef;
  }
  
  @Override
 
  public Product createProduct(ProductTypeEnum productTypeEnum) {
		if(ProductTypeEnum.DESKTOP == productTypeEnum){
			System.out.println("Creating Computer");
			return createDesktopComputer();
		}	
	    else if(ProductTypeEnum.LAPTOP == productTypeEnum){
	    	return createLaptopComputer();
	    }
		//find out what type of computer we need and create it using the factory	
		return null;
		
	}
  
  public Product createDesktopComputer() {
	  
	  
	  System.out.println("Handed to desktop");
	  componentBank bank = new componentBank();
	  Thread thread1 = new Thread (new Xthread(bank, false));
	  Thread thread2 = new Thread (new Xthread(bank, true));
	  thread1.run();
	  thread2.run();
		  
	
		((ComponentComposite) bank.motherboard).addObserver(transactionManagerRef);
		
		bank.motherboard.addComponent(bank.motherboard, bank.ram);
		bank.motherboard.addComponent(bank.motherboard, bank.cpu);
		bank.motherboard.addComponent(bank.motherboard, bank.soundcard);
		bank.motherboard.addComponent(bank.motherboard, bank.grapics);
	
		Product chassis = new ComponentComposite();
		((ComponentComposite) chassis).addObserver(transactionManagerRef);
		
		chassis.addComponent(chassis, bank.motherboard);
		chassis.addComponent(chassis, bank.harddrive);
			
		Product computer = new ComponentComposite();
		((ComponentComposite) bank.computer).addObserver(transactionManagerRef);
		
		computer.addComponent(bank.computer, bank.chassis);
		computer.addComponent(bank.computer, bank.screen);
		return bank.computer;
        
  }


  public Product createLaptopComputer() {
  

	Product motherboard = new ComponentComposite();
	
	Product ram = new RAM();
	Product cpu = new CPU();
	Product sound = new SoundCard();
	Product screen = new Screen();
	Product graphics = new GraphicsCard();
	Product harddrive = new HardDrive();
	
	((ComponentComposite) motherboard).addObserver(transactionManagerRef);
	
	motherboard.addComponent(motherboard, ram);
	motherboard.addComponent(motherboard, cpu);
	motherboard.addComponent(motherboard, sound);
	motherboard.addComponent(motherboard, graphics);
	
	Product chassis = new ComponentComposite();
	
	((ComponentComposite) chassis).addObserver(transactionManagerRef);
	
	chassis.addComponent(chassis, motherboard);

	chassis.addComponent(chassis, harddrive);
	Product computer = new ComponentComposite();
	
	((ComponentComposite) computer).addObserver(transactionManagerRef);
	
	computer.addComponent(computer, chassis);
	computer.addComponent(computer,screen);

	return computer;
  }
}


