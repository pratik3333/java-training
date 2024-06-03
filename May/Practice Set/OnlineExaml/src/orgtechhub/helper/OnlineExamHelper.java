package orgtechhub.helper;

import Org.techhub.question.Question;
import java.util.*;

public class OnlineExamHelper {

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
	
}
