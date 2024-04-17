import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabase
{
	List l=new ArrayList();
	Scanner sc=new Scanner(System.in);
	public void addStudent()
	{
		System.out.println("enter name");
		String name=sc.next();

		System.out.println("enter id");
		int id=sc.nextInt();
		
		Student s=new Student(name,id);
		for(int i=0;i<l.size();i++)
		{
			//{yash id 1 marks {12 12 12 12 12}}
			Student s1=(Student)l.get(i);
			if(s1.id==id)
			{
				System.err.println("duplicate id");
				return;
			}
		}
		l.add(s);
		System.out.println("student is added");
		
	}
	public void removeStudent()
	{
		System.out.println("enter id");
		int id=sc.nextInt();
		for(int i=0;i<l.size();i++)
		{
			Student s=(Student)l.get(i);
			if(s.id==id)
			{
				l.remove(s);
				System.out.println("student is removed");
				return;
			}
		}
		System.err.println("id is not found");
		
	}
	public void updateStudent()
	{
		
		System.out.println("udda");
	}
	public void searchStudent()
	{
		System.out.println("search");
	}
	public void display()
	{
		System.out.println(l);
	}
}