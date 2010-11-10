package controller;

import javax.jws.WebService;
@WebService
public class Server{	
	public String add(String producttoadd) {
		TransactionManager transman = new TransactionManager();
		if (producttoadd.equals("desktop"))
			transman.addProductToList(ProductTypeEnum.DESKTOP, 1);
		if (producttoadd.equals("laptop"))
			transman.addProductToList(ProductTypeEnum.LAPTOP, 1);
		
		else producttoadd = "nothing";
		 
		return "You have just added one new" + producttoadd;
	
	}
}