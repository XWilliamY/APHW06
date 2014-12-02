public class OrderedSuperArray extends SuperArray{
    public static void main(String[]args){
	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A.toString());
	A.add("Hello");
	System.out.println("yes");
	A.add("Goodbye");
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
	int cne = getcNe();
    }




}