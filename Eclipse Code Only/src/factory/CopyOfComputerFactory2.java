package factory;
import java.util.Observable;
import java.util.Observer;
import composite.*;
import controller.*;




public class CopyOfComputerFactory2 extends Observable implements ProductFactory  {

  public ProductTypeEnum newProduct;
  private Observer transactionManagerRef;

  public CopyOfComputerFactory2(Observer observerRef){
	  
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
	  	//construct the composite tree with our components
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
		computer.addComponent(computer, screen);
		return computer;
        
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