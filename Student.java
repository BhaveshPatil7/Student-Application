import java.util.Scanner;
public class Student
{
	String name;
	int id;
	int [] marks = new int[5];
	public Student(String name,int id)
	{
		this.name=name;
		this.id=id;
		m1();
	}
	public void m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		for (int i=0; i<marks.length; i++) 
		{
			marks[i]=sc.nextInt();
		}
	}
	public String toString()
	{
		String data = "";
		data = data+"name="+""+"id"+"marks={";
		for(int i=0;i<marks.length;i++)
		{
			data+=marks[i]+"";
		}
		return data+"}";
	}
}