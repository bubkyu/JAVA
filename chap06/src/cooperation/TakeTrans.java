package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student bk = new Student("bk" , 5000);
		Student jk = new Student("jk", 10000);
		
		Bus bus100 = new Bus(100);
		bk.takeBus(bus100);
		bk.showInfo();
		bus100.showInfo();
		
		Subway subwaygreen = new Subway(2);
		jk.takeSubway(subwaygreen);
		jk.showInfo();
		subwaygreen.showInfo();
		

	}

}
