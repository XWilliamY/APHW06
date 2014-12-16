public class sorts extends SuperArray{

    public void bubbleSort(){
	//how bubbleSort works
	//9, 8, 7, 0, 1, 2, 3
	//9 > 8, swap, 9 > 7, swap, 9>0, swap, 9>1, swap...
	//8, 7, 0, 1, 2, 3, 9
	//7, 0, 1, 2, 3, 8, 9
	//kind of linear search 
	for(int i = 0; i < super.size(); i++){
	    System.out.println("yes");
	}
    }

    public static void main(String[]args){
	SuperArray A = new SuperArray();
	A.add("one");
	A.add("two");
