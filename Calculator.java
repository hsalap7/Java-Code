package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;

public class Calculator implements ActionListener,KeyListener
{
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22;
    JTextField tf1;
    String str="";
    String result;
    float var1,var2;
    float value;
    void set()
    {
        frame=new JFrame("CALCULATOR");
        frame.setBounds(0,0,300,400);
        //Here we add text  field to recieve input
        tf1=new JTextField("");
        tf1.setBounds(12,20,261,74);
        frame.add(tf1);
        //From here on we add all the buttons
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b10=new JButton("0");
        b11=new JButton("+");
        b12=new JButton("-");
        b13=new JButton("*");
        b14=new JButton("/");
        b15=new JButton("%");
        b16=new JButton("1/x");
        b17=new JButton(".");
        b18=new JButton("=");
        b19=new JButton("DEL");
        b20=new JButton("C");
        b21=new JButton("sqrt");       //b21.setFont(new Font("Calibri",Font.BOLD,15));
        b22=new JButton("OFF");
       
           
        b1.setBounds(12,258,44,37);
        frame.add(b1);
        b2.setBounds(66,258,44,37);
        frame.add(b2);
        b3.setBounds(120,258,44,37);
        frame.add(b3);
        b4.setBounds(12,211,44,37);
        frame.add(b4);
        b5.setBounds(66,211,44,37);
        frame.add(b5);
        b6.setBounds(120,211,44,37);
        frame.add(b6);
        b7.setBounds(12,164,44,37);
        frame.add(b7);
        b8.setBounds(66,164,44,37);
        frame.add(b8);
        b9.setBounds(120,164,44,37);
        frame.add(b9);
        b10.setBounds(66,305,44,37);
        frame.add(b10);
        b11.setBounds(174,305,44,37);
        frame.add(b11);
        b12.setBounds(174,258,44,37);
        frame.add(b12);
        b13.setBounds(174,211,44,37);
        frame.add(b13);
        b14.setBounds(174,164,44,37);
        frame.add(b14);
        b15.setBounds(228,164,44,37);
        frame.add(b15);
        b16.setBounds(228,211,44,37);
        frame.add(b16);
        b17.setBounds(120,305,44,37);
        frame.add(b17);
        b18.setBounds(228,258,44,84);
        frame.add(b18);
        b19.setBounds(120,117,98,37);
        frame.add(b19);
        b20.setBounds(12,117,98,37);
        frame.add(b20);
        b21.setBounds(228,117,44,37);
        frame.add(b21);
        b22.setBounds(12,305,44,37);
        frame.add(b22);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this); 
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        
        tf1.addKeyListener(this);
     
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String... args) 
    {
        Calculator c=new Calculator();
        c.set();
    }
    
    public void calculation()
    {
        str=tf1.getText();
            String operator="";
            String vara="";
            String varb="";
            int j=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'||str.charAt(i)=='0'||str.charAt(i)=='.')
                    vara=vara+str.charAt(i);
                else if(str.charAt(i)=='+'|| str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='%')
                {
                    j=i;
                    operator=operator+str.charAt(i);
                    break;
                }
                else
                {
                    tf1.setText("Wrong Syntax");
                    break;
                }
            }
            
            for(int i=j+1;i<str.length();i++)
            {
                if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'||str.charAt(i)=='0'||str.charAt(i)=='.')
                    varb=varb+str.charAt(i);
                else
                {
                    tf1.setText("Wrong Syntax");
                    break;
                }
            }
            
            var1=Float.parseFloat(vara);
            var2=Float.parseFloat(varb);
            
            if(operator.equals("+"))
            {
                value=var1+var2;
            }
            if(operator.equals("-"))
            {
                value=var1-var2;
            }
            if(operator.equals("*"))
            {
                value=var1*var2;
            }
            if(operator.equals("/"))
            {
                value=var1/var2;
            }
            if(operator.equals("%"))
            {
                if(var1>var2)
                {
                value=var1%var2;
                }
                else
                {
                value=var1;
                }
            }
            str=str+"="+value;
            tf1.setText(str);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        
        if(event.getSource()==b1)
        {
            str=str+"1";
            tf1.setText(str);
        }
        if(event.getSource()==b2)
        {
            str=str+"2";
            tf1.setText(str);
        }
        if(event.getSource()==b3)
        {
            str=str+"3";
            tf1.setText(str);
        }
        if(event.getSource()==b4)
        {
            str=str+"4";
            tf1.setText(str);
        }
        if(event.getSource()==b5)
        {
            str=str+"5";
            tf1.setText(str);
        }
        if(event.getSource()==b6)
        {
            str=str+"6";
            tf1.setText(str);
        }
        if(event.getSource()==b7)
        {
            str=str+"7";
            tf1.setText(str);
        }
        if(event.getSource()==b8)
        {
            str=str+"8";
            tf1.setText(str);
        }
        if(event.getSource()==b9)
        {
            str=str+"9";
            tf1.setText(str);
        }
        if(event.getSource()==b10)
        {
            str=str+"0";
            tf1.setText(str);
        }
        if(event.getSource()==b11)
        {
            str=str+"+";
            tf1.setText(str);
        }
        if(event.getSource()==b12)
        {
            str=str+"-";
            tf1.setText(str);
        }
        if(event.getSource()==b13)
        {
            str=str+"*";
            tf1.setText(str);
        }
        if(event.getSource()==b14)
        {
            str=str+"/";
            tf1.setText(str);
        }
        if(event.getSource()==b15)
        {
            str=str+"%";
            tf1.setText(str);
        }
        if(event.getSource()==b16)
        {
            float x=Float.parseFloat(str);
            float result=1/x;
            str=""+result;
            tf1.setText(str);
        }
        if(event.getSource()==b17)
        {
            str=str+".";
            tf1.setText(str);
        }
        if(event.getSource()==b18)
        {
            calculation();
        }
        if(event.getSource()==b19)
        {
            String temp="";
            String s=tf1.getText();
            for(int k=0;k<s.length()-1;k++)
            {
                temp=temp+s.charAt(k);
            }
            str=temp;
            tf1.setText(str);
        }
        if(event.getSource()==b20)
        {
            str="";
            tf1.setText(str);
            return;
        }
        if(event.getSource()==b21)
        {
            double x=Double.parseDouble(str);
            double value=Math.sqrt(x);
            str="Square root of "+str+"="+value;
            tf1.setText(str);
        }
        if(event.getSource()==b22)
        {
            System.exit(0);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        System.out.println(">"+e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        System.out.println(">>"+e.getKeyCode());
        if(e.getKeyCode()==10)
        {
            calculation();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        System.out.println(">>>"+e.getKeyCode());
    }
}
