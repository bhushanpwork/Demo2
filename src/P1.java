import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>() {
	    	 public int compare(Integer i1, Integer i2) {
	    			// TODO Auto-generated method stub
	    			return -i1.compareTo(i2);
	    		}
	     }
	     );
	     
	     ts.add(10);
	     ts.add(20);
	     ts.add(30);
	     ts.add(40);
	     ts.add(50);
	     System.out.println(ts);
	     for (Integer i : ts) {
			System.out.println(i);
		}
	}
} 


