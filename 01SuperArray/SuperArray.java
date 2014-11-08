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
		oldData[i] = data[i]; //transfer all the data to new array
	    }
	    oldData[cNe] = e; //add the new element
	    data = new Object[capacity]; //reset data array
	    data = oldData; //transfer back to data
	    cNe ++;
	}
    }

    //overloaded add 
    public void add(int index, Object o){
	//if it's out of range, use the basic add function
	if(index < 0 || index >= size()){
	    add(o);
	}
	else{
	    if(cNe + 1 <= capacity){
		oldData = new Object[capacity]; //no need to increase size
	    }
	    else{
		capacity ++;
		oldData = new Object[capacity];
	    }

	//otherwise we'll inject it into the array at the index
	    // increase capacity if you can't add another element
	    for(int i = 0; i < index; i++){
		oldData[i] = data[i];
	    } 
	    oldData[index] = o;
	    cNe ++; 
	    for(int i = index; i <= cNe - 2; i++){
		oldData[i+1] = data[i]; 
	    }
	}
	data = new Object[capacity];
	data = oldData;
    }


    public int size(){
	return cNe;
    }

    public void resize(int newCapacity){
	oldData = new Object[newCapacity];// copy all values 
	for(int i = 0; i < cNe; i++){
	    oldData[i] = data[i];
	}
	data = new Object[newCapacity];
	data = oldData;
	capacity = newCapacity;
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

    //overloaded set 
    public Object set(int index, Object o){
	Object A;
	if(index < 0  || index >= size()){
	    System.out.println("ERROR: Index out of range");
	    return null;
	}
	else{
	    A = get(index);
	    data[index] = o;
	}
	return A;
    }

    
}
