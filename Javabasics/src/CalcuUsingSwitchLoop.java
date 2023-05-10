
public class CalcuUsingSwitchLoop {

	public static void main(String[] args) {
	      int  num1 = 10;
	      int num2 = 2;
	      int res;
	      char op = '-';
	      switch(op)
	      {
	      case'-':
	    	  res = num1-num2;
	    	  System.out.println("subtraction is:" +num1+"-"+num2 +"=" +res);
	    	  break;
	      case'+':
	    	  res = num1+num2;
	    	  System.out.println("Additon is:" +num1+"+"+ num2+"="+res);
	    	  break;
	      case'*':
	    	  res = num1*num2;
	    	  System.out.println("multiplication is:" +num1+"*"+ num2+"="+res);
	    	  break;
	      case'%':
	    	  res = num1%num2;
	    	  System.out.println("Modulus is:" +num1+"%"+  num2+"="+res);
	    	  break;
	      case'/':
	    	  res = num1/num2;
	    	  System.out.println("Division of:" +num1+"/"+ num2+"="+res);
	      }

	}

}
