import java.util.*;

public class arrayListMethods{

    public static void collapseDuplicates(ArrayList<Integer> L){
	for(int i = 1; i < L.size(); i++){
	    if(L.get(i) == L.get(i-1)){
		L.remove(i-1);
		i = 0;
	    }
	}
    }

    public static void randomize(ArrayList<Integer> L){
	Random rand = new Random();
	for(int i = 0; i < L.size(); i++){
	    //what you want to do is go through each index, and assign them to
	    //another random one 
	    //i will be our 'oldIndex'
	    int newIndex = rand.nextInt(L.size());
	    //we have our new index here 
	    int oldElement = L.get(i);
	    int newElement = L.get(newIndex);
	    L.set(i, newElement);
	    L.set(newIndex, oldElement);
	}
    }


    public static void main(String[]args){
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	for(int i = 0; i < 9; i++){
	    list.add(10);
	}
	list.add(1);
	System.out.println(list.toString());
	collapseDuplicates(list);
	System.out.println(list.toString());
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	list2.add(0);
	list2.add(1);
	list2.add(2);
	list2.add(3);
	randomize(list2);
	System.out.println(list2.toString());
    }

}