package composite;

import java.util.ArrayList;

public class HardDrive implements HardDriveInterface {
	
	Product parent;
    public void getChild(){

    }

	@Override
	public double getPrice() {
		return 50.00;
	}

	@Override
	public void addComponent(Product parent, Product node) {
		
	}

	@Override
	public void removeComponent(Product product) {
		
	}


	@Override
	public String getName() {
		return "harddrive";
	}

	@Override
	public Product findItem(String toBeFound) {
		return null;
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

	@Override
	public void setName(String name) {
		
	}

	@Override
	public ArrayList<Product> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}
}