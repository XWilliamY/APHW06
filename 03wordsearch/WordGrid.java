import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class WordGrid{

    public static void main(String[]args)throws FileNotFoundException{
	WordGrid data, what;
	data = new WordGrid(20,20);
	what = new WordGrid(10, 10);
	data.loadWordsFromFile("readThis.txt", true);
	//making a random 
	Random rand = new Random();
	System.out.println(data.toString());
	data.loadWordsFromFile("readThis.txt", true);
    }	

    
    private char[][]data;
    private String wordsUsed;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */

    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	clear();
    }


    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for(int i = 0; i< data.length;i++){
	    for(int a = 0; a<data[i].length;a++){
		data[i][a] = '_';
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */

    public String toString(){
	String answer = "";
	for(int i = 0; i<data.length;i++){
	    for(int a = 0; a<data[i].length;a++){
		answer += data[i][a];
	    }
	    answer += "\n";
	}
	return answer;

    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical location of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */

    public boolean addWordHorizontal(String word, int row, int col){
	/* So how should we add a word horizontally to WordGrid?
	   1. Check if the row is out of bounds
	   2. Check that the col exists
	   3. Check that the word isn't longer than col
	   4. Check that, if there are any letters already there, that they're the same
	*/

	if(row < data.length && row >= 0){ // is it within the rows permitted by WordGrid?
	    if(col >= 0 && word.length() <= (data[row].length - col)){ // is the word shorter than col?  
		for(int a = 0; a < word.length(); a++){
		    char LetterOfWord = word.charAt(a);
		    if(data[row][col] == '_' || data[row][col] == LetterOfWord){
			data[row][col] = LetterOfWord;
		    }
		    else{
			return false;
		    }
		    col ++;
		}
	    }
	    else{
		return false;
	    }
	    return true;
	}
	else{
	    return false;
	}
    }

    public boolean addWordVertical(String word, int row, int col){
	//check that the length of the word doesn't surpass the number of rows there are 
	//check that the column exists 
	//check that, if there are any letters already there, that they're the same 

	if(row >= 0 && word.length() <= data.length - row){ // does the word surpass the # of rows?
	    if(col >= 0 && col < data[0].length){

		for(int a = 0; a < word.length();a++){
		    char LetterOfWord = word.charAt(a);
		    if(data[row][col] == '_' || data[row][col] == LetterOfWord){
			data[row][col] = LetterOfWord;
		    }
		    else{
			return false;
		    }
		    row ++;
		}
	    }
	    return true;
	}
	else{
	    return false;
	}
    }

    public boolean addWordDiagonal(String word, int row, int col){
	//check that the length of the word doesn't surpass BOTH rows and columns 
	//check that the rows/ cols arne't out of range 
	//chec that the letters fall on empty spaces/ letters that are the same
	if(row >= 0 && word.length() <= data.length - row){
	    if(col >= 0 && word.length() <= data[row].length - col){
		for(int a = 0; a<word.length();a++){
		    char LetterOfWord = word.charAt(a);
		    if(data[row][col] == '_' || data[row][col] == LetterOfWord){
			data[row][col] = LetterOfWord;
		    }
		    else{
			return false;
		    }
		row++;
		col++;
		}
	    }
	    return true;
	}
	else{
	    return false;
	}
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
		if(data[row][col] != Letter && data[row][col] != '_'){
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
		if(data[row][col] == Letter || data[row][col] == '_'){
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
	Random rand = new Random();
	File text = new File(fileName);
	Scanner sc = new Scanner(text);
	ArrayList<String> list = new ArrayList<String>();
	while(sc.hasNext()){
	    list.add(sc.next());
	}
	for(int i = 0; i < 30; i++){
	    int Rol = rand.nextInt(data.length);
	    int Col = rand.nextInt(data[0].length);
	    int Dx = rand.nextInt(3) - 1;
	    int Dy = rand.nextInt(3) - 1;
	    int where = rand.nextInt(list.size());
	    if(add(list.get(where), Rol, Col, Dx, Dy)){
		wordsUsed += (list.get(where))+ " ";
	    }    
	}
	System.out.println(wordsUsed);
    }
}


 

