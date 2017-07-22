import java.util.Scanner;
import javax.swing.JOptionPane;
public class StudentInfo
{
	int roll;
	String name;
	private int std, english_marks, physics_marks, chemistry_marks, maths_marks;
	private String email;
	
	private int total_marks, average;
	private String grade, highest_in_subject, lowest_in_subject;
	
	void set()
	{
		name=JOptionPane.showInputDialog(null,"Enter the name of the student :");
		String rll=JOptionPane.showInputDialog(null,"Enter the roll number of the student :");
		roll=Integer.parseInt(rll);
		String stnd=JOptionPane.showInputDialog(null,"Enter the standard(9-12) of the student :");
		std=Integer.parseInt(stnd);
		while(std<9 || std>12)
		{
			stnd=JOptionPane.showInputDialog(null,"Please enter a value from 9-12:");
			std=Integer.parseInt(stnd);
			if(std<9 || std>12)
			{
				break;
			}
		}
		String eng=JOptionPane.showInputDialog(null,"Enter the marks in English for the aforesaid student :");
		english_marks=Integer.parseInt(eng);
		while(english_marks>100||english_marks<0)
		{
			eng=JOptionPane.showInputDialog(null,"Enter the marks in English for the aforesaid student in the range of 0-100 :");
			english_marks=Integer.parseInt(eng);
			if(english_marks<=100&&english_marks>=0)
			{
				break;
			}
		}
		String phy=JOptionPane.showInputDialog(null,"Enter the marks in Physics for the aforesaid student :");
		physics_marks=Integer.parseInt(phy);
		while(physics_marks>100||physics_marks<0)
		{
			phy=JOptionPane.showInputDialog(null,"Enter the marks in Physics for the aforesaid student in the range of 0-100 :");
			physics_marks=Integer.parseInt(phy);
			if(physics_marks<=100&&physics_marks>=0)
			{
				break;
			}
		}
		String chem=JOptionPane.showInputDialog(null,"Enter the marks in Chemistry for the aforesaid student :");
		chemistry_marks=Integer.parseInt(chem);
		while(chemistry_marks>100||chemistry_marks<0)
		{
			chem=JOptionPane.showInputDialog(null,"Enter the marks in Chemistry for the aforesaid student in the range of 0-100 :");
			chemistry_marks=Integer.parseInt(chem);
			if(chemistry_marks<=100&&chemistry_marks>=0)
			{
				break;
			}
		}
		String math=JOptionPane.showInputDialog(null,"Enter the marks in Mathematics for the aforesaid student :");
		maths_marks=Integer.parseInt(math);
		while(maths_marks>100||maths_marks<0)
		{
			math=JOptionPane.showInputDialog(null,"Enter the marks in Mathematics for the aforesaid student in the range of 0-100 :");
			maths_marks=Integer.parseInt(math);
			if(maths_marks<=100&&maths_marks>=0)
			{
				break;
			}
		}
		email=JOptionPane.showInputDialog(null,"Enter fathers email ID");
		while(!(email.contains("@")&&email.contains(".com")))
		{
			email=JOptionPane.showInputDialog(null,"Enter correct email ID");
			if(email.contains("@")&&email.contains(".com"))
			{
				break;
			}
		}
		confirm();
		calculate();
	}
	
	void calculate()
	{
		total_marks=english_marks+physics_marks+chemistry_marks+maths_marks;
		average=total_marks/4;
		if(average>90)
			grade="A+";
		else if(average<=90 && average>80)
			grade="A";
		else if(average<=80 && average>70)
			grade="B+";
		else if(average<=70 && average>60)
			grade="B";
		else if(average<=60 && average>50)
			grade="C+";
		else if(average<=50 && average>40)
			grade="C";
		else if(average<=40 && average>30)
			grade="D";
		else
			grade="F";
		
		if(english_marks>physics_marks && english_marks>chemistry_marks && english_marks>maths_marks )
			highest_in_subject="English";
		if(physics_marks>english_marks && physics_marks>chemistry_marks && physics_marks>maths_marks )
			highest_in_subject="Physics";
		if(chemistry_marks>physics_marks && chemistry_marks>english_marks && chemistry_marks>maths_marks )
			highest_in_subject="Chemistry";
		if(maths_marks>physics_marks && maths_marks>chemistry_marks && maths_marks>english_marks )
			highest_in_subject="Mathematics";
		
		if(english_marks<physics_marks && english_marks<chemistry_marks && english_marks<maths_marks )
			lowest_in_subject="English";
		if(physics_marks<english_marks && physics_marks<chemistry_marks && physics_marks<maths_marks )
			lowest_in_subject="Physics";
		if(chemistry_marks<physics_marks && chemistry_marks<english_marks && chemistry_marks<maths_marks )
			lowest_in_subject="Chemistry";
		if(maths_marks<physics_marks && maths_marks<chemistry_marks && maths_marks<english_marks )
			lowest_in_subject="Mathematics";
		
		
	}
	
