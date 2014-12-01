import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class read{

    public static void main(String[]args)throws FileNotFoundException{
	File text = new File("readThis.txt");
	Scanner scnr = new Scanner(text);
	ArrayList<String> list = new ArrayList<String>();
	while(scnr.hasNext()){ // while there is another line 
	    list.add(scnr.next());
	}
	System.out.println(list.toString());
    }
 
}