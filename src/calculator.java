import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sajjad = new Scanner (System.in);


		//declaring variables
		long age, secondage;
		long ageDifference;
		String myName = "Sajjad";
		String mG = "Angelina Julie";

//inputing your own age
		System.out.println("Enter your age");

//assigning age enetered into a variable
		age = sajjad.nextLong();

//same thing for the second/girlfriend's age
		System.out.println("Enter your girlfriend age");
		secondage = sajjad.nextLong();


//declared boolean to enter the conditional statment
		boolean comparison1 = age <= secondage;
		boolean comparison2 = age > secondage;

//creating conditional if/else statment
		if(comparison1){
			System.out.println(mG + " is either older than you are or same age as you!");
		}else if(comparison2){
			System.out.println("Good to hear!! have fun " + myName + "!");
		}


//getting the remainder. the age difference
		ageDifference = age - secondage;
//printing out the results
		System.out.println("Age difference is " + ageDifference);
		
		
		
	}

}
