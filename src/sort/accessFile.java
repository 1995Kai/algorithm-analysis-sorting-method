package sort;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class accessFile {
	
	private Scanner x;
	private FileWriter y;
	private String rawData[] = new String[142301];
	
	public void openInputFile(){
		try{
			x = new Scanner(new File("wordList.txt"));
		}
		catch(Exception e){
			System.out.println("Invalid file name");
		}
	}
	
	public String[] readFile(){
		int i =0;
		while(x.hasNext()){
			rawData[i] = x.next();
			i++;
		}
		return rawData;
	}
	
	public void closeInputFile(){
		x.close();
	}

	public void writeFile(List<String> outputList, String fName){
		try{
			y = new FileWriter(fName + ".txt");
			for(String list: outputList){
				y.write(list);
				y.write("\n");
			}
			y.close();
		}
		catch(Exception e){
			System.out.println("Invalid approach");
		}
	}
}
