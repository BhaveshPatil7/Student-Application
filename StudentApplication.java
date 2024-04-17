import java.util.Scanner;

public class StudentApplication
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		StudentDataBase sd = new StudentDataBase();
		for (; ; ) 
		{
			System.out.println("1.Add Student" +"\n"+"2.Remove Student"+"\n"+"3.Upadate Student"+"\n"+"4.Search Student"+"\n"+"5.exit"+"\n"+"6.Display");
			switch(sc.nextInt())
			{
			case 1: sd.addStudent();
				break;
			case 2: sd.removeStudent();
				break;
			case 3: sd.updateStudent();
				break;
			case 5: sd.searchStudent();
				System.exit(1);
				break;
			case 6: sd.display();
			}
			
		}
	}
}
