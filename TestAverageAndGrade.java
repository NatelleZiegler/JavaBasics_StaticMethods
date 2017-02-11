import java.util.*;
import java.io.*;
public class TestAverageAndGrade {
	public static void main(String[] args) throws IOException {
		int testScore;
		char grade;
		Scanner scan = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("TestAvg.txt");
		System.out.println("Please enter five test scores.");
		for(int count = 1; count <= 5; count++) {
			System.out.print("Test " + count + ": ");
			testScore = scan.nextInt();
			scan.nextLine();
			while (testScore < 0 || testScore > 100) {
				if (testScore < 0) {
					System.out.println("Please make sure your test score is greater than or equal to 0.");
				}
				else {
					System.out.println("Please make sure your test score is less than or equal to 100.");
				}
				System.out.print("Test " + count + ": ");
				testScore = scan.nextInt();
				scan.nextLine();
			}
			outputFile.println(testScore);
		}
		
		outputFile.close();
		
		File myFile = new File("TestAvg.txt");
		Scanner inputFile = new Scanner(myFile);
		
		System.out.println("Here are the grades you entered along with their corresponding letter grades.");
		for (int review = 1; review <= 5; review++) {
			System.out.print("Test " + review + ": ");
			testScore = inputFile.nextInt();
			inputFile.nextLine();
			grade = determineGrade(testScore);
			System.out.print(testScore + "\t" + grade);
			System.out.println();
		}
		
		inputFile.close();
		
		File seeFile = new File("TestAvg.txt");
		Scanner scanFile = new Scanner(seeFile);
		
		int score1, score2, score3, score4, score5;
		int average;
		char averageLetterGrade;
		score1 = scanFile.nextInt();
		score2 = scanFile.nextInt();
		score3 = scanFile.nextInt();
		score4 = scanFile.nextInt();
		score5 = scanFile.nextInt();
		average = calcAverage(score1, score2, score3, score4, score5);
		System.out.println("The average of the five tests scores is " + average + ".");
		averageLetterGrade = determineGrade(average);
		System.out.println("The average letter grade was a " + averageLetterGrade + ".");
		
		scanFile.close();
	}
		
		/** 
			The determineGrade method receives a numerical test score and returns a 
			corresponding letter grade.
			
			@param numScore A numerical test score
			@return letterGrade A letter grade that corresponds to the numerical score
		*/
		
		public static char determineGrade(int numScore) {
			char letterGrade;
			if (numScore >= 90 && numScore <= 100) {
				letterGrade = 'A';
			}
			else if (numScore >= 80 && numScore <= 89) {
				letterGrade = 'B';
			}
			else if (numScore >= 70 && numScore <= 79) {
				letterGrade = 'C';
			}
			else if (numScore >= 60 && numScore <= 69) {
				letterGrade = 'D';
			}
			else {
				letterGrade = 'F';
			}
			return letterGrade;
		}
		
		/**
			The calcAverage method calculates the average of five test scores.
			
			@param scoreA The first test score.
			@param scoreB The second test score.
			@param scoreC The third test score.
			@param scoreD The fourth test score.
			@param scoreE The fifth test score.
			@return average The average of five test scores.
		*/
		
		public static int calcAverage(int scoreA, int scoreB, int scoreC, int scoreD, int scoreE) {
			int average;
			average = (scoreA + scoreB + scoreC + scoreD + scoreE) / 5;
			return average;
		}
	}