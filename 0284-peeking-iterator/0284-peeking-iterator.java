// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer element;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        this.element = null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(element == null && iterator.hasNext()) {
            element = iterator.next();
        }
        return element;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(element != null) {
            Integer newElement = element;
            element = null;
            return newElement;
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        if(element != null || iterator.hasNext()) {
            return true;
        }
        return false;
    }
}
