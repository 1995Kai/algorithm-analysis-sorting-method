package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lexicographic_Order {
	
	public static void main(String[] args) {
		List<String> wordList;
		accessFile file = new accessFile();
		Sorting_Context context = new Sorting_Context();
		
		file.openInputFile();
		wordList = Arrays.asList(file.readFile());
		file.closeInputFile();
		
		Collections.shuffle(wordList);
		file.writeFile(wordList, "shuffledList");
		
		context.setSortingMethod(new Insertion_Sort());
		context.sortList(wordList);
		
		file.writeFile(wordList, "sortedList");
	}
}
