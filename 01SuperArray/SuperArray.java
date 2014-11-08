public class SuperArray{
    private Object[]data;
    private Object[]oldData;
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
	if(cNe < capacity){ //if we didn't meet the capacity yet
	    data[cNe] = e; //add at 0, 1, 2, up to capacity - 1
	    cNe += 1;
	}
	else{
	    capacity += 1; //increase capacity 
	    // need to make a new data array with one more space at the end
	    oldData = new Object[capacity];
	    for(int i = 0; i < cNe; i++){
		oldData[i] = data[i];
	    }
	    oldData[cNe] = e;
	    data = new Object[capacity];
	    data = oldData;
	    cNe ++;
	}
    }

    public int size(){
	return cNe;
    }

    public void resize(int newCapacity){
	oldData = new Object[newCapacity];// copy all values 
	System.out.println(oldData.toString());
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
	if(index < 0 || index >= size()){
	    System.out.println("ERROR: Index out of range.");
	    return null;
	}
	else{
        return data[index];
	}
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
