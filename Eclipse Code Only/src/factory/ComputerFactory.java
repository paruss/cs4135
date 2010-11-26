package factory;
import java.util.Observable;
import java.util.Observer;
import composite.*;
import controller.*;


public class ComputerFactory extends Observable implements ProductFactory  {

  public ProductTypeEnum newProduct;
  private Observer transactionManagerRef;

  public ComputerFactory(Observer observerRef){
	  
	  transactionManagerRef = observerRef;
  }
  
  @Override
 
	public Product createProduct(ProductTypeEnum productTypeEnum) {
		if(ProductTypeEnum.DESKTOP == productTypeEnum){

			return createDesktopComputer();
		}	
	    else if(ProductTypeEnum.LAPTOP == productTypeEnum){
	    	return createLaptopComputer();
	    }
		//find out what type of computer we need and create it using the factory	
		return null;
		
	}
  
  public Product createDesktopComputer() {
	    Store compo = new Store();
	    Store comp = new Store();
	  	Thread t1 = new CreatorThread(compo, true);
	  	Thread t2 = new CreatorThread(comp, false);
	  	t1.run();
	  	t2.run();

		((ComponentComposite) compo.motherboard).addObserver(transactionManagerRef);
		
		compo.motherboard.addComponent(compo.motherboard, comp.ram);
		compo.motherboard.addComponent(compo.motherboard, comp.cpu);
		compo.motherboard.addComponent(compo.motherboard, comp.sound);
		compo.motherboard.addComponent(compo.motherboard, comp.graphics);
	
		
		((ComponentComposite) compo.chassis).addObserver(transactionManagerRef);
		
		compo.chassis.addComponent(compo.chassis, compo.motherboard);
		compo.chassis.addComponent(compo.chassis, comp.harddrive);
			
		
		((ComponentComposite) compo.computer).addObserver(transactionManagerRef);
		
		compo.computer.addComponent(compo.computer, compo.chassis);
		compo.computer.addComponent(compo.computer, comp.screen);
		return compo.computer;
        
  }

  public Product createLaptopComputer() {
  

	    Store compo = new Store();
	    Store comp = new Store();
	  	Thread t1 = new CreatorThread(compo, true);
	  	Thread t2 = new CreatorThread(comp, false);
	  	t1.run();
	  	t2.run();

		((ComponentComposite) compo.motherboard).addObserver(transactionManagerRef);
		
		compo.motherboard.addComponent(compo.motherboard, comp.ram);
		compo.motherboard.addComponent(compo.motherboard, comp.cpu);
		compo.motherboard.addComponent(compo.motherboard, comp.sound);
		compo.motherboard.addComponent(compo.motherboard, comp.graphics);
	
		
		((ComponentComposite) compo.chassis).addObserver(transactionManagerRef);
		
		compo.chassis.addComponent(compo.chassis, compo.motherboard);
		compo.chassis.addComponent(compo.chassis, comp.harddrive);
			
		
		((ComponentComposite) compo.computer).addObserver(transactionManagerRef);
		
		compo.computer.addComponent(compo.computer, compo.chassis);
		compo.computer.addComponent(compo.computer, comp.screen);
		return compo.computer;
  } 

}