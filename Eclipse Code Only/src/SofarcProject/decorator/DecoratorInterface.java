package decorator;
import composite.*;
import controller.*;
public interface DecoratorInterface {
	public Product decorateProduct(Product product, ComponentEnum componentEnum, int quantity);
	public Product addRam(Product product, int quantity);
    public Product addHardDrive(Product product, int quantity);
    public Product addGraphics(Product product, int quantity);

}