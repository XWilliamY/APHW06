import javax.swing.*;
import java.awt.*;


public class convert extends JFrame{
    private Container pane;
    private JButton Celsius, Fahrenheit, b;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
    public convert(){
	this.setTitle("My first GUI");
	this.setSize(600, 100);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	b = new JButton("Do Nothing");
	l = new JLabel("Convert a value to Celsius or Fahrenheit:", null, JLabel.CENTER);
	t = new JTextField(12);
	c = new JCheckBox("OVERCLOCK!!!");
	pane.add(l);
	pane.add(b);
	pane.add(t);
	pane.add(c);

    }

    public static void main(String[]args){
	convert g = new convert();
	g.setVisible(true);
    }
}