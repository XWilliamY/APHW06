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
}
