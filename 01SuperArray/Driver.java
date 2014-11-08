public class Driver{
    public static void main(String[]args){
	SuperArray A = new SuperArray();
	SuperArray B = new SuperArray(15);
	Integer a = new Integer(1);
	Integer b = new Integer(2);
	Integer c = new Integer(3);
	Integer d = new Integer(4);
	Integer e = new Integer(5);
	Integer f = new Integer(6);
	Integer g = new Integer(7);
	Integer h = new Integer(8);
	Integer i = new Integer(9);
	Integer j = new Integer(10);
	A.add(a);
	A.add(b);
	A.add(c);
	A.add(d);
	A.add(e);
	A.add(3, "three");
	A.set(0, "one");
	A.set(1, "two");
	System.out.println(A.get(3));
	System.out.println(A.size());
	System.out.println(A.toString());
	A.clear();
	System.out.println(A.toString());
    }
}
