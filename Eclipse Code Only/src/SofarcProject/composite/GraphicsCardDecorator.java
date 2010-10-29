package composite;
public class GraphicsCardDecorator  implements GraphicsCardInterface {
	
	
	Product parent;
	public GraphicsCardDecorator(Product product) {
	double price = product.getPrice(); //get price of component passed in
	double newPrice = price + 30.0; //calculate the new price by adding the price of a RAM to it
	product.setPrice(newPrice);
		}
	@Override
	public double getPrice() {
		return 40.00;
	}


	@Override
	public void addComponent(Product parent, Product node) {
		
	}

	@Override
	public void removeComponent(Product product) {
		
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