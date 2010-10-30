
 package composite;
import java.util.*;

public class ComponentComposite extends Observable implements Product {
  ArrayList<Product> productComponents = new ArrayList<Product>();
  String description;
  String name;
  Double price = 0.0;
  Product parent;
 
  //Woo! It worked!
  public Product myProduct;
  ArrayList <Product> prodComps = productComponents;
  ArrayList <Product> compos = productComponents;
  ArrayList <Product> traverse;
  public Product findItem(String toBeFound){
	 /*Iterate through the composite structure and return a reference
	  * to the product matching the string name
	  */ 
	 
	  
	  Iterator<Product> iterator = productComponents.iterator();
	  while (iterator.hasNext()){
		  iterator = compos.iterator();
		  Product product =
			  (Product)iterator.next();
		  String compname = product.getName();
		  System.out.println("Is" + compname + toBeFound + "?");
		  if (compname.equals(toBeFound))
		  return product;
		  if (product.getName() == "composite")
		  {
			  traverse.add(product);
		
		  }	  
	
  	}
	  compos = traverse.get(1).getChildren();
	  findItem(toBeFound);	
	  return null;
		  
	  }

  public ArrayList<Product> getChildren() {
	return productComponents;  
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
	 ArrayList <Product> children = this.getChildren();
  	 int i = children.size();
  	 int j = 0;
  	
	  while(i != 0){  
	  	 Product child = children.get(j);
	  	 RAM ram = new RAM();
	  	 System.out.println(ram.getPrice() + child.getPrice());
		 price = price + child.getPrice();
		 j--;
		 i--;
		 return price;
	  }
return (Double) null;
	  
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