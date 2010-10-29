package composite;
public class RAM implements RamInterface, Product {
	Product parent;
	@Override
	public double getPrice() {
		return 30.00;
	}

	public String getName(){
		return "ram";
	}
	public Product getParent() {
		return parent;
	}
	@Override
	public void addComponent(Product parent, Product node ) {		
	}

	@Override
	public void removeComponent(Product product ) {	
	}

	@Override
	public Product getChild(int i) {
		return null;
	}

	@Override
	public Product findItem(String toBeFound) {
		return null;
	}

	@Override
	public void setPrice(double price) {	
	}

	@Override
	public void setParent(Product product) {
		parent = product;
	}

	@Override
	public void setName(String name) {		
	}

	
}