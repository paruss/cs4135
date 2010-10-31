package controller;
import factory.*;
import java.util.*;
import region.*;
import composite.*;
import decorator.*;

public class TransactionManager implements Observer {

  public Region Region;
  public ArrayList<Product> productList = new ArrayList<Product>();//List of products 
  private RegionEnum region; 
  public double subTotal = 1.0;
  public double total = 1.0; 
  Product found = null;
  
  public RegionEnum getRegion(){
      return region;
  }
  
  public void decorateProduct(Product product, ComponentEnum componentEnum){
	  DecoratorManager d = new DecoratorManager();
	  d.decorateProduct(product, componentEnum, 1);
  }
   
  public int getNumber() {
      return productList.size(); //number if products in list
  }
    
  public void addProductToList(ProductTypeEnum productTypeEnum, int quantity) {
	 /* this function creates a new computer factory and loops creating the specified
	  * number of prodcuts.
	  */
	 ProductFactory productFactory = new ComputerFactory(this);
	 int i = quantity;
	 while (i > 0){
		  System.out.println(productTypeEnum); 
		  Product newproduct = productFactory.createProduct(productTypeEnum);
		  productList.add(newproduct);
		  i--;
		  double newitemprice = newproduct.getPrice();
		  updateSubTotal(newitemprice);
	  	  }
  } 
  public void updateSubTotal(double newitemprice){
	  subTotal += newitemprice;
  }

  public void updateTotal(RegionEnum regionEnum){
	  	if (RegionEnum.IRELAND == regionEnum){
	  		Region ireland = new Ireland();
	  		 total = ireland.getVat(subTotal);
	  	}   //passes in the prevat price and returns the total price including vat
	  	else if(RegionEnum.UK == regionEnum){
	  		Region uk = new UK();
	  		total = uk.getVat(subTotal);
	  	}
  }
  public void setRegion(RegionEnum newRegion) {

	  	region = newRegion;	
	   
  }
  
  
DecoratorInterface decoratorInterface;
ComponentEnum componentEnum; 

  public void upgradeProduct(Product product, ComponentEnum componentEnum, int quantity) {
	  //adds an additional component to a product using the decorator
	   decoratorInterface.decorateProduct(product, componentEnum, quantity);

  }
 

public void update(Observable o, Object arg) {
		
		updateTotal(region);
		//when update is called by an observer we call this method to update the vat
	
	}

}