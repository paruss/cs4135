package region;
public class Ireland implements Region {
	
	private Float vatRate = 0.21f;
	
	public float getVat(Float subTotal){
		
		return subTotal * vatRate;
	}
}