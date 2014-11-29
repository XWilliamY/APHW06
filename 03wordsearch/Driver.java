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
	    else if(args.length ==3){
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		int seed = Integer.parseInt(args[2]);
		WordGrid2 w = new WordGrid2(rows, cols);
		w.setSeed(seed);
		w.loadWordsFromFile("readThis.txt", true);
		System.out.println(w.wordsInPuzzle());
		System.out.println(w.toString());
	    }
	    else if(args.length == 4){
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		int seed = Integer.parseInt(args[2]);
		int answer = Integer.parseInt(args[3]);
		WordGrid2 w = new WordGrid2(rows, cols);
		w.setSeed(seed);
		if(answer == 1){
		    w.loadWordsFromFile("readThis.txt", false);
		}
		else{
		    w.loadWordsFromFile("readThis.txt", true);
		}
		System.out.println(w.wordsInPuzzle());
		System.out.println(w.toString());
	    }
	}
	else{
	    System.out.println("Proper Usage is: java Driver rows cols randomSeed answers");
	    System.exit(0);
	}
       
    }
}