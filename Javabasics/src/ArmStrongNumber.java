
public class ArmStrongNumber {

	public static void main(String[] args) {
		int num = 154,rem,res=0,c;
		c=num;
		while(num>0)
		{
			rem=num%10;
			res=(rem*rem*rem)+res;
			num = num/10;
		}
		if(c==res)
		{
			System.out.println(res+ " is a ArmStrong Number");
		}
		else {
			System.out.println("Not A ArmStrong Number");
		}

	}

}
