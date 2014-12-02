public class OrderedSuperArray extends SuperArray{
    public static void main(String[]args){
	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A.toString());
	A.add("cake");
	A.add("apple");
	A.add("cake");

	
	System.out.println(A.toString());
    }

    //if you add to the end/ beginning, swapping is all you need to do

    public void add(String e){
	/**So here's how we're going to do add
	 *First, we add it to the end. Swapping is better than inserting and making new arrays and what not.
	 *After we add it to the list, we want to see where it fits. We'll check it with each element. Since we're putting it where it fits, it doesn't matter what the user input is, since we're always going to put it at the end first.
	 *Anyways, we're going to run through each word to see where it belongs.
	 *So let's say adding "banana" to "apple" and "cake"
	 * b > a? yes. b > c? No. Perfect, it'll go here. 
	 *apple, cake, banana -> apple, banana,c ake
	 *What if it's equal?
	 *We'll move on to the second letter, third, whatever, until we reach the end of the shorter word. If the words are the same but nested, like "apple" and "applesauce", the shorter word goes first. 
	 *Let's get coding though.
	 **/ 

	super.add(e);
	int wordBefore = 0;
	int wordAfter = 0;
	int cne = getcNe(); //getting the number of elements afterwards 
	for (int i = 0; i < cne; i++){
	    if(super.get(i).equals(e)){//if they're equal
		//we want to put them next to each other 
		wordBefore = i;
		for(int a = cne - 1; a > wordBefore; a --){
		    System.out.println(a);
		    super.set(a, super.get(a-1));
		    super.set(a-1, e);
		}
		break;
	    }
	    //if the words aren't the same, they're either of the same sizes, or 
	    //one is larger than the other 
	    //we now want to find the "largest" word that is smaller than the target word
	    //and the "smallest" word that is larger than the target word 
	    if(e.length() == ((String)(super.get(i))).length()){
		for(int b = 0; b < e.length(); b++){
		    if( e.charAt(b) >(String)(super.get(i)).charAt(b)){
			wordBefore = b;
		    }
		    else if(e.charAt(b) < (String)(super.get(i)).charAt(b)){
			wordAfter = b;
		    }
		}
	    }
	    System.out.println(wordBefore);
	    System.out.println(wordAfter);
	}
    }
}
