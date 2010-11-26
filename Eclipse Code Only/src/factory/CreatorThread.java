package factory;

import composite.*;
import composite.ComponentComposite;
import composite.Product;

class Store{
	Product motherboard;
	Product computer;
	Product chassis;
	Product graphics;
	Product screen;
	Product harddrive;
	Product cpu;
	Product ram;
	Product sound;
	
}

class CreatorThread extends Thread {

		
		private final boolean compo;
		Store stor;
		
		
		public CreatorThread(Store store, boolean composite){
			compo = composite;
			
		    stor = store;
			
		}
		
		public void run(){
		
		if (compo){
		
		stor.motherboard = new ComponentComposite();
		stor.chassis = new ComponentComposite();
		stor.computer = new ComponentComposite();

		}
		
		if (!compo){
			
			stor.cpu = new CPU();
			stor.harddrive = new HardDrive();
			stor.screen = new Screen();
			stor.graphics = new GraphicsCard();
			stor.ram = new RAM();
			stor.sound = new SoundCard();

			}
		
		}
}