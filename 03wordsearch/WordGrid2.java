import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordGrid2{

    private char[][]data;
    private ArrayList<String> wordsUsed = new ArrayList<String>();
    private String theWords = "\nFind these words: \n";
    Random rand = new Random();

    public WordGrid2(int rows, int cols){
	data = new char[rows][cols];
	clear();
    }

    private void clear(){
	for(int i = 0; i < data.length;i++){
	    for(int a = 0; a < data[i].length;a++){
		data[i][a] = ' ';
	    }
	}
    }

    public String toString(){
	String answer = "";
	for(int i = 0; i < data.length;i++){
	    for(int a = 0; a < data[i].length;a++){
		answer += data[i][a];
	    }
	    answer += "\n";
	}
	return answer;
    }

   public boolean checkWord(String word, int row, int col, int dx, int dy){
	//check if movement
	if((dx!=0 || dy != 0) &&
	   //check if index is at least 0 
	   row >= 0 && col >= 0 && 
	   //check if index isn't exactly data.length
	   row != data.length && col != data[0].length &&
	   //check if row/col + dx/dy * word.length() is at least 0 
	   row + dy*word.length() >= 0 && 
	   col + dx*word.length() >= 0 &&
	   //check if row/col + dx/dy*word.length() fits in a WordGrid
	   row + dy*word.length() <= data.length &&
	   col + dx*word.length() <= data[0].length
	   ){
	    for(int a = 0; a < word.length();a++){
		char Letter = word.charAt(a);
		if(data[row][col] != Letter && data[row][col] != ' '){
		    return false;		
		}
		row += dy;
		col += dx;
	
	    }
	    return true;
	}
	else{
	    return false;
	}
    }


    public boolean add(String word, int row, int col, int dx, int dy){
	if(checkWord(word, row, col, dx, dy)){
	    for(int a = 0; a < word.length();a++){
		char Letter = word.charAt(a);
		if(data[row][col] == Letter || data[row][col] == ' '){
		    data[row][col] = Letter;
		}
		row += dy;
		col += dx;
	    }
	    return true;
	}
	else{
	    return false;
	}
    }


    public void loadWordsFromFile(String fileName, boolean fillRandomLetters)throws FileNotFoundException{
	File text = new File(fileName);
	Scanner sc = new Scanner(text);
	ArrayList<String> list = new ArrayList<String>();
	while(sc.hasNext()){
	    list.add(sc.next());
	}
	for(int i = 0; i < 11;){
	    int Rol = rand.nextInt(data.length);
	    int Col = rand.nextInt(data[0].length);
	    int Dx = rand.nextInt(3) - 1;
	    int Dy = rand.nextInt(3) - 1;
	    int where = rand.nextInt(list.size());
	    if(add(list.get(where), Rol, Col, Dx, Dy)){
		wordsUsed.add(list.get(where));
		list.remove(list.get(where));
		i++;
	    }    
	}

	if(fillRandomLetters){
	    for(int a = 0; a < data.length; a++){
		for(int b = 0; b <data[0].length;b++){
		    if(data[a][b] == ' '){
			data[a][b] = (char)(rand.nextInt(26) + 'a');
		    }
		}
	    }
	}
	else{
	    for(int a = 0; a < data.length;a++){
		for(int b = 0; b < data[0].length; b++){
		    if(data[a][b] == ' '){
			data[a][b] = '_';
		    }
		}
	    }
	}
    }

    public String wordsInPuzzle(){
	for(int i = 0; i < wordsUsed.size(); i++){
	    theWords += wordsUsed.get(i) + "   ";
	    if((i+1)%5 == 0){
		theWords += "\n";
	    }
	}
	return theWords;
    }

    public void setSeed(long seed){
	rand = new Random(seed);
    }

}
