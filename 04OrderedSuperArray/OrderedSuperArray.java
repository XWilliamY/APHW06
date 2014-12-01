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
	super.add(e);
	int cne = getcNe();
	Object [] yes = getdata();
	/** Otherwise, what we'll do is we'll add it to the end first
	 *and then from there, we compare it to the elements already in the list
	 *and swap the words around until we reach its correct destination
	 */ 
	for(int i = 0; i < cne; i++){
	    if(yes[i].equals(e)){
		//swap until it's after or before the other word
		System.out.println("damn");
	    }
	    else{
		System.out.println("jk");
		//check if the letters start out the same 
		//if so move it
	    }
	}
    }



}