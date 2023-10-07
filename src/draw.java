import java.awt.*;
import java.awt.event.*;

public class draw extends Frame implements ActionListener{
	Frame f;
	public draw(Frame f1)
	{
		this.f=f1;
		f.show();
		Button b1=new Button("Close");
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.show();
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		Frame ff=new Frame();
		draw d=new draw(ff);
		d.setSize(400, 500);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.hide();
		System.exit(0);
	}

}
