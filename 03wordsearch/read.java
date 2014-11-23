import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class read{

    public static void main(String[]args)throws FileNotFoundException{
	File text = new File("readThis.txt");
	Scanner scnr = new Scanner(text);
	ArrayList<String> list = new ArrayList<String>();

	int lineNumber = 1;
	String answer = "";
	while(scnr.hasNextLine()){ // while there is another line 
	    String line = scnr.nextLine();
	    for(int i = 0; i < line.length(); i++){
		if(!line.substring(i, i+1).equals(" ")){
		    answer += line.substring(i, i+1);
		}
		else{
		    break;
		}
	    }
	    list.add(answer);
	    lineNumber ++;
	    answer = "";
	}
	System.out.println(list.toString());
    }
 
}