package region;

public class UK implements Region {

	private Float vatRate = 0.2f;
	
	public float getVat(Float subTotal){
		
		return subTotal * vatRate;
	}

}

