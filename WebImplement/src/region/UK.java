package region;

public class UK implements Region {

	private double vatRate = 1.2;
	
	public double getVat(double subTotal){
		
		return subTotal * vatRate;
	}

}

