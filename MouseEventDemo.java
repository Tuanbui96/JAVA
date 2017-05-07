import java.awt.*;
import java.awt.event.*;
 
public class MouseEventDemo extends Frame implements MouseListener {
   private TextField tfMouseX; 
   private TextField tfMouseY; 
 
   
   public MouseEventDemo() {
      setLayout(new FlowLayout());
 
      // Label X
      add(new Label("X-Click: ")); 
 
      // TextField X
      tfMouseX = new TextField(10);
      tfMouseX.setEditable(false);  
      add(tfMouseX);  
 
   // Label Y
      add(new Label("Y-Click: "));
 
      // TextField Y
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false); 
      add(tfMouseY); 
   // xu li su kien cho mouse
      addMouseListener(this);
         
 
      setTitle("MouseEvent Demo"); 
      setSize(350, 100);        
      setVisible(true);        
   }
 
   public static void main(String[] args) {
      new MouseEventDemo(); 
   }
 
  
   public void mouseClicked(MouseEvent evt) {
      tfMouseX.setText(evt.getX() + "");
      tfMouseY.setText(evt.getY() + "");
   }
 
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
}