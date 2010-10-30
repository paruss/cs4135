package composite;

import java.util.ArrayList;

public class HardDriveDecorator implements HardDriveInterface{ 
	Product parent;
	public HardDriveDecorator(Product product) {
	double price = product.getPrice(); //get the price of the component passed in
    double newPrice = price + 30.0;
      product.setPrice(newPrice); //set the new price of this item to the updated amount
	}
	
	public double getPrice() {
		return 0;
	}
	
	public void addComponent(Product parent, Product node ) {
		
	}

	public void removeComponent(Product product ) {
		
	}



	public String getName() {
		return "harddrive";
	}

	public Product findItem(String toBeFound) {
		return null;
	}

	public void setPrice(double price) {	
	}

	public Product getParent() {
		return parent;
	}

	
	public void setParent(Product product) {
		parent = product;
	}

	public void setName(String name) {
		
	}

	@Override
	public ArrayList<Product> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}



	
}