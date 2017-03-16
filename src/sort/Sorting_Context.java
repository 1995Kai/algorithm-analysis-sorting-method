package sort;

import java.util.List;

public class Sorting_Context {
	
	private Sorting_Strategy strategy;
	
	public void setSortingMethod(Sorting_Strategy strategy){
		this.strategy = strategy;
	}
	public Sorting_Strategy getStrategy(){
		return strategy;
	}
	public void sortList(List<String> unsortedList){
		strategy.sort(unsortedList);
	}
	
}
