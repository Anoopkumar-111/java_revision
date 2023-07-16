package java_basics;

import java.util.*;

public class A4_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    List <Integer> list1= new ArrayList();  
	    List <Integer> list2 = new LinkedList();  
	    List <Integer> list3 = new Vector();  
	    List <Integer> list4 = new Stack();  
	    
	    
	    list1.add(1);
	    list1.add(2);
	    list1.add(3);
	    list1.add(4);
	    list1.add(5);
	    
	    
//	      In summary, 
//	      using List<String> provides flexibility and easier maintainability, 
//	     while ArrayList<String> gives you access to specific methods 
//	      and features of the ArrayList class. 
//	      Consider your program's needs and choose the 
//	      appropriate option accordingly.
//	      
	      
	    
	    Iterator itr=list1.iterator();  
	    
	    while(itr.hasNext()){  
	    	System.out.println(itr.next());  
	    }  
	    

	}

}
