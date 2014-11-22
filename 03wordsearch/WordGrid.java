public class WordGrid{

    public static void main(String[]args){
	WordGrid data, what;
	data = new WordGrid(10,10);
	what = new WordGrid(10, 10);
	System.out.println(data.toString());
	System.out.println(what.toString());
	what.addWordHorizontal("what", 0, 0);
	what.addWordHorizontal("ate", 0, 2);
	what.addWordHorizontal("ever", 0, 4);
	System.out.println(what.toString());
	what.clear();
	System.out.println(what.toString());
    }
    private char[][]data;

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
		data[i][a] = ' ';
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
	    if(col >= 0 && word.length() < (data[row].length - col)){ // is the word shorter than col?  
		for(int a = 0; a < word.length(); a++){
		    char LetterOfWord = word.charAt(a);
		    if(data[row][col] == ' ' || data[row][col] == LetterOfWord){
			data[row][col] = LetterOfWord;
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



}
