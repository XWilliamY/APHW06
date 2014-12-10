import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class convert extends JFrame implements ActionListener{
    private Container pane;
    private JButton Celsius, Fahrenheit;
    private JLabel l;
    private JTextField t;
    private Container buttons;
    private Container textyStuff;
    private JCheckBox box;

    public convert(){
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(600, 100);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2, 1));

	Celsius = new JButton("Convert to C");
	Fahrenheit = new JButton("Convert to F");
	l = new JLabel("Convert a value to Celsius or Fahrenheit:", null, JLabel.CENTER);
	t = new JTextField(12);

	Celsius.setActionCommand("Convert C");
	Celsius.addActionListener(this);
	Fahrenheit.setActionCommand("Convert F");
	Fahrenheit.addActionListener(this);

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(Celsius);
	buttons.add(Fahrenheit);

	textyStuff = new Container();
	textyStuff.setLayout(new FlowLayout());
	textyStuff.add(l);
	textyStuff.add(t);

	pane.add(textyStuff);
	pane.add(buttons);
    }

public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	//if action = celsius, do this

	//else, if action is this, convert to fahrenheit
    }


    public static void main(String[]args){
	convert g = new convert();
	g.setVisible(true);
    }
}