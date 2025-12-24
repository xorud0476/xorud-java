package day02;
import java.util.Scanner;
import java.util.Random;
/*
 * 컴퓨터가 임의의 난수를 만들어 유저가 입력한 값과 비교
 * 0 : 가위
 * 1 : 바위
 * 2: 보
 * 난수의 범위는 0, 1, 2까지 3개의 정수
 */

public class RPS {

	public static void main(String[] args) {

		int com, user;
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
		com = ran.nextInt(3); // 난수가 만들 수 있는 숫자는 0이상 3미만
		
		System.out.println("가위(0): 바위(1): 보(2): 중 하나를 입력하세요");
		user = scan.nextInt();
		if(user == 3 || user == 3) {
			System.out.println("프로그램 종료!");
			break;
		}
		// 조건 판단
		// 1. user가 승리 할 경우 : 가위:0, 보:2 / 바위:1,가위:0 / 보:2,바위:1
		if((user == 0 && com == 1) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("유저 승!");
			System.out.println("컴퓨터 값:" + com);
		}
		// 2. 비기는 경우 : 가위, 가위 / 보, 보 / 바위, 바위
		else if((user == 0 && com == 0) || (user == 1 && com == 1) || (user == 2 && com == 2)) {
			System.out.println("비김!");
			System.out.println("컴퓨터 값" + com);
		}
		// 3. user 패
		else {
			System.out.println("컴퓨터 승리!");
		}
		
		} //while문 종료
		
		
	
	}

}
