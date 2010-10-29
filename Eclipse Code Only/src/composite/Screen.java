package composite;
public class Screen implements Product {
	Product parent;
	@Override
	public double getPrice() {
		return 30.00;
	}
	public void addComponent(Product parent, Product node ) {
	}

	public void removeComponent(Product product ) {
	
	}

	public Product getChild(int i ) {
		return null;
	}

	public String getName() {
		return "screen";
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
}