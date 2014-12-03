public class SuperArray{
    private String[]data;
    private String[]oldData;
    private int cNe, capacity; // current number of elements 

    public SuperArray(){
	data = new String[10]; // max capacity ten
	cNe = 0; // it has 0 elements so far
	capacity = 10;
    }

    public SuperArray(int capacity){
	data = new String[capacity]; // max capacity @ capacity
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

    public void add(String e){
	if(cNe < capacity){ //if we didn't meet the capacity yet
	    data[cNe] = e; //add at 0, 1, 2, up to capacity - 1
	    cNe += 1;
	}
	else{
	    capacity += 1; //increase capacity 
	    // need to make a new data array with one more space at the end
	    oldData = new String[capacity];
	    for(int i = 0; i < cNe; i++){
		oldData[i] = data[i]; //transfer all the data to new array
	    }
	    oldData[cNe] = e; //add the new element
	    data = new String[capacity]; //reset data array
	    data = oldData; //transfer back to data
	    cNe ++;
	}
    }

    //overloaded add 
    public void add(int index, String o){
	//if it's out of range, use the basic add function
	if(index < 0 || index >= size()){
	    add(o);
	}
	else{
	    if(cNe + 1 <= capacity){
		oldData = new String[capacity]; //no need to increase size
	    }
	    else{
		capacity ++;
		oldData = new String[capacity];
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
	data = new String[capacity];
	data = oldData;
    }


    public String remove(int index){
	String B;
	if(index < 0  || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	else{
	    // remove that element, move everything to the left 
	    oldData = new String[capacity];
	    for(int i = 0; i < index; i++){
		oldData[i] = data[i]; // transfer from one to the other
	    }
	    //now we want to skip whatever's at the index
	    cNe --;
	    B = data[index];
	    for(int i = index +1; i < cNe; i++){
		oldData[i+1] = data[i];
	    }
	}
	data = new String[capacity];
	data = oldData;
	return B;
    }

    public int size(){
	return cNe;
    }

    public void resize(int newCapacity){
	oldData = new String[newCapacity];// copy all values 
	for(int i = 0; i < cNe; i++){
	    oldData[i] = data[i];
	}
	data = new String[newCapacity];
	data = oldData;
	capacity = newCapacity;
    }

    public void clear(){
	data = new String[capacity];
	cNe = 0;
    }

    public String get(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	else{
        return data[index];
	}
    }

    //overloaded set 
    public String set(int index, String o){
	String A;
	if(index < 0  || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	else{
	    A = get(index);
	    data[index] = o;
	}
	return A;
    }

    
}
