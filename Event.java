
import java.awt.*;
import java.awt.event.*;

public class Event extends Frame implements ActionListener {
	private Label lbinput;
	private Label lboutput;
	private TextField tfinput;
	private TextField tfoutput;
	private int sum;
	
	public Event (){
		
		setLayout(new FlowLayout());
		
		//Label dau vao`
		lbinput = new Label("Nhập một số nguyên: ");
		add(lbinput);
		// text field dau vao
		tfinput = new TextField(15);
		add(tfinput);
		
		// khi nhap 1 so vao tfinput
		// bam Enter se goi ham xử lý actionPerformed()
		tfinput.addActionListener(this);
		
		// label dau ra
		lboutput = new Label("      Số tích lũy: ");
		add(lboutput); 
		
		// text field dau ra
		tfoutput = new TextField(10);
		tfoutput.setEditable(false); // chi duoc doc
		add(tfoutput);
		
		setTitle("AWTAccumlator");
		setSize(350, 120);
		setVisible(true);
		
	}
	 public void actionPerformed(ActionEvent evtint) {
	      // lấy chuỗi nhập vào textfield input, chuyển thành kiểu 
	      int numberIn = Integer.parseInt(tfinput.getText());
	      sum += numberIn;      // Tich luy vao bien sum
	      tfinput.setText("");  // xoa chuoi trong tfinput
	      tfoutput.setText(sum + ""); // hien thi bien sum ra textfield dau ra
	                                  // chuyen int thanh chuoi
	   }

	public static void main(String[] args) {
		Event evt = new Event();
		// Thêm các sự kiên
		evt.addWindowListener(new WindowListener() {

	        public void windowClosing(WindowEvent e) {
	        	 System.exit(0);
	        }
	        
	        @Override 
	        public void windowOpened(WindowEvent e) {}

	        @Override 
	        public void windowClosed(WindowEvent e) {}

	        @Override 
	        public void windowIconified(WindowEvent e) {}

	        @Override 
	        public void windowDeiconified(WindowEvent e) {}

	        @Override 
	        public void windowActivated(WindowEvent e) {}

	        @Override 
	        public void windowDeactivated(WindowEvent e) {}
	        
	        

	    });
	}

}
