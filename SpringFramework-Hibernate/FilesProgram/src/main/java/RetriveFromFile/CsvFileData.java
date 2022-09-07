package RetriveFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFileData {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("C:\\Users\\hk21398\\Documents\\New folder\\file.txt"));
		sc.useDelimiter(",");
		while(sc.hasNext()){
			System.out.println(sc.next());
		}
		
		sc.close();

	}

}
