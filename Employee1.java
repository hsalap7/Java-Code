import javax.swing.JOptionPane;
class Employee1
{
	String name;
	double basic_salary,total_salary;
	double hra, ta, da;
	double pf, tds, installment;
	
	void store()
	{
		name=JOptionPane.showInputDialog(null,"Enter your name");
		String basic_s=JOptionPane.showInputDialog(null,"Enter your basic monthly salary");
		basic_salary=Double.parseDouble(basic_s);
	}
	void show()
	{ 
		String message="Your Name is "+name+" and your basic monthly salary is Rs."+basic_salary+"\n                                      Press ok if correct";
		JOptionPane.showMessageDialog(null,message);
		
	}
	void calculate()
	{
		if(basic_salary<5000){}
		else if(basic_salary>4999&& basic_salary<10001)
		{
			hra=0.04*basic_salary;
			ta=0.05*basic_salary;
			da=0.06*basic_salary;
			pf=0.07*basic_salary;
		}
		else if(basic_salary>10000 && basic_salary<15001)
		{
			hra=0.05*basic_salary;
			ta=0.06*basic_salary;
			da=0.07*basic_salary;
			pf=0.08*basic_salary;
		}
		else if(basic_salary>15000 && basic_salary<20001)
		{
			hra=0.06*basic_salary;
			ta=0.07*basic_salary;
			da=0.08*basic_salary;
			pf=0.09*basic_salary;
		}
		else if(basic_salary>15000 && basic_salary<20001)
		{
			hra=0.07*basic_salary;
			ta=0.08*basic_salary;
			da=0.09*basic_salary;
			pf=0.10*basic_salary;
		}
		else 
		{
			hra=0.08*basic_salary;
			ta=0.09*basic_salary;
			da=0.10*basic_salary;
			pf=0.11*basic_salary;
			if((basic_salary*12)>250000)
			{
				tds=0.10*((12*basic_salary)-250000);
				installment=tds/12;
			}
		}
		total_salary=basic_salary+hra+ta+da-pf-installment;
		String message= "Hello "+name+" your basic monthly salary being Rs."+basic_salary+
						"\nYour HRA is Rs."+hra+
						"\nYour TA is Rs."+ta+
						"\nYour DA is Rs."+da+
						"\nYour provident fund is Rs."+pf+
						"\nYour annual TDS is Rs."+tds+" whose monthly installment would be Rs."+installment+
						"\nAnd your Total monthly Salary is Rs."+total_salary;
		JOptionPane.showMessageDialog(null,message);	
	}
	public static void main(String[] args)
	{
		Employee1 e1=new Employee1();
		e1.store();
		e1.show();
		e1.calculate();		
	}
}