package cn.linkai.leetcode.c284;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

    private Integer peek=null;

    private Iterator<Integer> it;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.it=iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(peek==null){
            if(hasNext()) peek=it.next();
        }
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if(peek==null){
            if(hasNext()) return it.next();
        }else{
            Integer result=peek;
            peek=null;
            return result;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(peek==null){
            return it.hasNext();
        }else{
            return true;
        }
    }
}
