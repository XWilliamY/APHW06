public class Driver{
    public static void main(String[]args){
	SuperArray A = new SuperArray();
	Integer x = new Integer(1);
       	A.add(x);
	A.add(new Integer(2));
	A.add(new Integer(3));
	A.add(new Integer(4));
	A.add(new Integer(5));
	A.add(new Integer(6));
	A.add("Seven");
	A.add(new Integer(8));
	A.add("Nine");
	A.add("Ten");
	System.out.println(A.size());
	System.out.println(A.toString());
	A.clear();
	System.out.println(A.size());
	System.out.println(A.toString());
	A.add("One");
	System.out.println(A.size());
	System.out.println(A.toString());
	A.add("Two");
	A.add("three");
	A.add("four");
	A.resize(2);
	System.out.println(A.toString());
	A.resize(10);
	A.add("four");
	A.add("five");
	System.out.println(A.toString());
	System.out.println(A.get(2));
	System.out.println(A.get(5));
	A.set(0, "This is five");
	A.set(5, "This is six");
	System.out.println(A.toString());
    }
}
