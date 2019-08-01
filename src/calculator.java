import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sajjad = new Scanner (System.in);
		double age, secondage, answer;
		System.out.println("Enter your age");
		age = sajjad.nextDouble();
		System.out.println("Enter your girlfriend age");
		secondage = sajjad.nextDouble();
		answer = age / secondage;
		System.out.println(answer);
		
		
		
	}

}
