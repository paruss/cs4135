package composite;
public class CPU implements Product {
	Product parent;
	@Override
	public double getPrice() {
		
		return 100.00;
	}

	@Override
	public void addComponent(Product parent, Product node) {
		
	}

	@Override
	public void removeComponent(Product productComponent) {
		
	}

	@Override
	public Product getChild(int i) {
		return null;
	}

	@Override
	public String getName() {
		return "cpu";
		
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
		return null;
	}

	@Override
	public void setParent(Product product) {	
		parent = product;
	}

	@Override
	public void setName(String name) {

		
	}

	

}