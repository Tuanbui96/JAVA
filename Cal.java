package caculator;

import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;


public class Cal extends Frame implements ActionListener {
	private TextField txt1, txt2, txt3;
	private Label lb1, lb2, lb3;
	private Button btn1, btn2, btn3, btn4;
	public Cal()
	{
		
		// Tạo đối tượng trong RAM
		Frame f= new Frame();
		// cài đặt một số thuộc tính
		f.setTitle("Calculator");
		f.setSize(280, 200);
		f.setLayout(new FlowLayout());
		// Label, Textfield a
		 lb1 = new Label("a");
		f.add(lb1);
		 txt1 =new TextField("", 30);
		f.add(txt1);
		// Label, Textfield b
		 lb2 = new Label("b");
		f.add(lb2);
		 txt2 =new TextField("", 30);
		f.add(txt2);
		Button btn1 =new Button("+");
		btn1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {
		int a= Integer.parseInt(txt1.getText());
		int b= Integer.parseInt(txt2.getText());
		int kq=a+b;
		txt3.setText(kq+"");
		}});
		f.add(btn1);
		Button btn2 =new Button("-");
		
		btn2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {
		int a= Integer.parseInt(txt1.getText());
		int b= Integer.parseInt(txt2.getText());
		int kq=a-b;
		txt3.setText(kq+"");
		}});
		
		f.add(btn2);
		Button btn3 =new Button("*");
		btn3.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {
		int a= Integer.parseInt(txt1.getText());
		int b= Integer.parseInt(txt2.getText());
		int kq=a*b;
		txt3.setText(kq+"");
		}});
		f.add(btn3);
		Button btn4 =new Button("/");
		btn4.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) {
		int a= Integer.parseInt(txt1.getText());
		int b= Integer.parseInt(txt2.getText());
		double a1= (int)a;
		double b1= (int)b;
		double kq=a1/b1;
		txt3.setText(kq+"");
		}});
		f.add(btn4);
		// lb3 = new Label("Kết Quả");
		// f.add(lb3);
		txt3 =new TextField("", 30);
		txt3.setEditable(false);
		f.add(txt3);
		
		
		// Các sự kiện
		f.addWindowListener(new WindowListener() {

	        public void windowClosing(WindowEvent e) {
	        	 System.exit(0);
	        }
	        
	       
	        public void windowOpened(WindowEvent e) {}

	       
	        public void windowClosed(WindowEvent e) {}

	    
	        public void windowIconified(WindowEvent e) {}

	  
	        public void windowDeiconified(WindowEvent e) {}

	     
	        public void windowActivated(WindowEvent e) {}

	     
	        public void windowDeactivated(WindowEvent e) {}
	           

	    });
	
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
	//	int a= Integer.parseInt(txt1.getText());
	//	int b= Integer.parseInt(txt2.getText());
	//	if (e.getSource() ==btn1)
	//	{
	//		 txt3.setText(Cong(a,b)+"");
	//	}
	//	if (e.getSource() ==btn2)
	//	{
	//		 txt3.setText(Tru(a,b)+"");
	//	}
	//	if (e.getSource() ==btn3)
	//	{
	//		 txt3.setText(Nhan(a,b)+"");
	//	}
	//	if (e.getSource() ==btn4)
	//	{
	//		 txt3.setText(Chia(a,b)+"");
	//	}
		
	} 
		
	//int Cong(int a, int b) {return a+b;}
	//int Tru(int a, int b) {return a-b;}
	//int Nhan(int a, int b) {return a*b;}
	//int Chia(int a, int b) {return a/b;}
	
	public static void main (String[] args)
	{
		Cal ca= new Cal();
	}
}
