
package controller;
import factory.*;
import java.util.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import region.*;
import composite.*;
import decorator.*;

@WebService(name = "TransactionManager", serviceName = "TransactionManagerService")
public class TransactionManager implements Observer {

  public Region Region;
  public ArrayList<Product> productList = new ArrayList<Product>();//List of products 
  private RegionEnum region; 
  public double subTotal = 1.0;
  public double total = 1.0; 
  Product found = null;
  
  @WebMethod()
public RegionEnum getRegion(){
      return region;
  }
  
  @WebMethod()
public void decorateProduct(@WebParam(name = "product") Product product, @WebParam(name = "componentEnum") ComponentEnum componentEnum){
	  DecoratorManager d = new DecoratorManager();
	  d.decorateProduct(product, componentEnum, 1);
  }
   
  @WebMethod()
public int getNumber() {
      return productList.size(); //number if products in list
  }
    
  @WebMethod()
public void addProductToList(@WebParam(name = "productTypeEnum") ProductTypeEnum productTypeEnum, @WebParam(name = "quantity") int quantity) {
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
  @WebMethod()
public void updateSubTotal(@WebParam(name = "newitemprice") double newitemprice){
	  subTotal += newitemprice;
  }

  @WebMethod()
public void updateTotal(@WebParam(name = "regionEnum") RegionEnum regionEnum){
	  	if (RegionEnum.IRELAND == regionEnum){
	  		Region ireland = new Ireland();
	  		 total = ireland.getVat(subTotal);
	  	}   //passes in the prevat price and returns the total price including vat
	  	else if(RegionEnum.UK == regionEnum){
	  		Region uk = new UK();
	  		total = uk.getVat(subTotal);
	  	}
  }
  @WebMethod()
public void setRegion(@WebParam(name = "newRegion") RegionEnum newRegion) {

	  	region = newRegion;	
	   
  }
  
  
DecoratorInterface decoratorInterface;
ComponentEnum componentEnum; 

  @WebMethod()
public void upgradeProduct(@WebParam(name = "product") Product product, @WebParam(name = "componentEnum") ComponentEnum componentEnum, @WebParam(name = "quantity") int quantity) {
	  //adds an additional component to a product using the decorator
	   decoratorInterface.decorateProduct(product, componentEnum, quantity);

  }
 

@WebMethod()
public void update(@WebParam(name = "o") Observable o, @WebParam(name = "arg") Object arg) {
		
		updateTotal(region);
		//when update is called by an observer we call this method to update the vat
	
	}

}