package composite;

import java.util.ArrayList;

public class RamDecorator implements RamInterface {
    Product product;
    Product parent;
    int numberOfRam;
  
    public RamDecorator(Product product) {
       double price = product.getPrice();
       double newPrice = price + 30.0;
       product.setPrice(newPrice);

    }
	@Override
	public double getPrice() {
		return 30.00 + product.getPrice();
	}

	@Override
	public void addComponent(Product parent, Product node ) {
		
	}
	@Override
	public void removeComponent(Product product ) {
		
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<Product> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product getParent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setParent(Product product) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product findItem(String toBeFound) {
		// TODO Auto-generated method stub
		return null;
	}



    }
