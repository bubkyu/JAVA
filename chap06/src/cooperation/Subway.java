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
		System.out.println("����ö" + SubwayLineNumber+
				"�°���" + passengerCount + "���̰�, ������"
				+ money + "�̴�");
	}

}
