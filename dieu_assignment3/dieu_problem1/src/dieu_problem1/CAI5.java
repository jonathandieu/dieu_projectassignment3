package dieu_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5
{
	 public static void main(String[] args)
	 {
		 quiz();
	 }
	 public static double askQuestion(double x, double y, int type) 
	 {
		 SecureRandom secure = new SecureRandom();
		 int mixture = secure.nextInt(4) + 1;
		 double result = 0;
		 
		 switch(type)
		 {
		 case 1: 
			 result = x + y;        
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "plus", y);
			 break;                 
		 case 2:                    
			 result = x * y;        
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "times", y);
			 break;                 
		 case 3:                    
			 result = x - y;        
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "minus", y);
			 break;                 
		 case 4:                    
			 result = x / y;        
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "divded by", y);
			 break;			       
		 case 5:                   
		 switch(mixture)           
		 {                         
		 case 1:                    
			 result = x + y;         
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "plus", y);
		 break;                      
		 case 2:                     
			 result = x * y;         
			 System.out.printf("\n%s %.f %s %.0f?", "What is", x, "times", y);
			 break;                  
		 case 3:                     
			 result = x - y;         
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "minus", y);
			 break;                  
		 case 4:                     
			 result = x / y;        
			 System.out.printf("\n%s %.0f %s %.0f?", "What is", x, "divided by", y);
			 break;              
		                         
		 }
		 
		 }
		 return result;
		 
		 
		
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
			 System.out.println("\nVery good!");
		 break;
		case 2:
			 System.out.println("\nExcellent!");
			 break;
		case 3:
			 System.out.println("\nNice work!");
			 break;
		case 4:
			 System.out.println("\nKeep up the good work!");
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
			 System.out.println("\nNo. Please try again.");
		 break;
		case 2:
			 System.out.println("\nWrong.Try once more.");
			 break;
		case 3:
			 System.out.println("\nDon't give up!");
			 break;
		case 4:
			 System.out.println("\nNo. Keep trying.");
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
		  
	 public static int readDifficulty()
	 {
		 Scanner scan = new Scanner(System.in);
		 int difficulty = scan.nextInt();
		 return difficulty;
	 }
	
	 public static int generateQuestionArgument(int difficulty)
	 {
		 SecureRandom secure = new SecureRandom();
		 int result = 0;
		 switch (difficulty)
		 {
		 case 1:
			 result = secure.nextInt(9);
			 break;
		 case 2:
			 result = secure.nextInt(99);
			 break;
		 case 3:
			 result = secure.nextInt(999);
			 break;
		 case 4:
			 result = secure.nextInt(9999);
			 break;
		 }
		 return result;
	 }
	 
	 public static int readProblemType()
	 {
		 Scanner scan = new Scanner(System.in);
		 int type = scan.nextInt();
		 return type;
	 }
	 
	 public static void quiz() 
	 {
		 SecureRandom secure = new SecureRandom();
		 int count = 1;
	     int num_correct = 0;
	     double x;
	     double y;
		
		 
		 System.out.println("Please select a difficulty level 1-4.");
		 int difficulty = readDifficulty();
		 
		 System.out.println("Please choose a problem type from the list below.");
		 System.out.println("1 - Addition only");
		 System.out.println("2 - Multiplication only");
		 System.out.println("3 - Subtraction only");
		 System.out.println("4 - Division only");
		 System.out.println("5 - Random mixture of all types");
		 int type = readProblemType();
		 
		 while(count <= 10)
		 {
			  x = generateQuestionArgument(difficulty);
			  y = generateQuestionArgument(difficulty);
			 
			 double answer = askQuestion(x, y, type);
			 double response = readResponse();
			 
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
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Would you like to solve a new problem set? Y/N");
		 char response = scan.next().charAt(0);
		 if(response == ('Y' | 'y'))
			 quiz();
		 else
			 System.exit(0);
	 }
	 
	 
}
