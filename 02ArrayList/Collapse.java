import java.util.*;
public class Collapse{
    public static void main(String[]args){
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(new Integer(0));
	list.add(new Integer(1));
	list.add(new Integer(2));
	list.add(new Integer(3));
	list.add(new Integer(4));
	list.add(new Integer(5));
	list.add(new Integer(6));
	list.add(new Integer(7));
	list.add(new Integer(8));
	list.add(new Integer(9));
	System.out.println(list.toString());
	collapseDuplicates(list);
	System.out.println(list.toString());
    }

    public static void collapseDuplicates(ArrayList<Integer> L){
	int length = L.size();
	for(int i = 1; i < length; i++){
	    if(L.get(i) == L.get(i-1)){
		L.remove(i-1);
	    }
	}
     
    }

}