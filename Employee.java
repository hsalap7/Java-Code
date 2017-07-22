import javax.swing.JOptionPane;
class Employee
{
	int id;
	String name, designation, doj,email,city;
	float salary;
	long mob;
	
	void store()
	{
		String ID=JOptionPane.showInputDialog(null,"Enter ID");
		id=Integer.parseInt(ID);
		name=JOptionPane.showInputDialog(null,"Enter Name");
		designation=JOptionPane.showInputDialog(null,"Enter Designation");
		String Sal=JOptionPane.showInputDialog(null,"Enter Salary");
		salary=Float.parseFloat(Sal);
		doj=JOptionPane.showInputDialog(null,"Enter Date of Joining (dd/mm/yyyy)");
		String mobile=JOptionPane.showInputDialog(null,"Enter Mobile Number");
		mob=Long.parseLong(mobile);
		email=JOptionPane.showInputDialog(null,"Enter email id");
		city=JOptionPane.showInputDialog(null,"Enter City");
	}
	
	void info()
	{
		String message=" ID | Name | Designation | Salary | Date of Joining | Mobile Number | Email ID | City \n "
		                +id+" "+name+" \t "+designation+"  "+salary+"  "+doj+"  "+mob+"  "+email+"  "+city;
		JOptionPane.showMessageDialog(null,message);		
	}
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.store();
		e.info();
		
	}
	
}