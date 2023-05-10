package Array;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		int[] Array = {10,30,20,50,40};
		int[] ArraycopyOfRange = Arrays.copyOfRange(Array,0, Array.length);
		System.out.println(ArraycopyOfRange);
		int ArrayCopy[] = Arrays.copyOf(ArraycopyOfRange, 3);
		System.out.println(ArrayCopy);
	}

}
