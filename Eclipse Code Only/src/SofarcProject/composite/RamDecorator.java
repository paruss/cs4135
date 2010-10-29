package composite;
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
	public Product getChild(int i) {
		return null;
	}

	@Override
	public String getName() {
		return "ram";
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
	
    }
