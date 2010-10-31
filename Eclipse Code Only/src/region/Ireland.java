package region;
public class Ireland implements Region {
	
	private double vatRate = 1.21;
	
	public double getVat(double subTotal){
		
		return subTotal * vatRate;
	}
}