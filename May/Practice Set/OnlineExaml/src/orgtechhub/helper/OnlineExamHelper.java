package orgtechhub.helper;

import Org.techhub.question.Question;
import java.util.*;

public class OnlineExamHelper {

	Scanner sc=new Scanner(System.in);
	ArrayList list=new ArrayList();
	
	public void addNewQuestion(Question question)
	{
		list.add(question);
	}
	
	public void viewAllQuestion()
	{
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			Question qn=(Question)i.next();
			
			System.out.println(qn.getId()+"\t"+qn.getQuestion()+"\t"+qn.getAnswer());
		}
	}
	
	public void removeQuestion(int rid)
	{
		boolean flag=false;
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			Question qn=(Question)i.next();
			
			if(rid==qn.getId())
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			list.remove(rid);
			System.out.println("Question Deleted succesfully......");
		}
		else
		{
			System.out.println("Id not available......");
		}
	}
	
	public void rempveQuestionByQuestion(String rque)
	{
		
		boolean flag=false;
		
		for(Object obj:list)
		{
			Question qu=(Question)obj;
			
			if(qu.getQuestion().equals(rque))
			{
				flag=true;
				list.remove(obj);
//				System.out.println(qu.getQuestion()+"\t"+qu.getAnswer());
				break;
			}
		}
//		Iterator i=list.iterator();
//		
//		while(i.hasNext())
//		{
//			Question qu=(Question)i.next();
//			
//			if(qu.getQuestion().equals(rque))
//			{
//				flag=true;
//				 n=qu.getQuestion();
//				break;
//				
//			}
//		}
		if(flag)
		{
			
			System.out.println("Question deleted ");
			
			
			
		}
		else
		{
			System.out.println("Question is not found");
		}
	}
	
	public void searchQuestion(String sque)
	{
		boolean flag=false;
		for(Object obj:list)
		{
			Question qn=(Question)obj;
			
			if(qn.getQuestion().equals(sque))
			{
				System.out.println("Question found.....");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Question not found....");
		}
	}
	
	public void attemptQuestion()
	{
		int count=0;
		
		for(Object obj:list)
		{
			Question ob=(Question)obj;
			
			System.out.println(ob.getQuestion());
			
			System.out.println("Options are "+ob.getOption1()+"\t"+ob.getOption2()+"\t"+ob.getOption3()+"\t"+ob.getOption4());
			System.out.println("Enter ans");
			String an=sc.nextLine();
			
			if(ob.getAnswer().equals(an))
			{
				count++;
			}
		}
		
		System.out.println("Corrected ans is "+count +"\t"+"out of "+"\t"+list.size());
	}
	
}
