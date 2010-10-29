package decorator;
import composite.*;
import controller.*;
import java.util.Observable;

public class DecoratorManager extends Observable implements DecoratorInterface{

  public Product decorateProduct(Product product, ComponentEnum componentEnum, int quantity){
  
	  if( ComponentEnum.RAM == componentEnum){
	  	  return addRam(product, quantity);
	  	  /*find out what item is to be decorated then call add ram
	  	  to decorate the product
	  	  */
	  }
	  else if (ComponentEnum.HARDDRIVE == componentEnum){
		  return addHardDrive(product, quantity);
	  }
	  else if (ComponentEnum.GRAPHICSCARD == componentEnum){
		  return addGraphics(product, quantity);
	  }
	  return null;
  }
  public Product addHardDrive(Product product, int quantity) {
		 Product harditem = product.findItem("harddrive");
		 Product parent = harditem.getParent();
		 RamDecorator decor = new RamDecorator(parent);
		 product.removeComponent(harditem);
		 harditem.addComponent(parent, decor);
		 return harditem;
	  
  }
  public Product addGraphics(Product product, int quantity) {
		  Product graph = product.findItem("graphics");
		  Product parent = graph.getParent();
		  RamDecorator decor = new RamDecorator(parent);
		  product.removeComponent(graph);
		  product.addComponent(parent, decor);
		  return product;
  }
  public Product addRam(Product product, int quantity) {
	  	 /* when it is called we first find an item in the 
	  	 composite tree matchin the name then we get its parent,
	  	 remove it, decorate it and place the newly decorated component
	  	 back into the tree.
	  	 */
		 Product ramitem = product.findItem("ram");
		 Product parent = ramitem.getParent();
		 RamDecorator decor = new RamDecorator(parent);
	 	 product.removeComponent(ramitem);
		 product.addComponent(parent, decor);
		 return product;	
	

}
}



