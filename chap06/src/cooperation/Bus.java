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
		System.out.println("버스" + busNumber + "번의 승객" +
				passsenerCount + "명이고 수입은" + money + "이다"
				);
	}

}

