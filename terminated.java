package day02;
import java.util.*;
public class terminated {

	public static void main(String[] args) {

		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("화씨온도를 입력하시오:");

		double f = scan.nextDouble();
		c = 5.0/9.0*(f-32);
		System.out.println("섭씨온도는" + c);

		scan.close();
	}

}
