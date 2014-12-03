public class OrderedSuperArray extends SuperArray{

    public static void main(String[]args){
	OrderedSuperArray A = new OrderedSuperArray();
	System.out.println(A.toString());
	A.add("what");
	A.add("please");
	A.add("hello");
	A.add("A");
	A.add("what");
	A.add("nah");
	A.add("banana");
	System.out.println(A.toString());
    }

    public void add(String e){
	if(super.size() == 0){
	    super.add(e);
	}
	else{
	    int wordBefore = 0;
	    for(int i = 0; i < super.size(); i++){
		if(super.get(i).compareTo(e) >= 0){
		    super.add(i, e);
		    break;
		}
	    }
	}
    }


}