package test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Test{
	public <T> void test(T t) {
		 List<T> A = new ArrayList<>();
	     List<T> B = new ArrayList<>();

	        A.add(0);
	        A.add(1);
	        A.add(2);
	        A.add(1);
	        B.add(2);
	        B.add(2);
	        
	        
	        A.removeAll(B);

	        // Êä³öAÖĞÊ£ÓàÔªËØ
	        for (Object i :A){
	            System.out.println(i);
	        }
	}

	
}
