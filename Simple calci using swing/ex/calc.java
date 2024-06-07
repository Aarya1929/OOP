package ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class simp extends JFrame {
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	simp(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1=new JLabel("Calculator");
		l1.setBounds(60,10,300,30);
		add(l1);
		
		t1=new JTextField(60);
		t2=new JTextField(60);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		
		t1.setBounds(100,60,120,30);
		t2.setBounds(100,100,120,30);
		
		b1.setBounds(100,160,60,30);
		b2.setBounds(160,160,60,30);
		
		b3.setBounds(100,190,60,30);
		b4.setBounds(160,190,60,30);
		
	    l2 = new JLabel("");
		l2.setBounds(100,130,100,30);
		add(l2);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(t1);
		add(t2);
		
		b1.addActionListener(new Actionlistener() {
			public void actionPerformed(ActionEvent ae) {
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				l2.setText("Result:"+(n1+n2));
			}
		});
		
		b2.addActionListener(new Actionlistener() {
			public void actionPerformed(ActionEvent ae) {
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				l2.setText("Result:"+(n1-n2));
			}
		});
		
		b3.addActionListener(new Actionlistener() {
			public void actionPerformed(ActionEvent ae) {
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				l2.setText("Result:"+(n1*n2));
			}
		});
		
		b4.addActionListener(new Actionlistener() {
			public void actionPerformed(ActionEvent ae) {
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				l2.setText("Result:"+(n1/n2));
			}
		});
	}
	
}

class calc{
	public static void main(String[] args) {
		simp s = new simp();
		s.setBounds(400,200,400,250);
		s.setVisible(true);
	}
}