package inheritance;

public class GoldCustomer extends Customer{
	
	public GoldCustomer() {
		bonusRatio = 0.05;
	}

	@Override
	public int calePrice(int price) {
		// TODO Auto-generated method stub
		return super.calePrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	

}
