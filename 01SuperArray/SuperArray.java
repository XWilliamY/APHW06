public class SuperArray{
    private Object[]data;
    private int cNe, capacity; // current number of elements 

    public SuperArray(){
	Object[] data = new Object[10];
	cNe = 0;
	capacity = 10;
    }

    public SuperArray(int capacity){
	Object[] data = new Object[capacity];
	cNe = 0;
	this.capacity = capacity;
    }

    public String toString(){
	String answer = "[";
	for(int i = 0; i < cNe;i++){
	    answer += " " + data[i];
	}
	answer += "]";
	return answer;
    }

    public void add(Object e){
	if(cNe < capacity){
	    data + e;
	    cNe += 1; 
	}
	else{
	    System.out.println("You've entered too many.");
	    }
    }

    public int size(){
	return cNe;
    }

}