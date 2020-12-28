package withArrayList;

import java.util.ArrayList;

public class CustomerTest {

		public static void main(String[] args) {
			
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			
			Customer customerLee = new Customer(101, "�Ϲݰ� ��");
			Customer customerKim = new Customer(102, "�Ϲݰ� ��");
			GoldCustomer customerHong = new GoldCustomer(103, "���� ȫ");
			GoldCustomer customerYou = new GoldCustomer(104, "���� ��");
			VIPCustomer customerKang = new VIPCustomer(105, "VIP��", 5555);
			
			customerList.add(customerLee);
			customerList.add(customerKim);
			customerList.add(customerHong);
			customerList.add(customerYou);
			customerList.add(customerKang);
			
			System.out.println("-----������-----");
			for(Customer customer : customerList){
				System.out.println(customer.showCustomerInfo());
			}
			
			System.out.println("----�������� ���ʽ� ����Ʈ ���-------");
			int price = 10000;
			for(Customer customer : customerList) {
				
				int cost = customer.calePrice(price);
				System.out.println(customer.getCustomerName()+"����" + cost + " �� �����Ͽ����ϴ�.");
				System.out.println(customer.showCustomerInfo());
			}
			
		}
}
