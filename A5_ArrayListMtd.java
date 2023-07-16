package java_basics;


import java.util.*;


public class A5_ArrayListMtd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		 
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		System.out.println(l1);
		
//		 Iterator itr=l1.iterator();  
		 
		 Iterator<Integer> itr=l1.iterator();  
		    
		    while(itr.hasNext()){  
		    	System.out.print(itr.next()+" - ");  
		    }  
		    
		    
//operation 1 		 ADDING AT SPECIFIC INDEX
		    
		    l1.add(0,999);
		    
		    System.out.println("");
		    
			System.out.println(l1);
			

			
// operation 2     ADDING ONE LIST IN ANOTHER LIST
			
			ArrayList<Integer> l2 = new ArrayList<Integer>();
			l2.add(11);
			l2.add(44);
			
			
			l2.addAll(1,l1);
//			l2.addAll(l1);
//			l2.addAll(0,l1);
			
			System.out.println(l2);
			
			

// operation 3 : REMOVE BY INDEX & VALUE  and by ITERATOR
			
			l2.remove(1);
			System.out.println(l2);
			
		    
		    l2.remove(Integer.valueOf(44));
			System.out.println(l2);
			
//			ArrayList<String> s1= new ArrayList<String>();
//			
//			s1.add("Anoop");
//			s1.add("Anoop2");
//			s1.add("Anoop3");
//			s1.add("Anoop4");
//			System.out.println(s1);
//			
//			s1.remove(String.valueOf("Anoop4"));
//			s1.remove(1);
//			System.out.println(s1);
			
		
	  
	        // Holds true till there is single element
	        // remaining in the object
	        
	        
	        ArrayList<Integer> l3 = new ArrayList<Integer>();
	        
	        l3.add(1);
	        l3.add(9);
	        l3.add(5);
	        l3.add(12);
	        l3.add(13);
	        l3.add(14);
	        l3.add(15);
	        
	        System.out.println("Before removing <10 : "+l3);
	        
	        
	        
	        Iterator<Integer> itr1 = l3.iterator();
	       
	        
	        while (itr1.hasNext()) {
	  
	            // Remove elements smaller than 10 using
	            int x = itr1.next();
	            if (x < 10)
	                itr1.remove();
	        }			
	        
	        
	        System.out.println("After removing <10 : "+l3);
	 
	        
			
// OPERATION 4 : SET vs ADD
//	        In summary, the difference between add(0, 99) and set(1, 89)
//	        is that add(0, 99) inserts the element 99 at the beginning of the list, 
//	        whereas set(1, 89) replaces the element at index 1 with the value 89.
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

	}

}
