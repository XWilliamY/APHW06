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

    //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    //[hello, goodbye, yes, no, apple, therefore]
    //hello switches with apple 
    //[apple, goodbye, yes, no, hello, therefore]
    //[apple, goodbye, yes, no, hellow, therefore]
    //[apple, goodbye, hello, no, yes, therefore]
    //[apple, goodbye, hello, no, therefore, yes]

    public void selectionSort(){
	String smallestWord;
	int min = 0;
	for(int i = 0; i < size(); i++){
	    smallestWord = get(i);
	    min = i;
	    for(int a = i; a < size(); a++){
		if(get(a).compareTo(smallestWord) < 0){
		    smallestWord = get(a);
		    min = a;
		}
	    }
	    set(min, get(i));
	    set(i, smallestWord);
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
	A.add("zombies");
	A.add("apple");
	A.add("banana");
	A.add("archaic");
	A.add("crazy");
	A.add("yes");
	A.add("work");
	A.add("this");
	A.add("does");
	System.out.println(A);
	A.selectionSort();
	System.out.println(A);
    }




}