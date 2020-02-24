package dieu_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3
{
	 public static void main(String[] args)
	 {
		 quiz();
	 }
	 public static int askQuestion(int x, int y) 
	 {
		 System.out.printf("%s %d %s %d?\n","How much is", x, "times", y);
		 return (x * y);
	 }
	 
	 public static int readResponse() 
	 {
		 Scanner scan = new Scanner(System.in);
		 int response = scan.nextInt();
		 return response;
	 }
	 
	 public static boolean isAnswerCorrect(int response, int answer) {
		 if(response == answer) 
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 public static void displayCorrectResponse()
	 {
		 SecureRandom secure = new SecureRandom();
		 int rightmessage = secure.nextInt(4) + 1;
		 switch(rightmessage)
	{
		case 1:
			 System.out.println("Very good!");
		 break;
		case 2:
			 System.out.println("Excellent!");
			 break;
		case 3:
			 System.out.println("Nice work!");
			 break;
		case 4:
			 System.out.println("Keep up the good work!");
			 break;
	}

	
	 }
	 
	 public static void displayIncorrectResponse()
	 {
		 SecureRandom secure = new SecureRandom();
		 int wrongmessage = secure.nextInt(4) + 1;
		 switch(wrongmessage)
		 {
	
		case 1:
			 System.out.println("No. Please try again.");
		 break;
		case 2:
			 System.out.println("Wrong.Try once more.");
			 break;
		case 3:
			 System.out.println("Don't give up!");
			 break;
		case 4:
			 System.out.println("No. Keep trying.");
			 break;
	    }
	 }
	 
	 public static void displayCompletionMessage(int num_correct)
	 {
		  double score = (double) num_correct / 10 * 100;
		  System.out.printf("%s%.2f%s%n", "Your score is ", score, "%.");
		  if (score >= 75)
		   System.out.println("Congratulations, you are ready to go on to the next level!");
		  else
		   System.out.println("Please ask your teacher for extra help.");
	 }
		  
	 public static void quiz() 
	 {
		 SecureRandom secure = new SecureRandom();
		 int count = 1;
	     int num_correct = 0;
		 int x = secure.nextInt(9) + 1;
		 int y = secure.nextInt(9) + 1;
		 
		 while(count <= 10)
		 {
			  x = secure.nextInt(9) + 1;
			  y = secure.nextInt(9) + 1;
			 
			 int answer = askQuestion(x, y);
			 int response = readResponse();
			 
			 if(response == answer) 
			 {
				 displayCorrectResponse();
				 num_correct++;
				count++;
			 }
			 else
			 {
		
			 displayIncorrectResponse();
			 count++;
			 }
		 }
		 displayCompletionMessage(num_correct);
	 }
	 
}

