package Assignment2;
import java.util.*;

public class QuizApp {
	
	String questions[]; // 3-4
	String options[][] ; // every question has 4 options
	int answers[]; // correct answers
	
	public QuizApp() {
	 // Write code to initialize values
		questions = new String[3];
		options =new String[3][2];
		answers=new int[1];
		questions[0]="national flower?";
		questions[1]="national animal?";
		questions[2]="national song";
		options[0][0] = "lotus";
		options[0][1] = "rose";
		options[1][0] = "tiger";
		options[1][1] = "elephant";
		options[2][0] = "vande matram";
		options[2][1] = "jan gan mann";
		answers[0] = 1;
		answers[1] = 1;
		answers[2] = 1;
		
		
		
	}
	
	public float playQuiz()
	{
		System.out.println("XXXXXXXXX Lets Play Quiz XXXXXXXXXX");
		Scanner sc = new Scanner(System.in);
		float point = 0;
		// write code to execute quiz
		int input;
		for(int i=0;i<3;i++) {
			System.out.println(questions[i]);
			for(int j=0;j<2;j++) {
				System.out.println("Option "+(j+1)+": "+options[i][j]+" ");
			}
			
			System.out.println("\nEnter Your choice");
			input = sc.nextInt();
			if((--input)==answers[i]) {
				point++;
			}
			else {
				point-=0.5f;
			}
		}
		
		
		// for every correct Answer :- point ++
		// for every wrong answer :- point = point - 0.5;
		
		return point;
	}
	
	public static void main(String[] args) {
		QuizApp qp = new QuizApp();
		float point = qp.playQuiz();
		System.out.println("You have: "+point+" points");
	}
}