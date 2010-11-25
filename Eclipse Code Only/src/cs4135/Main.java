/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cs4135;
import java.io.*;
import java.text.DecimalFormat;

import controller.*;
import decorator.*;

import javax.swing.JOptionPane;

import composite.RAM;
/**
 *
 * @author patrickrussell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     
        TransactionManager transManager = new TransactionManager();
        
        Object[] options = {"Ireland","UK"};
        int n = JOptionPane.showOptionDialog(null,
		"What Region would you like ", "Region",
		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
		null, options, options[1]);
        if (n==0)
        {
	
        transManager.setRegion(RegionEnum.IRELAND);
		System.out.println(transManager.getRegion());
        }
        else if (n==1){
        transManager.setRegion(RegionEnum.UK);
        System.out.println(transManager.getRegion());
        }

       	Object[] computerType = {"Desktop","Laptop"};
       	int ct = JOptionPane.showOptionDialog(null,
		"What type of computer would you like ", "Computer Type",
		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
		null, computerType, computerType[1]);

       	String quantity = JOptionPane.showInputDialog("Enter Number");

       	int numquantity = Integer.parseInt(quantity);
      // 	System.out.println(numquantity);
       	{
       	
       	}
       	if (ct==0)
       	{
       	
       	transManager.addProductToList(ProductTypeEnum.DESKTOP, numquantity);
	
       	}
       	else if (ct==1){
       	transManager.addProductToList(ProductTypeEnum.LAPTOP, numquantity);

       	}
       	
       	Object[] possibilities = {"RAM", "Graphics Card", "Hard Drive"};
       
		String s = (String)JOptionPane.showInputDialog(
       	                    
       	    null, ""
       	    + "\"Please select what component you want to add\"","Additional component selection", JOptionPane.PLAIN_MESSAGE,
       	    null, possibilities,"RAM");
			String stQuantity = JOptionPane.showInputDialog("You have " + transManager.getNumber() + "\t products in your basket. \n" +
					"which one do you want to add the component to?");
			int computertodecorate = Integer.parseInt(stQuantity);
			
			if (s == "RAM"){
				transManager.decorateProduct(transManager.productList.get(computertodecorate),  ComponentEnum.RAM);
			
			System.out.println(transManager.productList.size() + transManager.productList.get(0).getName());
			
			System.out.println(transManager.productList.get(0).getPrice());
			
			}
			else if (s == "Graphics Card"){
			DecoratorManager d = new DecoratorManager();
			d.decorateProduct(transManager.productList.get(0),ComponentEnum.GRAPHICSCARD, 1);
			}
			else if (s == "Hard Drive"){
			DecoratorManager d = new DecoratorManager();
			
			d.decorateProduct(transManager.productList.get(0),ComponentEnum.HARDDRIVE, 1);
			System.out.println(transManager.productList.get(0).getPrice());
		    System.out.println("Success" + "/t" + transManager.productList.get(0).getName());
		    
		    
			}
			DecimalFormat fmtObj = new DecimalFormat("####0.00");
			String roundedTotal = fmtObj.format(transManager.total);
			JOptionPane.showMessageDialog(null,"The pre Vat total is\t" + transManager.subTotal + "\nThe total price is " + roundedTotal);
			
		}


    }


