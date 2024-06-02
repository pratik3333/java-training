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
			
			System.out.println(qn.getId()+"\t"+qn.getQuestion());
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
	
}
