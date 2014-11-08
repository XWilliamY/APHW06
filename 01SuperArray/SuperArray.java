public class SuperArray{
    private Object[]data;
    private int cNe, capacity; // current number of elements 

    public SuperArray(){
	data = new Object[10]; // max capacity ten
	cNe = 0; // it has 0 elements so far
	capacity = 10;
    }

    public SuperArray(int capacity){
	data = new Object[capacity]; // max capacity @ capacity
	cNe = 0; // no elements
	this.capacity = capacity;
    }

    public String toString(){
	String answer = "[";
	for(int i = 0; i < cNe;i++){ // stops once we added all elements
	   answer += " " + data[i]+"; ";
	 }
	 answer += "]";
	 return answer;
    }

    public void add(Object e){
	if(cNe < capacity){ //you can put in things as long as you don't exceed
	    data[cNe] = e;
	    cNe += 1;
	}
	else{
	    System.out.println("You have exceeded the SuperArray's size.");
	}
    }

    public int size(){
	return cNe;
    }

    public void resize(int newCapacity){
	Object[] oldData = data;// copy all values 
	data = new Object[newCapacity]; // make new one with new capacity
	if(newCapacity < cNe){
	    cNe = newCapacity; //change only if the new size is smaller
	}
	for(int i = 0; i< cNe; i++){
	    //move from oldData to new data
	    data[i] = oldData[i];
	}
    }

    public void clear(){
	data = new Object[capacity];
	cNe = 0;
    }

    public Object get(int index){
        return data[index];
    }

    public void set(int index, Object e){
	if(index < cNe){
	    data[index] = e;
	    System.out.println("Passes here");
	}
	else{
	    data[cNe] = e;
	    System.out.println("Passes here");
	}
    }

}
