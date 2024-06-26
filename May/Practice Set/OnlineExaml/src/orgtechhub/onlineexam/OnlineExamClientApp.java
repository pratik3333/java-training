package orgtechhub.onlineexam;

import java.util.*;

import Org.techhub.question.Question;
import orgtechhub.helper.OnlineExamHelper;

public class OnlineExamClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlineExamHelper helper= new OnlineExamHelper();
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Enter 1 for adding question");
			System.out.println("Enter 2 for viweing all questions");
			System.out.println("Enter 3 for removing question by ID");
			System.out.println("Enter 4 for removing question by question");
			System.out.println("Enter 5 for searching question");
			System.out.println("Enter 6 for searching question");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter the question id");
				int qid=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the question");
				String question=sc.nextLine();
				
				System.out.println("Enter the option1 value");
				String option1=sc.nextLine();
				System.out.println("Enter the option2 value");
				String option2=sc.nextLine();
				System.out.println("Enter the option3 value");
				String option3=sc.nextLine();
				System.out.println("Enter the option4 value");
				String option4=sc.nextLine();
				
				System.out.println("Enter the answer");
				String answer=sc.nextLine();
				
				Question q=new Question();
				
				q.setId(qid);
				q.setQuestion(question);
				q.setOption1(option1);
				q.setOption2(option2);
				q.setOption3(option3);
				q.setOption4(option4);
				q.setAnswer(answer);
				
				helper.addNewQuestion(q);
				break;
				
				
			case 2:
				helper.viewAllQuestion();
				break;
				
			case 3:
				
				System.out.println("Enter Question id for removing");
				int rid=sc.nextInt();
				
				helper.removeQuestion(rid-1);
				
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter question for removing");
				String rque=sc.nextLine();
				helper.rempveQuestionByQuestion(rque);
				break;
				
			case 5:
				sc.nextLine();
				System.out.println("Enter Question");
				String sque=sc.nextLine();
				helper.searchQuestion(sque);
				break;
				
			case 6:
				helper.attemptQuestion();
				break;
				default:
					System.out.println("Wrong choice");
			}
		}
		while(true);
		
		

	}

}
