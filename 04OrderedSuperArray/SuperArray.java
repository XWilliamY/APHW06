public class SuperArray{
    int size;
    String[] data;

    public SuperArray(){
	this(10);
    }

    public SuperArray(int startCapacity){
	size = 0;
	data = new String[ startCapacity ];
    }
		
    public String toString(){
	String res = "[";
	for(int i = 0; i < size; i++){
	    res += data[i];
	    if(i != size - 1){
		res += " ";
	    }
	}
	return res + "]";
    }

    public void add(String o){
	if(size() == data.length){
	    resize(size * 2);
	}
	data[ size ] = o;
	size++;
    }
    public void add(int index, String o){
	if(index < 0 || index > size() ){
	    throw new IndexOutOfBoundsException();
	}				
	if(size() == data.length){
	    resize( size * 2 );
	}
	for(int i = data.length - 1; i > index; i--){
	    data[i] = data[i - 1];
	}
	data[ index ] = o;
	size++;
    }

    public int size(){
	return size;
    }

    public void clear(){
	size = 0;
    }

    public void resize(int newCapacity){
	String[] newData = new String[newCapacity];
	int max = Math.min(newCapacity,size);
	for(int i = 0; i < max; i++){
	    newData[i]= data[i];
	}
	data = newData;
    }
		
    public String set(int index, String o){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String temp = data[index];
	data[index]= o;
	return temp;
    }

    public String get(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public String remove(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}

	String temp = data[index];
	while(index < size() - 1){
	    data[index] = data[index + 1];
	    index++;
	}
	size--;
	if(size < data.length / 4){
	    resize(data.length / 2);
	}
	return temp;
    }


    public void insertionSort(){
	String s = "";
	if(size() > 1){
	    for(int i = 1; i < size(); i++){
		if(get(i).compareTo(get(i-1)) < 0){
		    s = get(i);
		    int r = i;
		    while(r> 0 &&s.compareTo(get(r-1)) < 0){
			set(r,get(r-1));
			r--;
		    }
		    set(r,s);
		}
	    }
	}
    }

    public void selectionSort(){
	//find the smallest value n, bring it to a=0
	//find the n+1 value, bring it to a+1
	String smallestValue = get(0);
	String replaced = "";
	int where = 0;
	for(int i = 0; i < size();i++){//0, 1, 2, 3, 4
	    System.out.println("this is i");
	    System.out.println(i);
	    for(int a = i; a < size(); a++){//[00][01][02][03][04]
		if(get(a).compareTo(smallestValue) < 0){
		    smallestValue = get(a);
		    replaced = get(i);
		    System.out.println(replaced);
		    where = a;
		    System.out.println("this is a");
		    System.out.println(a);
		    //set(i, smallestValue);
		    //set(where, replaced);
		    System.out.println(toString());
		} //the new smallestValue will be the one there
		set(where, replaced);
		set(i, smallestValue);
	    }
	}
    }



    public int find(String target){
	int where = 0;
	for(int i = 0; i < size(); i++){
	    if(target.equals(get(i))){
		where = i;
		break;
	    }
	}
	return where;
    }


    public static void main(String[]args){
	SuperArray A = new SuperArray();
	for(int i = 0; i < 100000; i++){
	    A.add("" + i);
	}
	A.insertionSort();
	System.out.println(A);
    }




}