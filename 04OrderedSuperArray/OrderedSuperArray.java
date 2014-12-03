import java.lang.Comparable;




public class OrderedSuperArray extends SuperArray{
    public static void main(String[]args){
	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A.toString());
	A.add("apple");
	A.add("apple");
	A.add("apple");
	System.out.println(A.toString());
    }


    //if you add to the end/ beginning, swapping is all you need to do

    public void add(String e){
	if(super.size() == 0){
	    super.add(e);
	}
	else{
	    for(int i = 0 ; i < super.size(); i++){
		if(super.get(i).compareTo(e) >= 0){
		    super.add(i, e);
		}
	    }
	}
    }
}