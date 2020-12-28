package withArrayList;

import java.util.ArrayList;

public class CustomerTest {

		public static void main(String[] args) {
			
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			
			Customer customerLee = new Customer(101, "일반고객 이");
			Customer customerKim = new Customer(102, "일반고객 김");
			GoldCustomer customerHong = new GoldCustomer(103, "골드고객 홍");
			GoldCustomer customerYou = new GoldCustomer(104, "골드고객 유");
			VIPCustomer customerKang = new VIPCustomer(105, "VIP강", 5555);
			
			customerList.add(customerLee);
			customerList.add(customerKim);
			customerList.add(customerHong);
			customerList.add(customerYou);
			customerList.add(customerKang);
			
			System.out.println("-----고객정보-----");
			for(Customer customer : customerList){
				System.out.println(customer.showCustomerInfo());
			}
			
			System.out.println("----할인율과 보너스 포인트 결과-------");
			int price = 10000;
			for(Customer customer : customerList) {
				
				int cost = customer.calePrice(price);
				System.out.println(customer.getCustomerName()+"님이" + cost + " 를 지불하였습니다.");
				System.out.println(customer.showCustomerInfo());
			}
			
		}
}
