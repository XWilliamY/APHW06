import javax.swing.*;

public class convert extends JFrame{
    public convert(){
	this.setTitle("My first GUI");
	this.setSize(600, 100);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
	convert g = new convert();
	g.setVisible(true);
    }
}