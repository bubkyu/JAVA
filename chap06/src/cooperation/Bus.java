package cooperation;

public class Bus {
	
	int busNumber;
	int passsenerCount;
	int money;
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		passsenerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°�" +
				passsenerCount + "���̰� ������" + money + "�̴�"
				);
	}

}

