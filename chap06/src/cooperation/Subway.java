package cooperation;

public class Subway {
	
	int SubwayLineNumber;
	int passengerCount;
	int money;
	
	public Subway(int SubwayLineNumber) {
		this.SubwayLineNumber = SubwayLineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철" + SubwayLineNumber+
				"승객은" + passengerCount + "명이고, 수입은"
				+ money + "이다");
	}

}
