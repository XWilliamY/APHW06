public class OrderedSuperArray extends SuperArray{
    public static void main(String[]args){
	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A.toString());
	A.add("Hello");
	A.add("Goodbye");
	System.out.println(A.toString());
    }

    //if you add to the end/ beginning, swapping is all you need to do

    public void add(String e){
	int cne = getcNe();
	super.add(e);
	/** Otherwise, what we'll do is we'll add it to the end first
	 *and then from there, we compare it to the elements already in the list
	 *and swap the words around until we reach its correct destination
	 */ 
    }



}