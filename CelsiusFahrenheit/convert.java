import javax.swing.*;
import java.awt.*;


public class convert extends JFrame{
    private Container pane;
    private JButton Celsius, Fahrenheit;
    private JLabel l;
    private JTextField t;
    public convert(){
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(600, 100);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	Celsius = new JButton("Convert to C");
	Fahrenheit = new JButton("Convert to F");
	l = new JLabel("Convert a value to Celsius or Fahrenheit:", null, JLabel.CENTER);
	t = new JTextField(12);
	pane.add(l);
	pane.add(Celsius);
	pane.add(Fahrenheit);
	pane.add(t);
    }




    public static void main(String[]args){
	convert g = new convert();
	g.setVisible(true);
    }
}