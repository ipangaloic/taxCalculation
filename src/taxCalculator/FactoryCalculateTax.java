package taxCalculator;

public class FactoryCalculateTax {


	public TaxService getInstance(String str) {
		// TODO Auto-generated method stub
		if (str.equalsIgnoreCase("Federal")) {
			return new FederalTaxService();
		}
		else if (str.equalsIgnoreCase("State")) {
			return new StateTaxService();
		}
		else
			
		return null;
	}
	

}
