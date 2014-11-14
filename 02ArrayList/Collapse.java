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
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(0);
	list2.add(0);
	list2.add(1);
	list2.add(1);
	list2.add(2);
	list2.add(0);
	ArrayList<Integer> list3 = new ArrayList<Integer>();
	for(int i = 0; i < 10; i++){
	    list3.add(10);
	}
	list3.add(11);
	System.out.println(list2.toString());
	collapseDuplicates(list2);
	System.out.println(list2.toString());
	System.out.println("list3");
	System.out.println(list3.toString());
	collapseDuplicates(list3);
	System.out.println(list3.toString());
    }

    public static void collapseDuplicates(ArrayList<Integer> L){
	for(int i = 1; i< L.size(); i++){
	    if(L.get(i) == L.get(i-1)){
		L.remove(i-1);
		i = 0;
	    }
	}
	
	    //well when you remove a duplicate, i shrinks doesn't it
	
     
    }

}