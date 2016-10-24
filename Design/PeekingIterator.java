import java.util.*;

//Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

	private Iterator<Integer> iterator;
	private Integer value;
	private boolean status;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		
		if(!status)
		{
			value = next();
			status = true;
		}

		return value;       
      
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	//	Override them if needed.
	@Override
	public Integer next() {
	    
	    if(status == true)
	    {	
	    	Integer res = value;
	    	value = null;
	    	status = false;
	    	return res;

	    }
	    else 
	    {
	    	return iterator.next();
	    }
		
	}

	@Override
	public boolean hasNext() {
	    return status || iterator.hasNext();
		
	}



	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		Iterator<Integer> iter = al.iterator();	


		PeekingIterator pk = new PeekingIterator(iter);

		// while(pk.hasNext()) 
		// {
  //       	Object element = pk.next();
  //        	System.out.print(element + " ");
		// }

		System.out.println(pk.peek());
		System.out.println(pk.next());
		System.out.println(pk.peek());
		// System.out.println(pk.hasNext());

        
	}
}