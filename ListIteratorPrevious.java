package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

	public class ListIteratorPrevious {
	    public static void main(String[] args) {
	       List<Integer> list=new ArrayList<>();
	       list.add(1);
	       list.add(2);
	       list.add(3);
	       list.add(1);
	      //list.listIterator should have size mentioned else it will not give elements in output
	       
	     ListIterator<Integer> iter= list.listIterator(list.size());
	    while(iter.hasPrevious()) {
	    	int num=iter.previous();
	    	System.out.println(num);
	    }
	   
	    }
	
}
