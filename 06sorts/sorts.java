public class sorts extends SuperArray{

    public void bubbleSort(){
	//how bubbleSort works
	//9, 8, 7, 0, 1, 2, 3
	//9 > 8, swap, 9 > 7, swap, 9>0, swap, 9>1, swap...
	//8, 7, 0, 1, 2, 3, 9
	//7, 0, 1, 2, 3, 8, 9
	//kind of linear search 
	for(int i = 0; i < super.size()-1; i++){
	    int originalO = super.get(i);
	    int newO = super.get(i+1);
	    int originalIndex = i;
	    int newIndex = i+1;
	    Boolean go = true;
	    while(go){
		if(originalO > newO){
		    //as long as the original value is greater, keep swapping
		    set(newIndex, originalO);
		    set(originalIndex, newO);
		    newIndex ++;
		    newO = super.get(newIndex);
		}
		else{
		    go = false;
		}
	    }
	}
    }

    public static void main(String[]args){
	sorts A = new sorts();
	A.add(1);
	A.add(2);
	A.bubbleSort();
    }
}
