
 package composite;
import java.util.*;

public class ComponentComposite extends Observable implements Product {
  ArrayList<Product> productComponents = new ArrayList<Product>();
  String description;
  String name;
  Double price;
  Product parent;
 
  //updating the right code?
  public Product myProduct;
  
  public Product findItem(String toBeFound){
	 /*Iterate through the composite structure and return a reference
	  * to the product matching the string name
	  */
 	  Iterator iterator = productComponents.iterator();
	  while (iterator.hasNext()){
		  Product product =
			  (Product)iterator.next();
		  String compname = product.getName();
		  System.out.println(compname + toBeFound);
		  if (compname.equals(toBeFound))
		  return product;
	
	  }
	     
	     return null;
	  }
  
  public Product getChild(int i) {
	  
  return (Product) productComponents.get(i);

  }

  public void removeComponent(Product product) {
      productComponents.remove(product);
      setChanged();
      notifyObservers();
      //pass a reference to a component and remove it from the array
 }

  public void addComponent(Product parent, Product node ) {
	  node.setName("composite");
      productComponents.add(node);
      node.setParent(parent);    
      setChanged();
      notifyObservers();
      /*add a component to a composite, also add a refernce of the parent
       * to the newly created child node
       */
  }

  
  public String getName() {
	  return name;
  }

@Override
public double getPrice() {
	return 0;
}
@Override
public void setPrice(double price) {
	
	
}
@Override
public Product getParent() {
	
	return parent;
}
@Override
public void setParent(Product product) {
	parent = product;
}

public void setName(String named){
	name = named;
}


}