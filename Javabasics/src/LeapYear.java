
public class LeapYear {

	public static void main(String[] args) {
		int year = 2021;
		if((year%400==0)|| (year%4==0 && year%100!=0))
		{
			System.out.println(year+": year is Leap Year");
		}
		else
		{
			System.out.println(year+"year is not leap year");
		}
	
		

	}

}
