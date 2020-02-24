package dieu_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 
{
	
 public static void main(String[] args)
 {
	 quiz();
 }
 
 public static int askQuestion(int x, int y) 
 {
	 System.out.printf("%s %d %s %d?","How much is", x, "times", y);
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
	 System.out.println("Very good!");
 }
 
 public static void displayIncorrectResponse()
 {
	 System.out.println("No. Please try again.");
 }
 
 public static void quiz() 
 {
	 SecureRandom secure = new SecureRandom();
	 int x = secure.nextInt(9) + 1;
	 int y = secure.nextInt(9) + 1;
	 
	 while(true) {
		 int answer = askQuestion(x, y);
		 int response = readResponse();
		 if(response == answer) {
			 displayCorrectResponse();
			 break;
		 }
		 displayIncorrectResponse();
	 }
 }
 
}


