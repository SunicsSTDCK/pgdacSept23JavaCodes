enum WeekDays{ 
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
}

public class DemoEnum {

	public static void main(String[] args) {
		WeekDays today; 			
		today = WeekDays.SATURDAY; 
		System.out.println("Today is "+today);
		

	}

}
