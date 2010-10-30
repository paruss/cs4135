package composite;

import java.util.ArrayList;

public interface Product {

  public double getPrice();
  
  public void setName(String name);
  
  public void setPrice(double price);

  public void addComponent(Product parent, Product node);

  public void removeComponent(Product productComponent);
  
  public ArrayList<Product> getChildren();
  
  public Product getParent();
  
  public void setParent(Product product);
  
  public String getName();
  
  public Product findItem(String toBeFound);

}