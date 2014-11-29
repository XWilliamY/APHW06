import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Driver{

    public static void main(String[]args)throws FileNotFoundException{
	if(args.length >= 2){
	    System.out.println("Nice job!");
	    if(args.length == 2){ //if they don't give a randomseed and cheat number 
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		WordGrid2 w = new WordGrid2(rows, cols);
		w.loadWordsFromFile("readThis.txt", true);
		System.out.println(w.wordsInPuzzle());
		System.out.println(w.toString());
	    }
	}
	else{
	    System.out.println("Proper Usage is: java Driver rows cols randomSeed answers");
	    System.exit(0);
	}
       

	/*WordGrid2 w = new WordGrid2(20, 20);
	w.loadWordsFromFile("readThis.txt", true);
	System.out.println(w.wordsInPuzzle());
	System.out.println(w.toString());
	*/
    }
}