package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
	/*	Customer customerLee = new Customer(11100, "LEE");
		
		int price = customerLee.calePrice(10000);
		System.out.println("���ұݾ���" + price + "�̰�, "+customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(11100, "Kim", 100);
		customerKim.CalcPrice(10000);
		System.out.println("���ұݾ���" + price + "�̰�, "+ customerKim.showCustomerInfo());
	 */
		
		Customer customerWho = new VIPCustomer(11100, "Who", 100);
		int price = customerWho.calePrice(10000);
		System.out.println("���ұݾ���" + price + "�̰�, "+ customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
		
	}

}
