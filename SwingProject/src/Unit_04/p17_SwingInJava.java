package Unit_04;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class p17_SwingInJava {

	public static void main(String[] args) {
		SwingInJava name = new SwingInJava();
	}

}

class SwingInJava extends JFrame
{
	JTable jt1;
	
	JComboBox jb1;
	
	JList list;
	
	JTextArea ta1;
	
	JTextField t1;
	JTextField t2;
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	
	JRadioButton r1;
	JRadioButton r2;
	
	ButtonGroup bg;
	
	JCheckBox c1;
	JCheckBox c2;
	
	SwingInJava()
	{
		
		String week[]= {"mon","tue","wed","thu","fri","sat","sun"};
		String data[][]= {{"1","tarun","50000"},{"2","rohan","40000"},{"3","shalabh","30000"}};
		String column[]={"id","name","salary"};
		
		ta1=new JTextArea(10,30);
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		
		l1=new JLabel("result");
		l2=new JLabel("result");
		l3=new JLabel("result");
		l4=new JLabel("result");
		
		r1=new JRadioButton("male");
		
		r2=new JRadioButton("female");
		
		bg=new ButtonGroup();
		
		c1=new JCheckBox("dancer");
		
		c2=new JCheckBox("singer");
		
		list=new JList<>(week);
		
		jb1=new JComboBox<>(week);
		
		jt1=new JTable(data,column);
		
		//add(list);
		add(jb1);
		add(jt1);
		add(ta1);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		
		add(r1);
		add(r2);
		bg.add(r1);
		bg.add(r2);
		add(l2);
		
		add(c1);
		add(c2);
		add(l3);
		add(l4);
		
		ActionListener al=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				String s2=t2.getText();
				
				int a1=Integer.parseInt(s1);
				int a2=Integer.parseInt(s2);
				
				if(e.getSource()==b1) {
					Integer sum=a1+a2;
					l1.setText(sum.toString());
				}
				if(e.getSource()==b2) {
					Integer sum=a1-a2;
					l1.setText(sum.toString());
				}
				if(e.getSource()==b3) {
					Integer sum=a1*a2;
					l1.setText(sum.toString());
				}
				if(e.getSource()==b4) {
					Integer sum=a1/a2;
					l1.setText(sum.toString());
				}
				if(r1.isSelected())
				{
					l2.setText("male");
				}
				if(r2.isSelected())
				{
					l2.setText("female");
				}
				if(c1.isSelected()) {
					l3.setText("is a Dancer!");
				}
				if(c2.isSelected()) {
					l3.setText("is a Singer!");
				}
				
				if(c2.isSelected() && c1.isSelected()) {
					l3.setText("is a Singer and a Dancer!");
				}
				
				
				if(list.getSelectedIndex() != -1) {
					String data = "Day selected: "+list.getSelectedValue();
					l4.setText(data);
				}
				
				if(jb1.getSelectedIndex() != -1) {
					String data = "Day selected: "+jb1.getSelectedItem();
					l4.setText(data);
				}
			}
		}; 
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(450,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
