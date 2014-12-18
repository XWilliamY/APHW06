import java.util.*;

public class sorts extends SuperArray{

    public static void main(String[]args){
	sorts A = new sorts();
	A.add("yes");
	A.add("no");
	A.add("zebra");
	A.add("elephant");
	A.selectionSort();
	System.out.println(A.toString());
	sorts B = new sorts();
	B.add("zombie");
	B.add("elephant");
	B.add("apple");
	B.add("cancer");
	B.bubbleSort();
	System.out.println(B.toString());
    }

    public static String name(){
	return "Yang,William";
    }

    public static int period(){
	return 6;
    }


    public void insertionSort(){
	String s = "";
	if(size() > 1){
	    for(int i = 1; i < size(); i++){
		if(get(i).compareTo(get(i-1)) < 0){
		    s = get(i);
		    int r = i;
		    while(r> 0 &&s.compareTo(get(r-1)) < 0){
			set(r,get(r-1));
			r--;
		    }
		    set(r,s);
		}
	    }
	}
    }

    public void selectionSort(){
	String smallestWord;
	int min = 0;
	for(int i = 0; i < size(); i++){
	    smallestWord = get(i);
	    min = i;
	    for(int a = i; a < size(); a++){
		if(get(a).compareTo(smallestWord) < 0){
		    smallestWord = get(a);
		    min = a;
		}
	    }
	    set(min, get(i));
	    set(i, smallestWord);
	}

    }

    public void bubbleSort(){
	// two fors
	for(int i  = 0; i < size(); i++){
	    //9,8,7,6,5,4,3 -> seven 
	    //9 will go through all of the list
	    //8,7,6,5,4,3,|9 -> six but still starting at 0
	    //once 'end' matches size() = |3,4,5,6,7,8,9
	    for(int a = i+1; a < size(); a++){
		if(get(i).compareTo(get(a)) > 0){
		    String original = get(i);
		    set(i, get(a));
		    set(a, original);
		}
	    }
	}
    }

    public void radix(int[]c){
	//array of length ten
	//will have Arraylists inside it
	ArrayList<ArrayList<Integer>> digits = new ArrayList<ArrayList<Integer>>(10);
	for(int i = 0; i < digits.size();i++){
	    ArrayList<Integer> vertical = new ArrayList<Integer>();
	    digits.add(i, vertical);
	}
	for(int i = 0; i < c.size();i++){
	    System.out.println(i);
	}


    }
}