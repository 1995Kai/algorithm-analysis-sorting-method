package sort;

import java.util.List;

public class Insertion_Sort implements Sorting_Strategy {
	@Override
	public void sort(List<String> unsortedList){
		int listLength = unsortedList.size();  
	     for (int j = 1; j < listLength; j++) {  
	    	 String temp = unsortedList.get(j);  
	    	 int i = j-1;  
	    	 while ( (i > -1) && ( unsortedList.get(i).compareTo(temp) > 0 ) ) {  
	    		 unsortedList.set(i+1, unsortedList.get(i));  
	    		 i--;  
	    	 }
	    	 unsortedList.set(i+1, temp); 
	     } 
	}
}