	String displayAll(String d)
	{
		String message=String.format("\n|%-20d|%-20s|%-20s|%-20d|%-20d|%-20d|%-20d|%-20s|%-20d|%-20d|%-20s|%-20s|%-20s",roll, name,  std, english_marks, physics_marks, chemistry_marks, maths_marks, email, total_marks, average, grade, highest_in_subject, lowest_in_subject);
		return d+message;
	}
	
	void confirm()
	{
		String message=String.format("|%-20s |%-20s |%-20s |%-20s |%-20s |%-20s |%-20s |%-20s\n |%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s\n |%-20d|%-20s|%-20s|%-20d|%-20d|%-20d|%-20d|%-20s", "Roll Number","Name of student","Standard","Marks in English","Marks in Physics","Marks in Chemistry","Marks in Mathematics","Fathers email ID","-","-","-","-","-","-","-","-", roll, name,  std, english_marks, physics_marks, chemistry_marks, maths_marks, email);
		String input=JOptionPane.showInputDialog(null,"You entered\n"+message+"\n Enter 1 if correct else enter 2");
		if(input.equals("1"))
		{}
		else if(input.equals("2"))
		{
			set();
			return;
		}
	}
	
	void display()
	{
		String message=String.format("|%-20s |%-20s |%-20s |%-20s |%-20s |%-20s |%-20s |%-20s\n |%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s\n |%-20d|%-20s|%-20s|%-20d|%-20d|%-20d|%-20d|%-20s", "Roll Number","Name of student","Standard","Marks in English","Marks in Physics","Marks in Chemistry","Marks in Mathematics","Fathers email ID","-","-","-","-","-","-","-","-", roll, name,  std, english_marks, physics_marks, chemistry_marks, maths_marks, email);
		JOptionPane.showMessageDialog(null,message);
	}
}

class TestStudentInfo
{
	static int size=0, current_size=0;
	static StudentInfo student[]=new StudentInfo[100];
	
	public static void main(String... args)
	{
		String input=JOptionPane.showInputDialog(null,"Enter 1 to enter student details\nEnter 2 to view particular student data\nEnter 3 to view all data");
		if(input.equals("1"))
		{
			String sze=JOptionPane.showInputDialog(null,"Enter the number of the students");
			int new_size=Integer.parseInt(sze);
			current_size=current_size+new_size;
			for(int i=size;i<current_size;i++)
			{
				student[i]=new StudentInfo();
				student[i].set();
			}
			size=size+new_size;
			main();
		}	
		else if(input.equals("2"))
		{
			String name_check=JOptionPane.showInputDialog(null,"Enter the name of the student");
			String rll=JOptionPane.showInputDialog(null,"Enter the roll number of the student");
			int roll_check=Integer.parseInt(rll);
			for(int i=0;i<current_size;i++)
			{
				if(name_check.equals(student[i].name)&&roll_check==student[i].roll)
				{
					student[i].display();
				}
			}
			main();
		}
		else if(input.equals("3"))
		{			
			String message=String.format("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s \n |%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s \n ", "Roll Number","Name of student","Standard","Marks in English","Marks in Physics","Marks in Chemistry","Marks in Mathematics","Fathers email ID","Total Marks","Average","Grade","Highest marks in","Lowest marks in","-","-","-","-","-","-","-","-","-","-","-","-","-" );
			for(int i=0;i<current_size;i++)
			{
				message=student[i].displayAll(message);
			}
			JOptionPane.showMessageDialog(null,message);
			main();
		}
	}
}