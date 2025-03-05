import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;
import java.util.*;

public class HashTableRunner
{
  public static void main ( String[] args )
  {
/**
Createing scanner to read the numbers.dat file
*/
      String filePath = "numbers.dat";
      File file = new File(filePath);
      int bucketNum  = 10;
		//Scanner bum = new Scanner(file);
		try(Scanner bum = new Scanner(file)){
		    System.out.println("LOOKING FOR FILE...");
			//make a new table		
			Hashtable<Integer, LinkedList<Integer>> hashTab = new Hashtable<>();
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for (int i = 0; i < bucketNum; i++){
			    hashTab.put(i, new LinkedList<>());
			}
			//read from the file
			while (bum.hasNextLine()){
			    String line = bum.nextLine().trim();
			    //ignoring empty lines
			    if (!line.isEmpty()){
			        int lum = Integer.parseInt(line);
                    int bucketInd = lum % bucketNum; // Determine bucket
                    hashTab.get(bucketInd).add(lum);
			    }
			}
			
			System.out.println("HashTable Buckets:");
            for (int j = 0; j < bucketNum; j++) {
                System.out.println("Bucket " + j + ": " + hashTab.get(j));
            }
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
			System.out.println(e.getMessage());
		}
  }
}
