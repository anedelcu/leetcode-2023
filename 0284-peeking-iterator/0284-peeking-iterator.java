// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> iterator;
    private Integer el;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        this.el  = null;
       
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(this.el == null && iterator.hasNext()) {
            el = iterator.next();
        }
        return el;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(el != null) {
            Integer newEl = el;
            el = null;
            return newEl;
        }
	    return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
	    if(el != null || iterator.hasNext()) {
            return true;
        }
        return false;
	}
}