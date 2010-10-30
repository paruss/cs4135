package composite;

import java.util.ArrayList;

public class SoundCard implements Product {
	Product parent;
    double price = 40.00;
    public double getPrice(){
        return price;
    }

	public void addComponent(Product parent, Product node ) {		
	}

	public void removeComponent(Product product ) {		
	}


	public String getName() {
		return "soundcard";
	}

	public Product findItem(String toBeFound) {
		return null;
	}

	public void setPrice(double price) {		
	}

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